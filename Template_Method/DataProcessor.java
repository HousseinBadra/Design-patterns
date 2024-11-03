package Template_Method;

abstract class DataProcessor {
    // Template method defining the workflow
    public final void processData() {
        loadData();
        parseData();
        processDataSpecificLogic();
        saveData();
    }

    // Concrete method shared across subclasses
    private void loadData() {
        System.out.println("Loading data from file...");
    }

    // Steps to be implemented by subclasses
    protected abstract void parseData();
    protected abstract void processDataSpecificLogic();

    // Concrete method shared across subclasses
    private void saveData() {
        System.out.println("Saving data to the database.");
    }
}
