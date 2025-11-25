import java.util.Scanner;

public class BioskoWithScanner10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] penonton = new String[4][2];
        int baris, kolom, menu;
        String nama, daftarPenonton;

        do {
            System.out.println("==== Menu Bioskop ====");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();

                    while (true) {
                        System.out.print("Masukkan baris (1-4): ");
                        baris = sc.nextInt();

                        System.out.print("Masukkan kolom(1-2): ");
                        kolom = sc.nextInt();
                        sc.nextLine();

                        if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                            System.out.println("Baris / Kolom Tidak Tersedia!");
                            continue;
                        }

                        if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println("Kursi sudah terisi! Silahkan pilih kuris lainnya.");
                        } else {
                            break;
                        }
                    }

                    penonton[baris - 1][kolom - 1] = nama;
                    System.out.println("Data Berhasil Disimpan!");
                    break;
                case 2:
                    System.out.println("==== Daftar Penonton ====");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            daftarPenonton = (penonton[i][j] == null) ? "-" : penonton[i][j];
                            System.out.print(daftarPenonton + "\t");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Program selesai. Terima Kasih!");
                    break;
                default:
                    System.out.println("Input Invalid!");
                    break;
            }

        } while (menu != 3);

        sc.close();
    }
}