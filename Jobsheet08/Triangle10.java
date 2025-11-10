package PraktikumDaspro.Jobsheet08;

import java.util.Scanner;

public class Triangle10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();
        int i = 0;

        while (i <= n) {
            int j = 0;

            while (j < 1) {
                System.out.print("*");
                j++;
            }

            i++;
        }
        sc.close();
    }
}
