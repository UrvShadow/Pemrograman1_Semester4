import java.util.Scanner;

public class Latihan1 {
    @SuppressWarnings({"all", "ConvertToTryWithResources"})
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Nama: ");
        String nama = input.nextLine();

        System.out.println("Masukan Jurusan (Teknik Informatika / TI / Informatika): ");
        String pilihan = input.nextLine();

        if (pilihan.equalsIgnoreCase("Teknik Informatika")
            || pilihan.equalsIgnoreCase("TI")
            || pilihan.equalsIgnoreCase("Informatika")) {
            
            String jurusanFinal = "Teknik Informatika";
            String shiftFinal;

            System.out.print("Shift (A/B/CK/CS): ");
            String shift = input.nextLine().trim().toUpperCase();

            shiftFinal = switch (shift) {
                case "A" -> "Reguler A";
                case "B" -> "Reguler B";
                case "CK" -> "Reguler CK";
                case "CS" -> "Reguler CS";
                default -> {
                    System.out.println("Input shift tidak valid, default ke Reguler A");
                    yield "Reguler A";
                }
            };

            System.out.println("\n===== SUMMARY =====");
            System.out.println("Nama     : " + nama);
            System.out.println("Jurusan  : " + jurusanFinal);
            System.out.println("Shift    : " + shiftFinal);
        } else {
            System.out.println("Pilihan tidak valid");
        }
        input.close();
    }
}