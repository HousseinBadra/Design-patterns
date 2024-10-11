package Builder;

import java.util.ArrayList;

import Builder.Algos.BubbleSort;
import Builder.Comparators.SortByDateCreated;
import Builder.Tools.Algo;
import Builder.Tools.Comparator;

public class ProgramTest {
    public static void main(String args[]) {

        ArrayList<File> arr = new ArrayList<>();
        arr.add(new File(345, 34, "C++", "2024-07-31"));
        arr.add(new File(1499, 150, "Algo", "2022-12-05"));
        arr.add(new File(39, 11, "Design", "2023-05-17"));
        arr.add(new File(32, 300, "War", "1999-01-18"));

        Comparator<File> C = new SortByDateCreated();
        Algo<File> algo = new BubbleSort<File>();
        FileSorter fs = new FileSorter();
        fs.sort(arr, algo, C);

        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i).getName());
        }

    }
}
