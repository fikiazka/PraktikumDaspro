package Pertemuan14;

import java.util.Scanner;

public class Kafe10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu("Andi", true, null);

        int totalKeseluruhan = 0;

        System.out.print("Masukkan berapa jenis menu: ");
        int jumlahJenis = sc.nextInt();

        sc.nextLine();
        System.out.print("Masukkan kode promo (Contoh: DISKON50): ");
        String kodePromo = sc.nextLine();

        for (int i = 0; i <= jumlahJenis; i++) {
            System.out.println("Pesanan ke-" + (i+1));

            System.out.print("Masukkan nomor menu yang ingin anda pesan: ");
            int pilihanMenu = sc.nextInt();

            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = sc.nextInt();

            int totalHarga = hitungTotalHarga10(pilihanMenu, banyakItem, kodePromo);
            totalKeseluruhan += totalHarga;
            
        }

        System.out.println("===========================================");
        System.out.println("Total harga untuk pesan anda: Rp" + totalKeseluruhan);
        System.out.println("===========================================");
        sc.close();
    }

    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon untuk setiap pembelian!");
        }

        System.out.println("==== MENU RESTO KAFE ====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappucino  - Rp 20,000");
        System.out.println("3. Latte      - Rp 22,000");
        System.out.println("4. Teh Tarik  - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("==========================");
        System.out.println("Silahkan Pilih Menu.");
        System.out.println("==========================");
    }

    public static int hitungTotalHarga10(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = { 15000, 20000, 22000, 12000, 10000, 18000 };

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        if (kodePromo.equals("DISKON50")) {
            System.out.println("Diskon 50% telah digunakan!");
            hargaTotal = hargaTotal - (hargaTotal * 50 / 100);
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Diskon 30% telah digunakan!");
            hargaTotal = hargaTotal - (hargaTotal * 30 / 100);
        } else {
            System.out.println("Kode promo invalid! Tidak ada diskon.");
        }
        return hargaTotal;
    }

}
