import java.util.Scanner;

public class Latihan8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int biayaCetak = 200;
        int biayaJilid;
        int beratLembar = 3;
        int biayaPengiriman = 15000;
        int beratPacking = 300;
        int jumlahHalaman;
        int jumlahLembar;
        double beratTotal;
        int biayaCetakTotal;
        int biayaKirim;
        int totalBayar;
        int beratCover;

        System.out.print("Jumlah Halaman: ");
        jumlahHalaman = sc.nextInt();
        sc.nextLine();

        System.out.print("Jenis cover (hard/soft): ");
        String jenisCover = sc.next().toLowerCase();

        if (jenisCover.equals("hard")) {
            biayaJilid = 20000;
            beratCover = 250;
        } else if (jenisCover.equals("soft")) {
            biayaJilid = 10000;
            beratCover = 100;
        } else {
            System.out.println("Jenis Cover Invalid!");
            sc.close();
            return;
        }

        System.out.println("Biaya Cetak: " + biayaCetak);
        System.out.println("Biaya Jilid (Cover " + jenisCover + "): " + biayaJilid);
        System.out.println("Berat Lembar: " + beratLembar);
        System.out.println("Biaya Pengiriman: " + biayaPengiriman);
        System.out.println("Berat Cover: " + beratCover);
        System.out.println("Berat Packing: " + beratPacking);

        jumlahLembar = jumlahHalaman / 2;
        System.out.println("Jumlah Lembar: " + jumlahLembar);

        biayaCetakTotal = jumlahHalaman * biayaCetak;
        System.out.println("Jumlah Biaya Cetak: " + biayaCetakTotal);

        beratTotal = (jumlahLembar * beratLembar) + beratCover + beratPacking;
        System.out.println("Jumlah Berat Total: " + beratTotal);

        biayaKirim = (int) Math.ceil(beratTotal / 1000.0) * biayaPengiriman;
        System.out.println("Jumlah Biaya Kirim: " + biayaKirim);

        totalBayar = biayaCetakTotal + biayaJilid + biayaKirim;
        System.out.println("Total Bayar: " + totalBayar);

        sc.close();
    }
}