package lab4;
import java.util.Objects;

public class Export extends AbstractProduct implements Exportable, Cloneable, Comparable<Export>{
    // Оголошуємо приватні поля класу Export
    private static int instanceCount = 0;// Статичне поле, яке відстежує кількість створених екземплярів класу.

    private String exportCountry;
    private final int exportId;

    private ExportType exportType;

    public Export(String productName, int quantity, double price, String exportCountry, ExportType exportType) {
        super(productName, quantity, price);
        this.exportCountry = exportCountry;
        this.exportId = ++instanceCount;
        this.exportType = exportType;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }

    public String getExportCountry() {
        return exportCountry;
    }

    public void setExportCountry(String exportCountry) {
        this.exportCountry = exportCountry;
    }

    public int getExportId() {
        return exportId;
    }

    public ExportType getExportType() {
        return exportType;
    }

    public void setExportType(ExportType exportType) {
        this.exportType = exportType;
    }

    @Override
    public void setQuantity(int quantity) {
        if (quantity > MAX_QUANTITY) {
            System.out.println("ERROR: max quantity " + MAX_QUANTITY + " exceeded");
            return;
        }
        super.setQuantity(quantity);
    }

    @Override
    public void displayProduct() {
        System.out.println(getExportLabel());
    }

    @Override
    public void displayProductInUpperCase() {
        System.out.println(getExportLabel().toUpperCase());
    }

    @Override
    public String getExportLabel() {
        return "Label # " + exportId + "\n" +
                "product name: " + productName + "\n" +
                "quantity: " + quantity + "\n" +
                "export type: " + exportType + "\n" +
                "export country: " + exportCountry + "\n" +
                "Amount export : " + calcAmount() + " UAH "+ "\n";
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    @Override
    public int compareTo(Export otherExport) {
        // Порівнюємо за полем exportId
        return Integer.compare(this.quantity, otherExport.quantity);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Export export = (Export) o;
        return exportId == export.exportId && Objects.equals(exportCountry, export.exportCountry) && exportType == export.exportType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), exportCountry, exportId, exportType);
    }

    @Override
    public String toString() {
        return  "Export" + "\n"+
                "exportCountry='" + exportCountry + '\'' + "\n"+
                "exportId=" + exportId + "\n"+
                "exportType=" + exportType + "\n"+
                super.toString();
    }
}