package SourcePackage.Latihan;

import java.util.Scanner;
public class StatementNilai {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kehadiran, tugas, uts, uas;

        System.out.print("Input Nilai Kehadiran: ");
        kehadiran = input.nextInt();

        System.out.print("Input Nilai Tugas: ");
        tugas = input.nextInt();

        System.out.print("Input Nilai UTS: ");
        uts = input.nextInt();

        System.out.print("Input Nilai UAS: ");
        uas = input.nextInt();
        int realisasi1 = 21;


        double nilaiAkhir = (int) ((kehadiran/ (double) realisasi1 * 10)
                    + (tugas * 0.2)
                    + (uts * 0.3)
                    + (uas * 0.4));

        System.out.println("\nNilai Akhir: " + nilaiAkhir);
        input.close();
    }
}