package Iterator;

public interface Iterator<T> {
     boolean isDone();
     void first();
     void next();
     T getCurrentItem();
}