package hard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MedianFinder {

    private List<Integer> vec;

    /**
     * initialize your data structure here.
     */
    public MedianFinder() {
        vec = new ArrayList<>();
    }

    public void addNum(int num) {
        vec.add(num);
    }

    public double findMedian() {
        Collections.sort(vec);
        int n = vec.size();
        return (n % 2 == 1 ? vec.get(n / 2) : (vec.get(n / 2 - 1) + vec.get(n / 2)) * 0.5);
    }

    public static void main(String[] args) {
        MedianFinder mf = new MedianFinder();
        mf.addNum(1);
        mf.addNum(2);
        System.out.println(mf.findMedian());
        mf.addNum(3);
        System.out.println(mf.findMedian());
    }

}
