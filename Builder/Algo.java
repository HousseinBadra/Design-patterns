package Builder;

import java.util.ArrayList;

public interface Algo<T> {
    void sort(ArrayList<T> arr, Comparator<T> C);
}
