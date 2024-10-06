package Builder;

import java.util.ArrayList;

public class FileSorter {
    public static void sortFile(ArrayList<File> arr, Algo<File> algorithm, Comparator<File> C) {
        algorithm.sort(arr, C);
    }
}
