package UTSPemrogramanLanjut;

import java.util.Scanner;
import java.util.Set;

public class AngkaUnik {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] angkaAngka = new int[20];

        System.out.println("Masukkan daftar angka sebanyak 20:");
        for (int i = 0; i < 20; i++) {
            angkaAngka[i] = scan.nextInt();
        }

        boolean terDuplikat = PengecekAngka.cekDuplikat(angkaAngka);
        System.out.println("Output: " + terDuplikat);

        if (terDuplikat) {
            Set<Integer> angkaDuplikat = PengecekAngka.getDuplicateNumbers(angkaAngka);
            System.out.println("Daftar angka yang sama beserta jumlahnya ");
            for (int angka : angkaDuplikat) {
                int count = PengecekAngka.getCount(angkaAngka, angka);
                System.out.println(angka + " Jumlahnya " + count );
            }
        }
    }
}
