import java.util.Scanner;

public class TestDocumentFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Select document type to create:");
        System.out.println("1. Word Document");
        System.out.println("2. PDF Document");
        System.out.println("3. Excel Document");
        System.out.print("Enter your choice (1-3): ");
        
        int choice = scanner.nextInt();
        Document document = null;

        switch (choice) {
            case 1:
                DocumentFactory wordFactory = new WordDocumentFactory();
                document = wordFactory.createDocument();
                break;
            case 2:
                DocumentFactory pdfFactory = new PdfDocumentFactory();
                document = pdfFactory.createDocument();
                break;
            case 3:
                DocumentFactory excelFactory = new ExcelDocumentFactory();
                document = excelFactory.createDocument();
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }

        if (document != null) {
            document.open();
        }

        scanner.close();
    }
}
