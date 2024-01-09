package lab7;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private int size;
    private List<Ingredient> ingredients;
    private double price;

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Pizza(int size, List<Ingredient> ingredients, double price) {
        this.size = size;
        this.ingredients = ingredients;
        this.price = price;
    }

    // Геттери і сеттери для полів

    public static class Ingredient {
        private String name;
        private double quantityInGrams;

        public Ingredient(String name, double quantityInGrams) {
            this.name = name;
            this.quantityInGrams = quantityInGrams;
        }

        // Геттери і сеттери для полів інгредієнтів
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getQuantityInGrams() {
            return quantityInGrams;
        }

        public void setQuantityInGrams(double quantityInGrams) {
            this.quantityInGrams = quantityInGrams;
        }
    }

    // Додаткові методи
    public void addIngredient(Ingredient ingredient) {
        if (ingredients == null) {
            ingredients = new ArrayList<>();
        }
        ingredients.add(ingredient);
    }

    public void removeIngredient(Ingredient ingredient) {
        if (ingredients != null) {
            ingredients.remove(ingredient);
        }
    }

    public double calculateTotalPrice() {
        double total = price;
        if (ingredients != null) {
            for (Ingredient ingredient : ingredients) {
                // Додавання вартості кожного інгредієнту до загальної ціни
                // Наприклад, ціна за одиницю інгредієнту помножена на його кількість
                total += ingredient.getQuantityInGrams() * getIngredientPrice(ingredient.getName());
            }
        }
        return total;
    }

    private double getIngredientPrice(String ingredientName) {
        // Отримання ціни інгредієнту за його назвою
        // Повертаємо фіктивну ціну для прикладу
        return 0.4; // Припустимо, що ціна за грам
    }
}
