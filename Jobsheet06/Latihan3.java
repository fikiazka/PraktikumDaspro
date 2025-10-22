import java.util.Scanner;

public class Latihan3 {
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

        if (lamaSewa > 30) {
            System.out.println("Lama Sewa Maksimal 30 Hari!");
            sc.close();
            return;
        }

        System.out.print("Jarak Tempuh: ");
        jarakTempuh = sc.nextInt();

        biayaSewaMobil *= lamaSewa;
        System.out.println("Jumlah Biaya sewa Mobil: " + biayaSewaMobil);

        biayaSupir *= lamaSewa;
        System.out.println("Jumlah Biaya Supir: " + biayaSupir);

        biayaBahanBakar = 1000 * jarakTempuh;
        System.out.println("Jumlah Biaya Bahan Bakar: " + biayaBahanBakar);

        totalBiayaSewa = biayaSewaMobil + biayaSupir + biayaBahanBakar;
        System.out.println("Total Biaya Sewa: " + totalBiayaSewa);

        sc.close();
    }
}
