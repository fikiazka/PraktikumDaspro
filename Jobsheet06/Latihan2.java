import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int biayaSewaMobil = 300000;
        int biayaSupir = 200000;
        int biayaBahanBakar = 1000;
        int lamaSewa;
        int jarakTempuh;
        int totalBiayaSewa;

        System.out.print("Lama sewa: ");
        lamaSewa = sc.nextInt();

        System.out.print("Jarak Tempuh: ");
        jarakTempuh = sc.nextInt();

        biayaSewaMobil *= lamaSewa;
        System.out.println("Jumlah Biaya sewa Mobil: " + biayaSewaMobil);

        biayaSupir *= lamaSewa;
        System.out.println("Jumlah Biaya Supir: " + biayaSupir);

        biayaBahanBakar *= jarakTempuh;
        System.out.println("Jumlah Biaya Bahan Bakar: " + biayaBahanBakar);

        totalBiayaSewa = biayaSewaMobil + biayaSupir + biayaBahanBakar;
        if (totalBiayaSewa > 2000000) {
            double diskon = 0.05 * totalBiayaSewa;
            totalBiayaSewa -=(int) diskon;
            System.out.println("Selamat anda dapat diskon 5%");
        } else {
            System.out.println("Tidak dapat diskon!");
        }
        System.out.println("Total Biaya Sewa: " + totalBiayaSewa);

        sc.close();
    }
}
