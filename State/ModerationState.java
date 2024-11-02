package State;

class ModerationState implements State {
    @Override
    public void edit(Document document) {
        System.out.println("Cannot edit document in moderation.");
    }

    @Override
    public void submit(Document document) {
        System.out.println("Document is already in moderation.");
    }

    @Override
    public void approve(Document document) {
        System.out.println("Document approved and published.");
        document.setState(new PublishedState());
    }

    @Override
    public void reject(Document document) {
        System.out.println("Document rejected and moved back to draft.");
        document.setState(new DraftState());
    }
}
