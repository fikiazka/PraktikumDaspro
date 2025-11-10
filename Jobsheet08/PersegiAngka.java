package PraktikumDaspro.Jobsheet08;

import java.util.Scanner;

public class PersegiAngka {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai n (minimal 3): ");
        int n = input.nextInt();

        if (n < 3) {
            System.out.println("Nilai n harus minimal 3!");
            input.close();
            return;
        }

        for (int baris = 1; baris <= n; baris++) {
            for (int kolom = 1; kolom <= n; kolom++) {
                if (baris == 1 || baris == n || kolom == 1 || kolom == n) {
                    System.out.print(n + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        input.close();
    }
}