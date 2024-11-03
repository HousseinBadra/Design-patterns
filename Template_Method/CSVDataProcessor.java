package Template_Method;

class CSVDataProcessor extends DataProcessor {
    @Override
    protected void parseData() {
        System.out.println("Parsing data as CSV format...");
        // CSV parsing logic here
    }

    @Override
    protected void processDataSpecificLogic() {
        System.out.println("Processing CSV data with specific business rules.");
        // Business logic specific to CSV data
    }
}

