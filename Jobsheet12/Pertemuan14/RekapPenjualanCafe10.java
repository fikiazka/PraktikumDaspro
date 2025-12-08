package Pertemuan14;

import java.util.Scanner;

public class RekapPenjualanCafe10 {

    static Scanner input = new Scanner(System.in);
    static String[] daftarMenu = { "Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan" };

    // Fungsi input data penjualan
    public static void inputDataPenjualan(int[][] dataPenjualanHarian) {
        for (int menu = 0; menu < 5; menu++) {
            System.out.println("\nInput penjualan untuk menu: " + daftarMenu[menu]);
            for (int hari = 0; hari < 7; hari++) {
                System.out.print("Hari ke-" + (hari + 1) + ": ");
                dataPenjualanHarian[menu][hari] = input.nextInt();
            }
        }
    }

    // Fungsi tampil data penjualan
    public static void tampilRekapPenjualan(int[][] rekapPenjualan) {
        System.out.println("\nREKAP PENJUALAN\n");

        System.out.printf("%-15s", "Menu/Hari");
        for (int hari = 1; hari <= 7; hari++) {
            System.out.printf("%-8s", "H" + hari);
        }
        System.out.println();

        for (int menu = 0; menu < daftarMenu.length; menu++) {
            System.out.printf("%-15s", daftarMenu[menu]); 

            for (int hari = 0; hari < 7; hari++) {
                System.out.printf("%-8d", rekapPenjualan[menu][hari]); 
            }
            System.out.println();
        }
    }

    // Fungsi mencari menu terlaris
    public static void cariMenuTerlaris(int[][] menuTerlaris) {
        int[] totalPerMenu = new int[5];

        for (int menu = 0; menu < 5; menu++) {
            for (int hari = 0; hari < 7; hari++) {
                totalPerMenu[menu] += menuTerlaris[menu][hari];
            }
        }

        int nilaiTertinggi = totalPerMenu[0];
        int indexMenuTerlaris = 0;

        for (int i = 1; i < 5; i++) {
            if (totalPerMenu[i] > nilaiTertinggi) {
                nilaiTertinggi = totalPerMenu[i];
                indexMenuTerlaris = i;
            }
        }

        System.out.println("\nMenu dengan penjualan tertinggi:");
        System.out.println(daftarMenu[indexMenuTerlaris] + " = " + nilaiTertinggi + " porsi");
    }

    // Fungsi hitung rata-rata
    public static void hitungRataPenjualan(int[][] rataPenjualan) {
        System.out.println("\nRata-rata penjualan tiap menu selama 7 hari):");

        for (int menu = 0; menu < 5; menu++) {
            int total = 0;

            for (int hari = 0; hari < 7; hari++) {
                total += rataPenjualan[menu][hari];
            }

            double rata = total / 7.0;
            System.out.printf("%s = %.2f%n", daftarMenu[menu], rata);
        }
    }

    public static void main(String[] args) {
        int[][] dataPenjualanMenu = new int[5][7];

        inputDataPenjualan(dataPenjualanMenu);
        tampilRekapPenjualan(dataPenjualanMenu);
        cariMenuTerlaris(dataPenjualanMenu);
        hitungRataPenjualan(dataPenjualanMenu);
    }
}