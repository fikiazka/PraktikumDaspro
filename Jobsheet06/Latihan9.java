import java.util.Scanner;

public class Latihan9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int biayaCetak = 200;
        int biayaJilid = 20000;
        int beratLembar = 3;
        int biayaPengiriman = 15000;
        int beratHardCover = 250;
        int beratPacking = 300;
        int jumlahHalaman;
        int jumlahLembar;
        double beratTotal;
        int biayaCetakTotal;
        int biayaKirim;
        int totalBayar;

        System.out.print("Jumlah Halaman: ");
        jumlahHalaman = sc.nextInt();
        sc.nextLine();

        System.out.println("Kota Pelanggan: ");
        String kota = sc.nextLine();

        System.out.println("Biaya Cetak: " + biayaCetak);
        System.out.println("Biaya Jilid: " + biayaJilid);
        System.out.println("Berat Lembar: " + beratLembar);
        System.out.println("Biaya Pengiriman: " + biayaPengiriman);
        System.out.println("Berat Hard Cover: " + beratHardCover);
        System.out.println("Berat Packing: " + beratPacking);

        jumlahLembar = jumlahHalaman / 2;
        System.out.println("Jumlah Lembar: " + jumlahLembar);

        biayaCetakTotal = jumlahHalaman * biayaCetak;
        System.out.println("Jumlah Biaya Cetak: " + biayaCetakTotal);

        beratTotal = (jumlahLembar * beratLembar) + beratHardCover + beratPacking;
        System.out.println("Jumlah Berat Total: " + beratTotal);

        if (kota.equalsIgnoreCase("Malang") || kota.equalsIgnoreCase("Batu")) {
            biayaKirim = 20000;
            System.out.println("\nPengiriman ke " + kota + "Menggunakan kurir lokal.");
            System.out.println("Biaya Pengiriman Tetap: Rp 20000");
        } else {
            biayaKirim = (int) Math.ceil(beratTotal / 1000.0) * biayaPengiriman;
            System.out.println("\nPengiriman ke luar kota (" + kota + ").");
            System.out.println("Biaya Pengiriman Berdasarkan Berat: Rp " + biayaKirim);
        }

        totalBayar = biayaCetakTotal + biayaJilid + biayaKirim;
        System.out.println("Total Bayar: " + totalBayar);

        sc.close();
    }
}
