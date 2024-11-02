package State;

class DraftState implements State {
    @Override
    public void edit(Document document) {
        System.out.println("Document is being edited.");
    }

    @Override
    public void submit(Document document) {
        System.out.println("Document submitted for review.");
        document.setState(new ModerationState());
    }

    @Override
    public void approve(Document document) {
        System.out.println("Cannot approve a draft document.");
    }

    @Override
    public void reject(Document document) {
        System.out.println("Cannot reject a draft document.");
    }
}

