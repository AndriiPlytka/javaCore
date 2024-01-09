package lab8;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidator {
    public static void main(String[] args) {

//  приклад правильного виразу: +3(050) 12-34-567.
//  приклад неправильного виразу: 050-12345-67.
        //Text test regex split text by word in Lab 9 Andrii Plytka

        Scanner text = new Scanner(System.in);
        System.out.println("Input Text:");
        String inputText = text.nextLine();
        // Розділення тексту на слова
        String[] words = inputText.split("\\s+");
        // Сортування слів у порядку зростання
        Arrays.sort(words);
        // Виведення відсортованих слів
        System.out.println("Words in ascending order: ");
        for (String word : words) {
            System.out.println(word);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input phone number: ");
        String phoneNumber = scanner.nextLine();

        // Регулярний вираз для перевірки номера телефону
        String regex = "\\+\\d{1,3}\\(0\\d{2}\\)\\s?\\d{2}-\\d{2}-\\d{3}.?";
        // Створення об'єкту Pattern
        Pattern pattern = Pattern.compile(regex);
        // Створення об'єкту Matcher
        Matcher matcher = pattern.matcher(phoneNumber);
        // Перевірка відповідності рядка регулярному виразу
        if (matcher.matches()) {
            System.out.println("This is a valid phone number.");
        } else {
            System.out.println("This is an invalid phone number.");
        }
    }
}
