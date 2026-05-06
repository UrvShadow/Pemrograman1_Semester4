import java.util.Scanner;

public class Tugas1 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char pilih;

        do {
            System.out.print("Masukkan nama mahasiswa : ");
            String nama = input.nextLine();

            System.out.print("Masukkan nilai mahasiswa: ");
            double nilai = input.nextDouble();
            input.nextLine();

            System.out.println("\nData yang diinput:");
            System.out.println("Nama  : " + nama);
            System.out.println("Nilai : " + nilai);

            System.out.print("\nInput lagi? (y/t): ");
            pilih = Character.toLowerCase(input.nextLine().charAt(0));
            System.out.println();

        } while (pilih != 't');

        System.out.println("Program selesai.");
        input.close();
    }
}