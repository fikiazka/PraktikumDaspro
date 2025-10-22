import java.util.Scanner;

public class Latihan4 {
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

        if (lamaSewa > 30) {
            System.out.println("Lama Sewa Maksimal 30 Hari!");
            sc.close();
            return;
        }

        System.out.print("Jarak Tempuh: ");
        jarakTempuh = sc.nextInt();

        sc.nextLine();
        System.out.print("Input Jenis Biaya Bahan Bakar: ");
        String jenisBBM = sc.nextLine();

        biayaSewaMobil *= lamaSewa;
        System.out.println("Jumlah Biaya sewa Mobil: " + biayaSewaMobil);

        biayaSupir *= lamaSewa;
        System.out.println("Jumlah Biaya Supir: " + biayaSupir);

        if (jenisBBM.equalsIgnoreCase("pertalite")) {
            biayaBahanBakar = 1000 * jarakTempuh;
            System.out.println("Jumlah Biaya BBM Pertalite: " + biayaBahanBakar);
        } else if (jenisBBM.equalsIgnoreCase("pertamax")) {
            biayaBahanBakar = 1300 * jarakTempuh;
            System.out.println("Jumlah Biaya BBM Pertamax: "+ biayaBahanBakar);
        } else {
            System.out.println("BBM TIDAK TERSEDIA!");
        }

        totalBiayaSewa = biayaSewaMobil + biayaSupir + biayaBahanBakar;
        if (totalBiayaSewa > 2000000) {
            double diskon = 0.05 * totalBiayaSewa;
            totalBiayaSewa -= (int) diskon;
            System.out.println("Selamat anda dapat diskon 5%");
        } else {
            System.out.println("Tidak dapat diskon!");
        }
        System.out.println("Total Biaya Sewa: " + totalBiayaSewa);

        sc.close();
    }
}
