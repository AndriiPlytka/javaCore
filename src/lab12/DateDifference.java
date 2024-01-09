package lab12;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;

public class DateDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first date and time (yyyy-MM-dd HH:mm:ss):");
        String dateTime1Str = scanner.nextLine();
        LocalDateTime dateTime1 = LocalDateTime.parse(dateTime1Str.replace( " ", "T" ));


        System.out.println("Enter the second date and time (yyyy-MM-dd HH:mm:ss):");
        String dateTime2Str = scanner.nextLine();
        LocalDateTime dateTime2 = LocalDateTime.parse(dateTime2Str.replace(" ", "T"));

        // Визначаємо різницю між датами/часами
        Duration duration = Duration.between(dateTime1, dateTime2);

        long days = duration.toDays();
        long hours = duration.toHours() % 24;
        long minutes = duration.toMinutes() % 60;
        long seconds = duration.getSeconds() % 60;

        System.out.println("The difference between the entered dates:");
        System.out.println(days + " days, " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds");
    }
}
