package Pertemuan14;

import java.util.Scanner;

public class NilaiMahasiswa10 {
    public static void isianArray(int[] nilai, int jumlah) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
        }
        sc.close();
    }

    public static void tampilArray(int[] nilai) {
        System.out.println("\nDaftar Nilai Mahasiswa:");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Mahasiswa " + (i + 1) + ": " + nilai[i]);
        }
    }

    public static int hitTot(int[] nilai) {
        int total = 0;
        for (int n : nilai) {
            total += n;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int N = sc.nextInt();

        int[] nilaiMahasiswa = new int[N];

        isianArray(nilaiMahasiswa, N);
        tampilArray(nilaiMahasiswa);

        int totalNilai = hitTot(nilaiMahasiswa);
        System.out.println("\nTotal Nilai Seluruh Mahasiswa = " + totalNilai);

        sc.close();
    }
}
