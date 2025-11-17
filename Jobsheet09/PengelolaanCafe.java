package PraktikumDaspro.Jobsheet09;

import java.util.Scanner;

public class PengelolaanCafe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         String[] daftarMenu = {
                "Nasi Goreng", "Mie Goreng", "Roti Bakar",
                "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"
        };

        double[] daftarHarga = {
                20000, 22000, 15000,
                17000, 13000, 18000, 20000
        };

        int[] daftarPesanan = new int[daftarMenu.length];

        while (true) {
            System.out.print("Masukkan jumlah pesanan (ketik 0 untuk keluar): ");
            int jumlahPesanan = sc.nextInt();
            sc.nextLine(); 

            if (jumlahPesanan == 0) {
                System.out.println("Pesanan Selesai!");
                break;
            }

            double totalBayar = 0;

            for (int i = 0; i < jumlahPesanan; i++) {
                System.out.print("Masukkan menu " + (i + 1) + ": ");
                String menuInput = sc.nextLine();

                int indexMenu = -1;
                for (int j = 0; j < daftarMenu.length; j++) {
                    if (daftarMenu[j].equalsIgnoreCase(menuInput)) {
                        indexMenu = j;
                        break;
                    }
                }

                if (indexMenu == -1) {
                    System.out.println("Menu tidak tersedia!");
                    i--; 
                    continue;
                }

                System.out.print("Masukkan jumlah: ");
                int jumlahItem = sc.nextInt();
                sc.nextLine();

                daftarPesanan[indexMenu] += jumlahItem;

                totalBayar += daftarHarga[indexMenu] * jumlahItem;
            }

            System.out.println("Total: " + (int) totalBayar);
        }
        sc.close();
    }
}