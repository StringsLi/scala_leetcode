package hard;

import java.util.PriorityQueue;

public class MedianFinderII {
    private PriorityQueue<Integer> lowPart;
    private PriorityQueue<Integer> highPart;
    int size;
    /** initialize your data structure here. */
    public MedianFinderII() {
        lowPart = new PriorityQueue<Integer>((x, y) -> y - x);  //最大堆
        highPart = new PriorityQueue<Integer>();
        size = 0;
    }

    public void addNum(int num) {
        size++;
        lowPart.offer(num);
        highPart.offer(lowPart.poll());
        if((size & 1) == 1){
            lowPart.offer(highPart.poll());
        }
    }

    public double findMedian() {
        if((size & 1) == 1){
            return (double) lowPart.peek();
        }else{
            return (double) (lowPart.peek() + highPart.peek()) / 2;
        }
    }

    public static void main(String[] args) {
        MedianFinderII mf = new MedianFinderII();
        mf.addNum(1);
        mf.addNum(2);
        System.out.println(mf.findMedian());
        mf.addNum(3);
        System.out.println(mf.findMedian());
    }

}
