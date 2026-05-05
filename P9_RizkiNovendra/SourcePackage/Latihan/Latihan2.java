import java.util.Scanner;
public class Latihan2 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            char ulang;

            do {
                System.out.print("Nama: ");
                String nama = input.nextLine();

                System.out.print("NIM: ");
                String nim = input.nextLine();

                System.out.println("Data yang dimasukkan:");
                System.out.println("Nama: " + nama);
                System.out.println("NIM: " + nim);

                System.out.print("Apakah Anda ingin memasukkan data lagi? (y/n): ");
                ulang = input.next().charAt(0);
                input.nextLine(); 
            } while (ulang == 'y' || ulang == 'Y');
        }
        System.out.println("Program selesai.");
    }
}
