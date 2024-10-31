package Momento;

import java.util.ArrayList;

public class CareTaker<T> {
    private ArrayList<Momento<T>> stateArr = new ArrayList<Momento<T>>();

    void add(Momento<T> m) {
        this.stateArr.add(m);
    }

    Momento<T> getState(int index) {
        if(this.stateArr.isEmpty()) return new Momento<T>(null);
        Momento<T> last = this.stateArr.get(this.stateArr.size() -1);
        this.stateArr.remove(this.stateArr.size() -1);
        return last;
    }
}
