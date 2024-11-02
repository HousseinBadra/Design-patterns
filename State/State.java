package State;

interface State {
    void edit(Document document);

    void submit(Document document);

    void approve(Document document);

    void reject(Document document);
}
