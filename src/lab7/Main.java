package lab7;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Створення списку інгредієнтів для піци
        List<Pizza.Ingredient> ingredients1 = new ArrayList<>();
        ingredients1.add(new Pizza.Ingredient("Cheese", 150));
        ingredients1.add(new Pizza.Ingredient("Tomato", 100));
        List<Pizza.Ingredient> ingredients2 = new ArrayList<>();
        ingredients2.add(new Pizza.Ingredient("Cheese", 150));
        ingredients2.add(new Pizza.Ingredient("Tomato", 100));


        // Створення піци
        Pizza pizza1 = new Pizza(45, ingredients1, 10.99);

        // Виведення інформації про першу піцу
        System.out.println("Pizza 1:");
        System.out.println("Size: " + pizza1.getSize());
        System.out.println("Price: $" + pizza1.getPrice());
        System.out.println("Ingredients:");
        for (Pizza.Ingredient ingredient1 : pizza1.getIngredients()) {
            System.out.println("- " + ingredient1.getName() + ": " + ingredient1.getQuantityInGrams() + "g");
        }
        System.out.println("Total Price: " + pizza1.calculateTotalPrice());

        Pizza pizza2 = new Pizza(30, null, 15.99);

        // Виведення інформації про другу піцу
        System.out.println("\nPizza 2:");
        System.out.println("Size: " + pizza2.getSize());
        System.out.println("Price: $" + pizza2.getPrice());
        System.out.println("Ingredients:");
        if (pizza2.getIngredients() == null) {
            System.out.println("No ingredients");
        } else {
            for (Pizza.Ingredient ingredient : pizza2.getIngredients()) {
                System.out.println("- " + ingredient.getName() + ": " + ingredient.getQuantityInGrams() + "g");
            }
        }
        System.out.println("Total Price: " + pizza2.calculateTotalPrice());

    }
}
