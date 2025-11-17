package PraktikumDaspro.Jobsheet09;

import java.util.Scanner;

public class ArrayRataNilai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMhs = sc.nextInt();

        int[] nilaiMhs = new int[jumlahMhs];
        double totalLulus = 0;
        int jumlahTidakLulus = 0;

        double mhsTidakLulus = 0;
        int jumlahMhsLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }

        int nilaiTertinggi = nilaiMhs[0];
        int nilaiTerendah = nilaiMhs[0];

        for (int nilai : nilaiMhs) {
            if (nilai > 70) {
                totalLulus += nilai;
                jumlahMhsLulus++;
            } else {
                mhsTidakLulus += nilai;
                jumlahTidakLulus++;
            }

            if (nilai > nilaiTertinggi) {
                nilaiTertinggi = nilai;
            }

            if (nilai < nilaiTerendah) {
                nilaiTerendah = nilai;
            }
        }

        double rataLulus = (jumlahMhsLulus > 0) ? (totalLulus / jumlahMhsLulus) : 0;
        double rataTidakLulus = (jumlahTidakLulus > 0) ? (mhsTidakLulus / jumlahTidakLulus) : 0;

        System.out.println("Rata - Rata nilai lulus = " + rataLulus);
        System.out.println("Rata - Rata nilai tidak lulus = " + rataTidakLulus);
        System.out.println("Nilai tertinggi = " + nilaiTertinggi);
        System.out.println("Nilai terendah  = " + nilaiTerendah);

        sc.close();
    }
}