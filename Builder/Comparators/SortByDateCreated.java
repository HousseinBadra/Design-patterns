package Builder.Comparators;

import Builder.File;
import Builder.Tools.Comparator;

public class SortByDateCreated implements Comparator<File> {
    public int compare(File A, File B) {
        return A.getCreatedAt().compareTo(B.getCreatedAt()) > 0 ? 1 : -1;
    }
}
