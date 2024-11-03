package Template_Method;

class XMLDataProcessor extends DataProcessor {
    @Override
    protected void parseData() {
        System.out.println("Parsing data as XML format...");
        // XML parsing logic here
    }

    @Override
    protected void processDataSpecificLogic() {
        System.out.println("Processing XML data with specific business rules.");
        // Business logic specific to XML data
    }
}

