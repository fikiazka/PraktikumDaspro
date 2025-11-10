package PraktikumDaspro.Jobsheet08;

import java.util.Scanner;

public class NilaiKelompok10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai, totalNilai, rataNilai;
        int i = 1;
        while (i <= 6) {
            System.out.println("Kelompok " + i);
            totalNilai = 0;

            for (int j = 1; j <= 5; j++) {
                System.out.print("Masukkan nilai ke-" + j + ": ");
                nilai = sc.nextDouble();
                totalNilai += nilai;
            }

            rataNilai = totalNilai / 5;
            System.out.println("Rata - rata: " + rataNilai);
            i++;
        }
        sc.close();
    }
}