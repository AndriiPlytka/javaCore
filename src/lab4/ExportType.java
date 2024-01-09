package lab4;
public enum ExportType {
    FOOD("Food Products"),
    ELECTRONICS("Electronic Devices"),
    CLOTHING("Clothing"),
    AUTOMOBILES("Automobiles");

    private String description;

    ExportType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return description;
    }
}