package Builder.Comparators;

import Builder.File;
import Builder.Tools.Comparator;

public class SortAZ implements Comparator<File> {
    public int compare(File A, File B) {
        return A.getName().compareTo(B.getName()) > 0 ? 1 : -1;
    }
}
