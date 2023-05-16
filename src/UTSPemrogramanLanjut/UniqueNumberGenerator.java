package UTSPemrogramanLanjut;

import UTSPemrogramanLanjut.NumberChecker;

import java.util.Scanner;
import java.util.Set;

public class UniqueNumberGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[20];

        System.out.println("Masukkan daftar angka sebanyak 20:");
        for (int i = 0; i < 20; i++) {
            numbers[i] = scanner.nextInt();
        }

        boolean hasDuplicates = NumberChecker.checkDuplicates(numbers);
        System.out.println("Output: " + hasDuplicates);

        if (hasDuplicates) {
            Set<Integer> duplicateNumbers = NumberChecker.getDuplicateNumbers(numbers);
            System.out.println("Daftar angka yang sama beserta jumlahnya ");
            for (int number : duplicateNumbers) {
                int count = NumberChecker.getCount(numbers, number);
                System.out.println(number + " Jumlah " + count );
            }
        }
    }
}
