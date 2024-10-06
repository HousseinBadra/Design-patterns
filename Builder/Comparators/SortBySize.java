package Builder.Comparators;

import Builder.Comparator;
import Builder.File;

public class SortBySize implements Comparator<File> {
    public int compare(File A, File B) {
        return A.getSize() < B.getSize() ? -1 : 1;
    }
}
