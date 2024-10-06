package Builder;

public class File {
    File(int size, int numChars, String name, String createdAt) {
        this.size = size;
        this.numChars = numChars;
        this.name = name;
        this.createdAt = createdAt;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getNumChars() {
        return numChars;
    }

    public void setNumChars(int numChars) {
        this.numChars = numChars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    private int size;
    private int numChars;
    private String name;
    private String createdAt;
}
