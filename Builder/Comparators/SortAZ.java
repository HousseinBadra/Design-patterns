package Builder.Comparators;

import Builder.Comparator;
import Builder.File;

public class SortAZ implements Comparator<File> {
    public int compare(File A, File B) {
        return A.getName().compareTo(B.getName()) > 0 ? 1 : -1;
    }
}
