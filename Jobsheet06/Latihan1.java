import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int biayaSewaMobil = 300000;
        int biayaSupir = 200000;
        int biayaBahanBakar = 0;
        int lamaSewa;
        int jarakTempuh;
        int totalBiayaSewa;

        System.out.print("Lama sewa: ");
        lamaSewa = sc.nextInt();

        System.out.print("Jarak Tempuh: ");
        jarakTempuh = sc.nextInt();

        sc.nextLine();
        System.out.println("Input Jenis Biaya Bahan Bakar: ");
        String jenisBBM = sc.nextLine();

        // System.out.println("Biaya Sewa Mobil: " + biayaSewaMobil);
        // System.out.println("Biaya Supir: " + biayaSupir);

        biayaSewaMobil *= lamaSewa;
        System.out.println("Jumlah Biaya sewa Mobil: " + biayaSewaMobil);

        biayaSupir *= lamaSewa;
        System.out.println("Jumlah Biaya Supir: " + biayaSupir);

        if (jenisBBM.equalsIgnoreCase("pertalite")) {
            biayaBahanBakar = 1000 * jarakTempuh;
            System.out.println("Jumlah Biaya BBM Pertalite: " + biayaBahanBakar);
        } else if (jenisBBM.equalsIgnoreCase("pertamax")) {
            biayaBahanBakar = 1300 * jarakTempuh;
            System.out.println("Jumlah Biaya BBM Pertama: " + biayaBahanBakar);
        } else {
            System.out.println("BBM TIDAK TERSEDIA!");
        }

        // biayaBahanBakar = 1000 * jarakTempuh;
        // System.out.println("Jumlah Biaya Bahan Bakar: " + biayaBahanBakar);

        totalBiayaSewa = biayaSewaMobil + biayaSupir + biayaBahanBakar;
        System.out.println("Total Biaya Sewa: " + totalBiayaSewa);

        sc.close();
    }
}