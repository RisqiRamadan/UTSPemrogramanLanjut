package UTSPemrogramanLanjut;

import java.util.HashSet;
import java.util.Set;

public class NumberChecker {
    public static boolean checkDuplicates(int[] numbers) {
        Set<Integer> uniqueNumbers = new HashSet<>();

        for (int number : numbers) {
            if (uniqueNumbers.contains(number)) {
                return true;
            }
            uniqueNumbers.add(number);
        }

        return false;
    }

    public static Set<Integer> getDuplicateNumbers(int[] numbers) {
        Set<Integer> duplicateNumbers = new HashSet<>();
        Set<Integer> uniqueNumbers = new HashSet<>();

        for (int number : numbers) {
            if (!uniqueNumbers.add(number)) {
                duplicateNumbers.add(number);
            }
        }

        return duplicateNumbers;
    }

    public static int getCount(int[] numbers, int number) {
        int count = 0;

        for (int num : numbers) {
            if (num == number) {
                count++;
            }
        }

        return count;
    }
}
