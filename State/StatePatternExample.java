package State;

public class StatePatternExample {
    public static void main(String[] args) {
        Document document = new Document();

        // Editing the document in draft state
        document.edit();    // Output: "Document is being edited."

        // Submitting the document for review
        document.submit();  // Output: "Document submitted for review."

        // Trying to edit in moderation state
        document.edit();    // Output: "Cannot edit document in moderation."

        // Approving the document, moving to published state
        document.approve(); // Output: "Document approved and published."

        // Attempting to edit a published document
        document.edit();    // Output: "Cannot edit a published document."
    }
}