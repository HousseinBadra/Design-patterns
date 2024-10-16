package Composite;

public class File implements Component {
    private String name;

    File(String name) {
        this.name = name;
    }
    @Override
    public void display() {
        System.out.println("File: " + this.name);
    }
}
