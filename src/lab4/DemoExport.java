package lab4;
import java.util.Scanner;

public class DemoExport {
    public static void main(String[] args) {

        Export milk = new Export("Milk", 100, 5, "PL", ExportType.FOOD);
        Export egg = new Export("Egg", 150, 2, "UA", ExportType.FOOD);

        try {
            // Клонуємо об'єкт
            Export clonedItem = (Export) egg.clone();
            // Виводимо інформацію про оригінальний об'єкт
            System.out.println("Original Item: ");
            egg.displayProduct();

            // Виводимо інформацію про клонований об'єкт
            System.out.println("Cloned Item: ");
            clonedItem.displayProduct();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        milk.setQuantity(1001);

        egg.getExportLabel();

        System.out.println(milk);
        System.out.println(egg);
        milk.displayProduct();
        milk.displayProductInUpperCase();
        System.out.println(egg.getExportLabel());


        System.out.println("Result of equals: " + milk.equals(egg));


        // Порівняння кількості за допомогою compareTo()
        System.out.println("Compare Object: ");
        int result = egg.compareTo(milk);
        if (result < 0) {
            System.out.println("Egg is less than Milk");
        } else if (result > 0) {
            System.out.println("Egg is greater than Milk");
        } else {
            System.out.println("Egg and Milk are equal");
        }

        ExportType[] exportTypes = ExportType.values();
        System.out.println("List of all elements of the ExportType enum class:");
        for (ExportType type : exportTypes) {
            System.out.println(type);
        }

//        Scanner scanner = new Scanner(System.in);
//
//        Export[] exports = new Export[3]; // Створення масиву для трьох об'єктів
//
//        // Ініціалізація об'єктів в масиві
//        for (int i = 0; i < 3; i++) {
//            System.out.println("Enter data for export #" + (i + 1) + ":");
//            System.out.print("Product Name: ");
//            String productName = scanner.nextLine();
//            System.out.print("Export Country: ");
//            String exportCountry = scanner.nextLine();
//            System.out.print("Quantity of Units: ");
//            int quantity = scanner.nextInt();
//            System.out.print("Unit Price (in hryvnia): ");
//            double unitPrice = scanner.nextDouble();
//            scanner.nextLine(); // перехід на новий рядок після введення числа
//            //створюємо об'єкт як елемент масиву за допомогою конструктора
//            exports[i] = new Export(productName, exportCountry, quantity, unitPrice);
//        }
//

//        // Виведення інформації про об'єкти в двох регістрах
//        for (int i = 0; i < 3; i++) {
//            System.out.println("\nData for export #" + (i + 1) + " (Uppercase):");
//            exports[i].displayExportInfoInUppercase();
//            System.out.println("\nData for export #" + (i + 1) + " :");
//            exports[i].displayExportInfo();
//        }

    }
}
