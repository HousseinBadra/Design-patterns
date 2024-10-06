package Builder.Comparators;

import Builder.File;
import Builder.Tools.Comparator;

public class SortBySize implements Comparator<File> {
    public int compare(File A, File B) {
        return A.getSize() < B.getSize() ? -1 : 1;
    }
}
