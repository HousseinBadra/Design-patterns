package Builder.Algos;

import Builder.Tools.Algo;
import Builder.Tools.Comparator;

import java.util.ArrayList;

public class BubbleSort<T> implements Algo<T> {
    public void sort(ArrayList<T> arr, Comparator<T> C) {
        int n = arr.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Swap if the element found is greater than the next element
                if (C.compare(arr.get(j), arr.get(j + 1)) == 1) {
                    // Swap arr[j] and arr[j+1]
                    T temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                }
            }
        }
    }
}
