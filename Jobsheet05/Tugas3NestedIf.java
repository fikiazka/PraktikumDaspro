package PraktikumDaspro.Jobsheet05;

import java.util.Scanner;

public class Tugas3NestedIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B, C;
        int max, min;

        System.out.print("Input Bilangan A: ");
        A = sc.nextInt();

        System.out.print("Input Bilangan B: ");
        B = sc.nextInt();

        System.out.print("Input Bilangan C: ");
        C = sc.nextInt();

        // Mencari Nilai Maksimum
        if (A > B) {
            if (A > C) {
                max = A;
            } else {
                max = C;
            }
        } else {
            if (B > C) {
                max = B;
            } else {
                max = C;
            }
        }

        // Mencari Nilai Minimum
        if (A < B) {
            if (A < C) {
                min = A;
            } else {
                min = C;
            }
        } else {
            if (B < C) {
                min = B;
            } else {
                min = C;
            }
        }

        System.out.println("Nilai Bilangan Maksimum: " + max);
        System.out.println("Nilai Bilangan Minimum: " + min);
        sc.close();
    }
}