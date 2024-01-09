package lab4.lab6;

import lab4.Export;
import lab4.ExportType;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Export> hashSetExport = new HashSet<Export>();

        EnumMap<ExportType, Export> enumMap = new EnumMap<>(ExportType.class);

        Export exportMilk = new Export("Milk", 20, 12.50, "PL", ExportType.FOOD);
        Export exportEgg = new Export("Egg", 10, 1.50, "US", ExportType.FOOD);
        Export exportCar = new Export("Volvo", 5, 230000, "PL", ExportType.AUTOMOBILES);

        hashSetExport.add(exportMilk);
        hashSetExport.add(exportEgg);
        hashSetExport.add(exportCar);

        enumMap.put(ExportType.FOOD, exportMilk);

        enumMap.put(ExportType.AUTOMOBILES, exportCar);

        System.out.println("\n Display collection HashSet: \n");
        for (Export obj : hashSetExport) {
            System.out.println(obj.toString());
        }

        System.out.println("Some Methods of Set-----------------\n");
        System.out.println("Check if hashSet contains Volvo: " + hashSetExport.contains(exportCar));
        // Видалення елементу з HashSet
        hashSetExport.remove(exportCar);

        System.out.println("Check if hashSet contains Volvo: " + hashSetExport.contains(exportCar));

        System.out.println("Print collection HashSet without Volvo: \n");
        for (Export obj : hashSetExport) {
            System.out.println(obj.toString());
        }

        System.out.println("Some Methods of Set-----------------\n");
        System.out.println("Size of collection before clear: " + hashSetExport.size());
        // Очищення HashSet
        hashSetExport.clear();

        System.out.println("Size of collection after clear: " + hashSetExport.size());

        // Додавання елементу до HashSet
        hashSetExport.add(exportEgg);

        System.out.println("Size of collection after add element: " + hashSetExport.size());

        System.out.println("Print collection HashSet with one elements: \n");
        for (Export obj : hashSetExport) {
            System.out.println(obj.toString());
        }

        // Отримання представлення EnumMap у вигляді колекції для виведення даних
        Collection<Export> values = enumMap.values();
        System.out.println("\nDisplay EnumMap: \n");
        for (Export obj : values) {
            System.out.println(obj.toString());
        }

        // Додавання елементу до EnumMap за порядковим номером
        int instanceNumber = 1;
        Export laptop = new Export("AcerSwift13", 10, 40000, "SK", ExportType.ELECTRONICS);
        enumMap.put(ExportType.values()[instanceNumber], laptop);

        System.out.println("Methods of map-----------------\n");
        System.out.println("Size of EnumMap: " + enumMap.size());
        System.out.println("Check if contains key Electronics: " + enumMap.containsKey(ExportType.ELECTRONICS));
        System.out.println("Check if contains value laptop: " + enumMap.containsValue(laptop));
        System.out.println("Get element from EnumMap:\n" + enumMap.get(ExportType.FOOD));



        System.out.println("\nDisplay Updated EnumMap: \n");
        for (Export obj : values) {
            System.out.println(obj.toString());
        }

        // Модифікація параметрів певного об'єкту за порядковим номером
        Export objToUpdate = enumMap.get(ExportType.values()[instanceNumber]);
        if (objToUpdate != null && objToUpdate.getExportId() == 4) {
            objToUpdate.setProductName("Asus");
        }

        System.out.println("\nDisplay Modified EnumMap: \n");
        for (Export obj : values) {
            System.out.println(obj.toString());
        }
        // Видалення елементу з EnumMap за порядковим номером
        Export removedValue = enumMap.remove(ExportType.values()[instanceNumber]);

        System.out.println("\nDisplay Updated after remove laptop in EnumMap: \n");
        for (Export obj : values) {
            System.out.println(obj.toString());
        }

    }
}
