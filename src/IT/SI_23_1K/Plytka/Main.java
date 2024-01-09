package IT.SI_23_1K.Plytka;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Створюємо множини різних типів даних
        Set<Integer> intSet1 = new Set<>(new Integer[]{1, 2, 3, 4, 5});
        Set<Integer> intSet2 = new Set<>(new Integer[]{3, 4, 5, 6, 7});

        Set<String> strSet1 = new Set<>(new String[]{"apple", "banana", "cherry"});
        Set<String> strSet2 = new Set<>(new String[]{"banana", "cherry", "date"});

        Set<Double> doubleSet1 = new Set<>(new Double[]{1.1, 2.2, 3.3, 4.4});
        Set<Double> doubleSet2 = new Set<>(new Double[]{3.3, 4.4, 5.5, 6.6});

        System.out.println("Integer Set 1: " +  Arrays.toString(intSet1.getSet()));
        System.out.println("Integer Set 2: " +  Arrays.toString(intSet2.getSet())+ "\n");

        System.out.println("String Set 1: " +  Arrays.toString(strSet1.getSet()));
        System.out.println("String Set 2: " +  Arrays.toString(strSet2.getSet())+ "\n");

        System.out.println("Double Set 1: " +  Arrays.toString(doubleSet1.getSet()));
        System.out.println("Double Set 2: " +  Arrays.toString(doubleSet2.getSet())+ "\n");


        // Виконуємо операції над множинами
        Set<Integer> unionResult = Operation.unionSets(intSet1, intSet2);
        Set<Integer> intersectionResult = Operation.intersectionSets(intSet1, intSet2);
        Set<Integer> differenceResult = Operation.differenceSets(intSet1, intSet2);
        Set<Integer> symmetricDiffResult = Operation.symmetricDiffSets(intSet1, intSet2);

        Set<String> strUnionResult = Operation.unionSets(strSet1, strSet2);
        Set<String> strIntersectionResult = Operation.intersectionSets(strSet1, strSet2);
        Set<String> strDifferenceResult = Operation.differenceSets(strSet1, strSet2);
        Set<String> strSymmetricDiffResult = Operation.symmetricDiffSets(strSet1, strSet2);

        Set<Double> doubleUnionResult = Operation.unionSets(doubleSet1, doubleSet2);
        Set<Double> doubleIntersectionResult = Operation.intersectionSets(doubleSet1, doubleSet2);
        Set<Double> doubleDifferenceResult = Operation.differenceSets(doubleSet1, doubleSet2);
        Set<Double> doubleSymmetricDiffResult = Operation.symmetricDiffSets(doubleSet1, doubleSet2);

        // Виводимо результати
        System.out.println("Integer Union: " + Arrays.toString(unionResult.getSet()));
        System.out.println("Integer Intersection: " + Arrays.toString(intersectionResult.getSet()));
        System.out.println("Integer Difference: " + Arrays.toString(differenceResult.getSet()));
        System.out.println("Integer Symmetric Difference: " + Arrays.toString(symmetricDiffResult.getSet())+ "\n");

        System.out.println("String Union: " + Arrays.toString(strUnionResult.getSet()));
        System.out.println("String Intersection: " + Arrays.toString(strIntersectionResult.getSet()));
        System.out.println("String Difference: " + Arrays.toString(strDifferenceResult.getSet()));
        System.out.println("String Symmetric Difference: " + Arrays.toString(strSymmetricDiffResult.getSet())+ "\n");

        System.out.println("Double Union: " + Arrays.toString(doubleUnionResult.getSet()));
        System.out.println("Double Intersection: " + Arrays.toString(doubleIntersectionResult.getSet()));
        System.out.println("Double Difference: " + Arrays.toString(doubleDifferenceResult.getSet()));
        System.out.println("Double Symmetric Difference: " + Arrays.toString(doubleSymmetricDiffResult.getSet())+ "\n");
    }
}



