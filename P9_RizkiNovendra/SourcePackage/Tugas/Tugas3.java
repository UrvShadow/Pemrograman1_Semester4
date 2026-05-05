import java.util.Scanner;

public class Tugas3 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double totalNilai = 0;
        int jumlahMahasiswa = 0;
        char lagi;

        do {
            System.out.print("Masukkan nilai mahasiswa ke-" + (jumlahMahasiswa + 1) + ": ");
            double nilai = input.nextDouble();

            totalNilai += nilai;
            jumlahMahasiswa++;

            System.out.print("Input nilai lagi? (y/n): ");
            lagi = input.next().charAt(0);
        } while (lagi == 'y' || lagi == 'Y');

        double rataRata = totalNilai / jumlahMahasiswa;

        System.out.println("\nJumlah mahasiswa : " + jumlahMahasiswa);
        System.out.println("Total nilai      : " + totalNilai);
        System.out.println("Rata-rata nilai  : " + rataRata);

        input.close();
    }
}