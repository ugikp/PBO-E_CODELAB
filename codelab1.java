import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class codelab1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input nama
        System.out.print("Nama: ");
        String nama = scanner.nextLine();

        // Input jenis kelamin
        System.out.print("Jenis Kelamin (L/P): ");
        String jenisKelaminInput = scanner.nextLine();
        String jenisKelamin = jenisKelaminInput.equalsIgnoreCase("L") ? "Laki-laki" : "Perempuan";

        // Input tanggal lahir
        System.out.print("Tanggal Lahir (yyyy-mm-dd): ");
        String tanggalLahirStr = scanner.nextLine();
        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirStr);

        // Hitung umur
        LocalDate now = LocalDate.now();
        long tahun = ChronoUnit.YEARS.between(tanggalLahir, now);
        long bulan = ChronoUnit.MONTHS.between(tanggalLahir.plusYears(tahun), now);

        // Output data diri
        System.out.println("\nOutput:");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Umur Anda: " + tahun + " tahun " + bulan + " bulan");
    }
}
