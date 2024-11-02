package State;

class Document {
    private State state;

    public Document() {
        // Initially, the document is in draft state
        state = new DraftState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void edit() {
        state.edit(this);
    }

    public void submit() {
        state.submit(this);
    }

    public void approve() {
        state.approve(this);
    }

    public void reject() {
        state.reject(this);
    }
}

