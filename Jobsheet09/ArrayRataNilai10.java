package PraktikumDaspro.Jobsheet09;

import java.util.Scanner;

public class ArrayRataNilai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMhs = sc.nextInt();

        int[] nilaiMhs = new int[jumlahMhs];
        double total = 0;
        int jumlahMhsLulus = 0;
        int mhsTidakLulus = 0;
        int jumlahTidakLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }

        for (int nilai : nilaiMhs) {
            if (nilai > 70) {
                total += nilai;
                jumlahMhsLulus++;
            } else {
                mhsTidakLulus += nilai;
                jumlahTidakLulus++;
            }
        }

        double rataLulus = (total > 0) ? (total / jumlahMhsLulus) : 0;
        double rataTidakLulus = (jumlahTidakLulus > 0) ? (mhsTidakLulus / jumlahTidakLulus) : 0;

        System.out.println("Rata - Rata nilai lulus = " + rataLulus);
        System.out.println("Rata - Rata nilai tidak lulus =" + rataTidakLulus);

        sc.close();
    }
}