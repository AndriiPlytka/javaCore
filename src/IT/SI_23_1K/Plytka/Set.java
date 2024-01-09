package IT.SI_23_1K.Plytka;

public class Set<T> {
    private T[] setArray;  // змінна із елементами

    public Set(T[] elements) { //конструктор для ініціалізації поля
        this.setArray = elements;
    } // конструктор для ініціалізації поля

    public T[] getSet() {  //гетер для приствоєння значення полю
        return setArray;
    } // гетер для повернення значення поля

    public void setSet(T[] elements) { //сетер для отримання значення із поля
        this.setArray = elements;
    } // сетер для встановлення значення поля

    public boolean contains(T element) { // метод для перевірки наявності елементу у масиві
        for (T item : setArray) {
            if (item != null && item.equals(element)) {
                return true;
            }
        }
        return false;
    }
}
