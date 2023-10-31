package lab2;

import java.util.Objects;

public class Export  {
    // Оголошуємо приватні поля класу Export
    private String productName;
    private String exportCountry;
    private int quantity;
    private double unitPriceInHryvnia;
    private static int  instanceCount = 0;// Статичне поле, яке відстежує кількість створених екземплярів класу.
    private int exportId;

    public void setProductName(String productName) {
        this.productName = productName;
    }
    public void setExportCountry(String exportCountry) {
        this.exportCountry = exportCountry;
    }

    public void setQuantity(int quantity) {
        if (quantity >= 0) {
            this.quantity = quantity;
        } else {
            System.out.println("Error: The quantity of units must be greater than or equal to 0.");
        }
    }

    public void setUnitPriceInHryvnia(double unitPriceInHryvnia) {
        if (unitPriceInHryvnia >= 0.0) {
            this.unitPriceInHryvnia = unitPriceInHryvnia;
        } else {
            System.out.println("Error: The unit price must be greater than or equal to 0.0.");
        }

    }

    public String getProductName() {
        return productName;
    }

    public String getExportCountry() {
        return exportCountry;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getExportId() {
        return exportId;
    }

    public double getUnitPriceInHryvnia() {
        return unitPriceInHryvnia;
    }

    /*
    Конструктори в Java є спеціальним блоком коду,
    схожим на метод, призначений для ініціалізації
    полів об'єкта при його створенні.
     */
    // Перший конструктор (за замовчуванням)
    public Export() {
        this.productName = "Unknown Product";
        this.exportCountry = "Unknown Country";
        this.quantity = -1;
        this.unitPriceInHryvnia = -0.0;
        instanceCount++;
        exportId = instanceCount;
    }

    //Конструктор класу Export
    public Export(String productName, String exportCountry, int quantity, double unitPriceInHryvnia) {
        this.productName = productName;
        this.exportCountry = exportCountry;
        //Встановлення перевірки для кількості товару, не може бути менше 0
        if (quantity >= 0) {
            this.quantity = quantity;
        } else {
            System.out.println("Error: The quantity of units must be greater than or equal to 0.");
        }
        //Встановлення перевірки для ціни товару, не може бути менше 0.0
        if (unitPriceInHryvnia >= 0.0) {
            this.unitPriceInHryvnia = unitPriceInHryvnia;
        } else {
            System.out.println("Error: The unit price must be greater than or equal to 0.0.");
        }
        instanceCount++; //При створенні об'єкту збільшуємо лічильник ІД товару
        exportId = instanceCount;//присвоюємо індивідуальний ІД для товару
    }

    //Метод для виведення інформації про товар
    public void displayExportInfo() {
        System.out.println("Export" +
                "productName='" + productName + '\'' + "\n"+
                "exportCountry='" + exportCountry + '\'' + "\n"+
                "quantity=" + quantity + "\n"+
                "unitPriceInHryvnia=" + unitPriceInHryvnia +"\n" +
                "exportId=" + exportId + "\n");
    }
    //Метод для виведення інформації про товар в верхньому регістрі
    public void displayExportInfoInUppercase() {
        System.out.println("EXPORT" + "\n"+
                "PRODUCT NAME = '" + productName.toUpperCase() + '\'' + "\n"+
                "EXPORT COUNTRY = '" + exportCountry.toUpperCase() + '\'' + "\n"+
                "QUANTITY = " + quantity + "\n"+
                "UNIT PRICE IN HRYVNIA = " + unitPriceInHryvnia +"\n" +
                "EXPORT ID = " + exportId + "\n");
    }
    //Метод для виведення всіх полів об'єкту
    @Override
    public String toString() {
        return "Export" + "\n"+
                "productName='" + productName + '\'' + "\n"+
                "exportCountry='" + exportCountry + '\'' + "\n"+
                "quantity=" + quantity + "\n"+
                "unitPriceInHryvnia=" + unitPriceInHryvnia +"\n" +
                "exportId=" + exportId + "\n";
    }

}