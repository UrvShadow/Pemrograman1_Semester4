import java.util.Scanner;

public class Tugas2 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlahMahasiswa;
        int i = 1;
        double nilai;
        double totalNilai = 0;

        System.out.print("Masukkan jumlah mahasiswa: ");
        jumlahMahasiswa = input.nextInt();

        do {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = input.nextDouble();
            totalNilai += nilai;
            i++;
        } while (i <= jumlahMahasiswa);

        System.out.println("Total nilai semua mahasiswa: " + totalNilai);

        input.close();
    }
}