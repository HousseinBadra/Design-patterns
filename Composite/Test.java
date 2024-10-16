package Composite;

public class Test {
    public static void main(String[] args) {
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");

        Folder folder = new Folder("My Folder");
        folder.add(file1);
        folder.add(file2);

        folder.display(); // Displays both the folder and the files inside it
    }
}
