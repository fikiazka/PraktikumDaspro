package PraktikumDaspro.Jobsheet08;

public class KuadratBilangan {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            int jumlah = 0;

            for (int j = 1; j <= i; j++) {
                jumlah += j * j;
            }

            System.out.print("n = " + i + " -> jumlah kuadrat = ");

            for (int j = 1; j <= i; j++) {
                System.out.print(j * j);
                if (j < i) {
                    System.out.print(" + ");
                }
            }
            System.out.println(" = " + jumlah);
        }
    }
}