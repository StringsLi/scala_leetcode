package list;

import java.util.Iterator;
import java.util.LinkedList;

public class Problem_284_PeekingIterator implements Iterator<Integer> {

    private LinkedList<Integer> queue;

    public Problem_284_PeekingIterator(Iterator<Integer> iterator){
        queue = new LinkedList<>();
        while (iterator.hasNext()){
            queue.add(iterator.next());
        }
    }

    public Integer peek(){
        return queue.peek();
    }

    @Override
    public boolean hasNext() {
        return !queue.isEmpty();
    }

    @Override
    public Integer next() {
        return queue.poll();
    }


}
