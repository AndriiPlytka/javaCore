package lab2;

import java.util.Collections;
import java.util.Scanner;

public class DemoExport {
    public static void main(String[] args) {

//        Export export1 = new Export();
//        export1.setExportCountry("Ukraine");
//        export1.setQuantity(200);
//        export1.setUnitPriceInHryvnia(-100);
//        export1.displayExportInfo();
//        Export export2 = new Export("Milk", "Poland", 10, 25.99);
//        export2.displayExportInfo();
//        export2.displayExportInfoInUppercase();
//        Export export3 = new Export();
//        export3.setExportCountry("Ukraine");
//        export3.setQuantity(200);
//        export3.setUnitPriceInHryvnia(30);
//        export3.displayExportInfo();
//        export1.displayExportInfoInUppercase();
//        System.out.println("Export Id: " + export1.getExportId());

        Scanner scanner = new Scanner(System.in);

        Export[] exports = new Export[3]; // Створення масиву для трьох об'єктів

        // Ініціалізація об'єктів в масиві
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter data for export #" + (i + 1) + ":");
            System.out.print("Product Name: ");
            String productName = scanner.nextLine();
            System.out.print("Export Country: ");
            String exportCountry = scanner.nextLine();
            System.out.print("Quantity of Units: ");
            int quantity = scanner.nextInt();
            System.out.print("Unit Price (in hryvnia): ");
            double unitPrice = scanner.nextDouble();
            scanner.nextLine(); // перехід на новий рядок після введення числа
            //створюємо об'єкт як елемент масиву за допомогою конструктора
            exports[i] = new Export(productName, exportCountry, quantity, unitPrice);
        }


        // Виведення інформації про об'єкти в двох регістрах
        for (int i = 0; i < 3; i++) {
            System.out.println("\nData for export #" + (i + 1) + " (Uppercase):");
            exports[i].displayExportInfoInUppercase();
            System.out.println("\nData for export #" + (i + 1) + " :");
            exports[i].displayExportInfo();
        }

    }
}
