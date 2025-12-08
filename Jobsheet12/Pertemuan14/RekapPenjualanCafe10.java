package Pertemuan14;

import java.util.Scanner;

public class RekapPenjualanCafe10 {

    static Scanner input = new Scanner(System.in);

    // Fungsi input data penjualan
    public static void inputDataPenjualan(int[][] dataPenjualanHarian, String[] daftarMenu, int jumlahHari,
            int jumlahMenu) {
        for (int menu = 0; menu < jumlahMenu; menu++) {
            System.out.println("\nInput penjualan untuk menu: " + daftarMenu[menu]);
            for (int hari = 0; hari < jumlahHari; hari++) {
                System.out.print("Hari ke-" + (hari + 1) + ": ");
                dataPenjualanHarian[menu][hari] = input.nextInt();
            }
        }
    }

    // Fungsi tampil data penjualan
    public static void tampilRekapPenjualan(int[][] rekapPenjualan, String[] daftarMenu, int jumlahHari,
            int jumlahMenu) {
        System.out.println("\nREKAP PENJUALAN\n");

        System.out.printf("%-15s", "Menu/Hari");
        for (int hari = 0; hari < jumlahHari; hari++) {
            System.out.printf("%-8s", "H" + hari);
        }
        System.out.println();

        for (int menu = 0; menu < jumlahMenu; menu++) {
            System.out.printf("%-15s", daftarMenu[menu]);

            for (int hari = 0; hari < jumlahHari; hari++) {
                System.out.printf("%-8d", rekapPenjualan[menu][hari]);
            }
            System.out.println();
        }
    }

    // Fungsi mencari menu terlaris
    public static void cariMenuTerlaris(int[][] menuTerlaris, String[] daftarMenu, int jumlahHari, int jumlahMenu) {
        int[] totalPerMenu = new int[jumlahMenu];

        for (int menu = 0; menu < jumlahMenu; menu++) {
            for (int hari = 0; hari < jumlahHari; hari++) {
                totalPerMenu[menu] += menuTerlaris[menu][hari];
            }
        }

        int indexTerlaris = 0;

        for (int i = 1; i < jumlahMenu; i++) {
            if (totalPerMenu[i] > totalPerMenu[indexTerlaris]) {
                indexTerlaris = i;
            }
        }
        System.out.println("\nMenu dengan penjualan tertinggi:");
        System.out.println(daftarMenu[indexTerlaris] + " = " + totalPerMenu[indexTerlaris] + " porsi");
    }

    // Fungsi hitung rata-rata
    public static void hitungRataPenjualan(int[][] rataPenjualan, String[] daftarMenu, int jumlahHari, int jumlahMenu) {
        System.out.println("\nRata-rata penjualan tiap menu selama 7 hari):");

        for (int menu = 0; menu < jumlahMenu; menu++) {
            int total = 0;

            for (int hari = 0; hari < jumlahHari; hari++) {
                total += rataPenjualan[menu][hari];
            }

            double rata = total * 1.0 / jumlahHari;
            System.out.printf("%s = %.2f%n", daftarMenu[menu], rata);
        }
    }

    public static void main(String[] args) {
        System.out.print("Masukkan jumlah menu: ");
        int jumlahMenu = input.nextInt();
        input.nextLine(); // buang newline

        String[] daftarMenu = new String[jumlahMenu];

        System.out.println("\nMasukkan nama setiap menu:");
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print("Menu " + (i + 1) + ": ");
            daftarMenu[i] = input.nextLine();
        }

        System.out.print("\nMasukkan jumlah hari penjualan: ");
        int jumlahHari = input.nextInt();

        int[][] dataPenjualan = new int[jumlahMenu][jumlahHari];

        // Pemanggilan fungsi
        inputDataPenjualan(dataPenjualan, daftarMenu, jumlahHari, jumlahMenu);
        tampilRekapPenjualan(dataPenjualan, daftarMenu, jumlahHari, jumlahMenu);
        cariMenuTerlaris(dataPenjualan, daftarMenu, jumlahHari, jumlahMenu);
        hitungRataPenjualan(dataPenjualan, daftarMenu, jumlahHari, jumlahMenu);
    }
}