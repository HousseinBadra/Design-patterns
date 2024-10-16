package Composite;

import java.util.ArrayList;

// Composite
class Folder implements Component {
    private String name;
    private ArrayList<Component> children = new ArrayList<>();
    
    public Folder(String name) {
        this.name = name;
    }
    
    public void add(Component entity) {
        children.add(entity);
    }
    
    public void remove(Component entity) {
        children.remove(entity);
    }
    
    @Override
    public void display() {
        System.out.println("Folder: " + name);
        for (Component child : children) {
            child.display();
        }
    }
}
