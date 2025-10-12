package PraktikumDaspro.Jobsheet05;
import java.util.Scanner;

public class Tugas3OperatorLogika {
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
        if ((A >= B) && (A >= C)) {
            max = A;
        } else if ((B >= A) && (B >= C)) {
            max = B;
        } else {
            max = C;
        }

        // Mencari Nilai Minimum
        if ((A <= B) && (A <= C)) {
            min = A;
        } else if ((B <= A) && (B <= C)) {
            min = B;
        } else {
            min = C;
        }

        System.out.println("Nilai Bilangan Maksimum: " + max);
        System.out.println("Nilai Bilangan Minimum: " + min);

        sc.close();
    }
}