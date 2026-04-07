package SourcePackage.Tugas;

import java.util.Scanner;

public class RekapSatuMinggu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double makan, transportasi, belanja;
        double total_makan = 0, total_transportasi = 0, total_belanja = 0;

        System.out.println("Rekap Pengeluaran Satu Minggu");
        System.out.println("============================");

        for (int hari = 1; hari <= 7; hari++) {
            System.out.println("Hari ke-" + hari);

            System.out.print("Pengeluaran Makan (Max Rp 20.000): ");
            makan = input.nextDouble();

            System.out.print("Pengeluaran Transportasi (Max Rp 10.000): ");
            transportasi = input.nextDouble();

            System.out.print("Pengeluaran Belanja (Max Rp 50.000): ");
            belanja = input.nextDouble();

            // Total mingguan
            total_makan += makan;
            total_transportasi += transportasi;
            total_belanja += belanja;

            double total_harian = makan + transportasi + belanja;

            // Persentase dari 80k
            double s_makan = (makan / 80000) * 100;
            double s_transportasi = (transportasi / 80000) * 100;
            double s_belanja = (belanja / 80000) * 100;

            System.out.println("============================");
            System.out.println("Pengeluaran Hari ke-" + hari);
            System.out.println("Makan: Rp " + makan + " (" + s_makan + "%)");
            System.out.println("Transportasi: Rp " + transportasi + " (" + s_transportasi + "%)");
            System.out.println("Belanja: Rp " + belanja + " (" + s_belanja + "%)");
            System.out.println("Total Hari Ini: Rp " + total_harian);
            System.out.println("============================");
        }

        // TOTAL 1 MINGGU
        double total_seminggu = total_makan + total_transportasi + total_belanja;

        System.out.println("====== REKAP 1 MINGGU ======");
        System.out.println("Total MAKAN: Rp " + total_makan);
        System.out.println("Total TRANSPORTASI: Rp " + total_transportasi);
        System.out.println("Total BELANJA: Rp " + total_belanja);
        System.out.println("TOTAL SEMINGGU: Rp " + total_seminggu);
        System.out.println("============================");
    }
}