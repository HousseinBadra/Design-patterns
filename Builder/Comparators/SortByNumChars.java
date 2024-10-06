package Builder.Comparators;

import Builder.File;
import Builder.Tools.Comparator;

public class SortByNumChars implements Comparator<File> {
    public int compare(File A, File B) {
        return A.getNumChars() > B.getNumChars() ? 1 : -1;
    }
}
