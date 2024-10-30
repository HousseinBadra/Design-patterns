package Iterator;

import java.util.ArrayList;

public class ListIterator<T> implements Iterator<T> {

    private ArrayList<T> arr;
    private int currentIndex = 0;

    ListIterator(ArrayList<T> arr) {
        this.arr = arr;
    }

    @Override
    public void first() {
        this.currentIndex = 0;
    }

    @Override
    public T getCurrentItem() {
        return this.arr.get(currentIndex);
    }

    @Override
    public boolean isDone() {
        return currentIndex == this.arr.size() - 1;
    }

    @Override
    public void next() {
        if (!isDone())
            this.currentIndex++;

    }

}
