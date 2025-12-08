package Pertemuan14;

import java.util.Scanner;

public class Kubus10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi kubus: ");
        double sisi = sc.nextDouble();

        double volume = hitungVolume(sisi);
        double luasPermukaan = hitungLuasPermukaan(sisi);

        System.out.println("Volume Kubus = " + volume);
        System.out.println("Luas Permukaan Kubus = " + luasPermukaan);

        sc.close();
    }

    public static double hitungVolume(double sisi) {
        return sisi * sisi * sisi;
    }

    public static double hitungLuasPermukaan(double sisi) {
        return 6 * sisi * sisi;
    }
}
