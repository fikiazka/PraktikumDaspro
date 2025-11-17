package PraktikumDaspro.Jobsheet09;

import java.util.Scanner;

public class ArrayRataNilai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiMhs = new int[10];
        double total = 0, rata2;
        int jumlahMhsLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];

            if (nilaiMhs[i] > 70) {
                jumlahMhsLulus++;
            }
        }

        rata2 = total / nilaiMhs.length;
        System.out.println("Rata - Rata nilai= " + rata2);
        System.out.println("Jumlah Mahasiswa yang lulus = " + jumlahMhsLulus);

        sc.close();
    }
}