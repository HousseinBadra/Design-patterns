package Template_Method;

public class Example {
    public static void main(String[] args) {
        System.out.println("Processing CSV file:");
        DataProcessor csvProcessor = new CSVDataProcessor();
        csvProcessor.processData();

        System.out.println("\nProcessing XML file:");
        DataProcessor xmlProcessor = new XMLDataProcessor();
        xmlProcessor.processData();
    }
}
