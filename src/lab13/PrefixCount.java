package lab13;
import java.util.Arrays;

public class PrefixCount {

        public static void main(String[] args) {
            // Input array of strings
            String[] strings = {"apple", "banana", "apricot", "avocado", "orange"};

            // Prefix to search for
            String prefix = "ap";
            long count = Arrays.stream(strings).filter(s -> s.startsWith(prefix)).count();
            System.out.println("Number of strings starting with '" + prefix + "': " + count);
        }
}


