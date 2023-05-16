package UTSPemrogramanLanjut;

import java.util.HashSet;
import java.util.Set;

public class PengecekAngka {
    public static boolean cekDuplikat(int[] angkaAngka) {
        Set<Integer> angkaUnik = new HashSet<>();

        for (int angka : angkaAngka) {
            if (angkaUnik.contains(angka)) {
                return true;
            }
            angkaUnik.add(angka);
        }

        return false;
    }

    public static Set<Integer> getDuplicateNumbers(int[] angkaAngka) {
        Set<Integer> angkaYangSama = new HashSet<>();
        Set<Integer> angkaAngkaUnik = new HashSet<>();

        for (int angka : angkaAngka) {
            if (!angkaAngkaUnik.add(angka)) {
                angkaYangSama.add(angka);
            }
        }

        return angkaYangSama;
    }

    public static int getCount(int[] angkaAngka, int angka) {
        int hitung = 0;

        for (int num : angkaAngka) {
            if (num == angka) {
                hitung++;
            }
        }

        return hitung;
    }
}
