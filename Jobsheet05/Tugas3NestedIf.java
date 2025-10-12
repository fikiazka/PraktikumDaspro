package PraktikumDaspro.Jobsheet05;
import java.util.Scanner;

public class Tugas3NestedIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B, C;

        System.out.print("Input Bilangan A: ");
        A = sc.nextInt();

        System.out.print("Input Bilangan B: ");
        B = sc.nextInt();

        System.out.print("Input Bilangan C: ");
        C = sc.nextInt();

        //Mencari Nilai Maksimum
        if (A > B) {
            if (A > C) {
                System.out.println("Nilai Maksimumnya adalah A: " + A);
            } else {
                System.out.println("Nilai Maksimumnya adalah C: " + C);
            }
        } else {
            if (B > C) {
                System.out.println("Nilai Maksimumnya adalah B: " + B);
            } else {
                System.out.println("Nilai Maksimumnya adalah C: " + C);
            }
        }

        //Mencari Nilai Minimum 
        if (A < B) {
            if (A < C) {
                System.out.println("Nilai Minimumnya adalah A: " + A);
            } else {
                System.out.println("Nilai Minimumnya adalah C: " + C);
            }
        } else {
            if (B < C) {
                System.out.println("Nilai Minimumnya adalah B: " + B);
            } else {
                System.out.println("Nilai Minimumnya adalah C: " + C);
            }
        }
    
        sc.close(); 
    }
}