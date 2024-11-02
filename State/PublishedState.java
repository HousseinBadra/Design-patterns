package State;

class PublishedState implements State {
    @Override
    public void edit(Document document) {
        System.out.println("Cannot edit a published document.");
    }

    @Override
    public void submit(Document document) {
        System.out.println("Document is already published.");
    }

    @Override
    public void approve(Document document) {
        System.out.println("Document is already approved.");
    }

    @Override
    public void reject(Document document) {
        System.out.println("Cannot reject a published document.");
    }
}
