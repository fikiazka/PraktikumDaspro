package PraktikumDaspro.Jobsheet07;

import java.util.Scanner;

public class PembayaranParkir {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis, durasi, total = 0;

        do {
            System.out.print("Masukkan jenis kendaraan (1= Mobil, 2 Motor, 0 Keluar): ");
            jenis = sc.nextInt();
            sc.nextLine();

            if (jenis == 0) {
                break;
            }

            if (jenis != 1 && jenis != 2) {
                System.out.println("Jenis Kendaraan Tidak Valid!");
                continue;
            }
            System.out.print("Masukkan durasi: ");
            durasi = sc.nextInt();

            if (durasi > 5) {
                total += 12500;
            } else if (jenis == 1) { // mobil
                total += durasi * 3000;
            } else if (jenis == 2) { // motor
                total += durasi * 2000;
            }
        } while (true);
        System.out.println("Total Pembayaran Parkir: " + total);
        sc.close();
    }
}