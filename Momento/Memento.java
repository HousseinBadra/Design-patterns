package Momento;

class Momento<T> {
    private T state;

    Momento(T state) {
        this.state = state;
    }

    T getState() {
        return this.state;
    }
}