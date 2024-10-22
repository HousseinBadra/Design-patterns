package Proxy;

public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    private void loadFromDisk(String fileName) {
        // Simulate a long loading process
        System.out.println("Loading " + fileName);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(fileName + " loaded");
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }
}
