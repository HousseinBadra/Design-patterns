package Builder.Tools;

import java.util.ArrayList;

public class Sorter<T> {
    public void sort(ArrayList<T> arr, Algo<T> algorithm, Comparator<T> C) {
        algorithm.sort(arr, C);
    }
}
