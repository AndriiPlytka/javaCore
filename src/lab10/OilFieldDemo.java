package lab10;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

// Власний функціональний інтерфейс для отримання видобутку нафти з родовища
@FunctionalInterface
interface OilFieldFunction {
    double getOilProduction(OilField oilField);
}

// Основний клас
public class OilFieldDemo {

    public static void main(String[] args) {
        // Створення списку нафтових родовищ
        List<OilField> oilFields = new ArrayList<>();
        oilFields.add(new OilField("Rodovysche1", 120.5));
        oilFields.add(new OilField("Rodovysche2", 80.0));
        oilFields.add(new OilField("Rodovysche3", 200.0));

        // Виклик методу для фільтрації родовищ за певним критерієм
        double threshold = 100.0; // Поріг для фільтрації

        List<OilField> filteredOilFields = filterOilFields(oilFields, oilField -> oilField.getOilProduction() > threshold);

        // Виведення результату
        System.out.println("Filter results:");
        for (OilField oilField : filteredOilFields) {
            System.out.println("Name: " + oilField.getName() + ", Production: " + oilField.getOilProduction());
        }

        // Виклик методу, що використовує функціональний інтерфейс
        OilFieldFunction oilFieldFunction = OilField::getOilProduction;// Звернення до методу getOilProduction
        double production1 = oilFieldFunction.getOilProduction(oilFields.get(0));
        System.out.println("\nCurrent oil production Rodovysche1: " + production1 + " thousand barrels per day");
        double production2 = oilFieldFunction.getOilProduction(oilFields.get(1));
        System.out.println("\nCurrent oil production Rodovysche2: " + production2 + " thousand barrels per day");
        double production3 = oilFieldFunction.getOilProduction(oilFields.get(2));
        System.out.println("\nCurrent oil production Rodovysche3: " + production3 + " thousand barrels per day");
    }

    // Метод для фільтрації нафтових родовищ за певним критерієм
    public static List<OilField> filterOilFields(List<OilField> oilFields, Predicate<OilField> predicate) {
        List<OilField> filteredFields = new ArrayList<>();
        for (OilField oilField : oilFields) {
            if (predicate.test(oilField)) {
                filteredFields.add(oilField);
            }
        }
        return filteredFields;
    }
}
