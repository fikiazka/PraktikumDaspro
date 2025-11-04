package PraktikumDaspro.Jobsheet07;

import java.util.Scanner;

public class PenjualanTiket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalTiket = 0;
        int jumlahTiket;
        double totalPenjualan = 0;
        double hargaTiket = 50000;
        double totalHarga;
        double diskon = 0;
        double subtotal;

        do {
            System.out.print("Masukkan jumlah tiket yang dibeli ('ketik 0 untuk batal'): ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket < 0) {
                System.out.println("Jumlah Tiket Tidak Valid!");
                continue;
            }

            if (jumlahTiket == 0) {
                System.out.println("Pemesanan Tiket Dibatalkan!");
                break;
            }

            subtotal = jumlahTiket * hargaTiket;

            if (jumlahTiket > 10) {
                diskon = 0.15;
                System.out.println("Selamat Anda Mendapatkan Diskon 15%");
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
                System.out.println("Selamat Anda Mendapatkan Diskon 10%");
            }else{
                System.out.println("Harga Pembelian Normal.");
            }

            totalHarga = subtotal - (subtotal * diskon);

            System.out.println("Total harga untuk pelanggan ini: " + totalHarga);
            totalTiket += jumlahTiket;
            totalPenjualan += totalHarga;

        } while (true);
        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total penjualan: Rp " + totalPenjualan);

        sc.close();
    }
}
