import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] survey = new int[10][6];

        // A. MENYIMPAN HASIL SURVEY
        for (int i = 0; i < 10; i++) {
            System.out.println("Masukkan nilai untuk responden " + (i + 1));

            for (int j = 0; j < 6; j++) {
                System.out.print("Pertanyaan " + (j + 1) + " (1-5): ");
                survey[i][j] = sc.nextInt();
            }
            
            System.out.println();
        }

        // B. RATA-RATA PER RESPONDEN
        System.out.println("===== Rata-rata per Responden =====");
        for (int i = 0; i < 10; i++) {
            int jumlah = 0;

            for (int j = 0; j < 6; j++) {
                jumlah += survey[i][j];
            }

            double rata2 = (double) jumlah / 6;
            System.out.println("Rata-rata responden " + (i + 1) + " = " + rata2);
        }

        // C. RATA-RATA PER PERTANYAAN
        System.out.println("\n===== Rata-rata per Pertanyaan =====");
        for (int j = 0; j < 6; j++) {
            int jumlahPertanyaan = 0;

            for (int i = 0; i < 10; i++) {
                jumlahPertanyaan += survey[i][j];
            }

            double rataPertanyaan = (double) jumlahPertanyaan / 10;
            System.out.println("Rata-rata pertanyaan " + (j + 1) + " = " + rataPertanyaan);
        }

        // D. RATA-RATA KESELURUHAN
        int jumlahKeseluruhan = 0;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                jumlahKeseluruhan += survey[i][j];
            }
        }

        double totalRataSurvey = (double) jumlahKeseluruhan / (10 * 6);
        System.out.println("===== Rata-rata Keseluruhan =====");
        System.out.println("Rata-rata keseluruhan: " + totalRataSurvey);

        sc.close();
    }
}
