import java.util.Scanner;

public class Latihan7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int biayaPublikasi = 300000;
        int biayaDekorasi = 500000;
        int biayaKonsumsi = 500000;
        int biayaHadiah = 4000000;
        int biayaOprasional = 500000;
        int biayaKonsumsiPeserta = 25000;
        int honorarium = 75000;
        int jumlahPeserta = 3;
        int biayaPendaftaraan = 50000;
        double danaPolinema = 0.6;
        int danaAnggaran;
        int jumlahTim;
        double totalDanaSponsorship;

        System.out.println("Jumlah Tim: ");
        jumlahTim = sc.nextInt();

        jumlahPeserta *= jumlahTim;
        biayaKonsumsiPeserta *= jumlahPeserta;
        honorarium *= jumlahTim;
        biayaPendaftaraan *= jumlahTim;
        danaAnggaran = biayaPublikasi + biayaDekorasi + biayaKonsumsi + biayaHadiah + biayaOprasional
                + biayaKonsumsiPeserta + honorarium;

        System.out.println("Total Jumlah Peserta: " + jumlahPeserta);
        System.out.println("Total Biaya Konsumsi Peserta: " + biayaKonsumsiPeserta);
        System.out.println("Total Biaya Honorarium Juri: " + honorarium);
        System.out.println("Jumlah Biaya Pendaftaran: " + biayaPendaftaraan);
        System.out.println("Jumlah Dana Anggaran: " + danaAnggaran);

        System.out.print("Apakah Polinema memberikan dana bantuan? (ya/tidak): ");
        String jawaban = sc.next().toLowerCase();

        if (jawaban.equals("ya")) {
            System.out.print("Masukkan persentase dana bantuan dari Polinema (0-100): ");
            double persenBantuan = sc.nextDouble();

            danaPolinema = danaAnggaran * (persenBantuan / 100);
            System.out.println("Jumlah Dana dari Polinema: " + danaPolinema);

            if (danaPolinema >= danaAnggaran) {
                System.out.println("\nDana dari Polinema sudah mencukupi seluruh biaya.");
                System.out.println("Dana sponsorship TIDAK dibutuhkan.");
            } else {
                totalDanaSponsorship = danaAnggaran - danaPolinema - biayaPendaftaraan;
                System.out.println("\nTotal Dana Sponsorship yang dibutuhkan: " + totalDanaSponsorship);
            }
        } else {
            danaPolinema = 0;
            totalDanaSponsorship = danaAnggaran - biayaPendaftaraan;
            System.out.println("\nPolinema tidak memberikan bantuan.");
            System.out.println("Total Dana Sponsorship yang Dibutuhkan: " + totalDanaSponsorship);
        }

        sc.close();
    }
}
