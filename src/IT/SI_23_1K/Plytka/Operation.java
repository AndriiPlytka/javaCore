package IT.SI_23_1K.Plytka;

import java.util.Arrays; //імпорт бібліотеки для роботи із масивами

public class Operation {

    public static <T> Set<T> unionSets(Set<T> set1, Set<T> set2) { //метод для об'єднання значень
            T[] array1 = set1.getSet();
            T[] array2 = set2.getSet();

            // Обчислюємо розмір об'єднаного масиву без повторень
            int newSize = array1.length + array2.length;
            for (T item1 : array1) {
                for (T item2 : array2) {
                    if (!item1.equals(item2)) {
                        newSize++;
                    }
                }
            }

            // Створюємо новий масив з врахуванням розміру без повторень
            T[] resultArray = (T[]) new Object[newSize];
            int index = 0;
            // Копіюємо значення з першого масиву
            for (T item : array1) {
                boolean found = false;
                for (T resultItem : resultArray) {
                    if (item.equals(resultItem)) {
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    resultArray[index++] = item;
                }
            }
            // Копіюємо значення з другого масиву без повторень
            for (T item : array2) {
                boolean found = false;
                for (T resultItem : resultArray) {
                    if (item.equals(resultItem)) {
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    resultArray[index++] = item;
                }
            }
            // Створюємо новий масив із фактичною довжиною результату

            T[] finalResult = (T[]) new Object[index];
            System.arraycopy(resultArray, 0, finalResult, 0, index);

            return new Set<>(finalResult);

    }

    public static <T> Set<T> intersectionSets(Set<T> set1, Set<T> set2) { //метод для отримання пересічних значень
        T[] array1 = set1.getSet(); //отримання значень від двох масивів
        T[] array2 = set2.getSet();
        int size = 0; //ініціалізація довжини загального масиву
        int min = Math.min(array1.length, array2.length); //визначення найменьшого масиву
        int c = 0; //змінна для збереження кількості значень, які співпали

        for (int i = 0; i < min; i++) { //знаходження кількості елементів, які співпадають
            if (set2.contains(array1[i])) {
                size++;
            }
        }

        T[] resultArray = (T[]) new Object[size]; //створення загального масиву від знайденої кількості співпадінь

        for (int i = 0; i < min; i++) { //пошук і додавання спільних елементів
            if (set2.contains(array1[i])) {
                resultArray[c] = array1[i];
                c++;
            }
        }

        return new Set<>(resultArray); //повернення результату
    }

    public static <T> Set<T> differenceSets(Set<T> set1, Set<T> set2) { //метод для отримання різниці
        T[] array1 = set1.getSet(); //отримання значень від двох масивів
        T[] array2 = set2.getSet();
        int size = 0; //ініціалізація довжини загального масиву
        int c = 0; //змінна для збереження кількості значень, які не співпали

        for (int i = 0; i < array1.length; i++) { //знаходження кількості елементів,які співпадають
            if (!set2.contains(array1[i])) {
                size++;
            }
        }

        T[] resultArray = (T[]) new Object[size]; //створення загального масиву від знайденої кількості співпадінь

        for (int i = 0; i < array1.length; i++) { //створення загального масиву від знайденої кількості співпадінь
            if (!set2.contains(array1[i])) {
                resultArray[c] = array1[i];
                c++;
            }
        }
        return new Set<>(resultArray); //повернення результату
    }

    public static <T> Set<T> symmetricDiffSets(Set<T> set1, Set<T> set2) { //метод для отримання значень симетричної різниці
        Set<T> unionResult = unionSets(set1, set2); //об'єднання двох масивів
        Set<T> intersectionResult = intersectionSets(set1, set2); //пересічення двох масивів
        return differenceSets(unionResult, intersectionResult); //повернення різниця двох масивів
    }
}

