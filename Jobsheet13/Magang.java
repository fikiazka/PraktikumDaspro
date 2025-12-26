package PraktikumDaspro.Jobsheet13;

import java.util.Scanner;

public class Magang {
    static String[] nama = new String[50];
    static String[] nim = new String[50];
    static String[] prodi = new String[50];
    static String[] perusahaan = new String[50];
    static int[] semester = new int[50];
    static String[] status = new String[50];

    static int jumlahData = 0;

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("\n=== Sistem Pendaftaran Magang Mahasiswa ===");
            System.out.println("1. Tambah Data Magang");
            System.out.println("2. Tampilkan Semua Pendaftar Magang");
            System.out.println("3. Cari Pendaftar berdasarkan Program Studi");
            System.out.println("4. Hitung Jumlah Pendaftar untuk Setiap Status");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    menambahData();
                    break;
                case 2:
                    menampilkanData();
                    break;
                case 3:
                    searchData();
                    break;
                case 4:
                    pendaftarByStatus();
                    break;
                case 5:
                    System.out.println("Program Selesai!");
                    break;
                default:
                    System.out.println("Pilihan Invalid!");
                    break;
            }
        } while (pilihan != 5);
    }

    public static void menambahData() {
        System.out.print("Nama Mahasiswa: ");
        nama[jumlahData] = sc.nextLine();
        System.out.print("NIM: ");
        nim[jumlahData] = sc.nextLine();
        System.out.print("Program Studi: ");
        prodi[jumlahData] = sc.nextLine();
        System.out.print("Perusahaan Tujuan Magang: ");
        perusahaan[jumlahData] = sc.nextLine();

        while (true) {
            System.out.print("Semester pengambilan magang (6 atau 7): ");
            int smt = sc.nextInt();
            sc.nextLine();
            if (smt == 6 || smt == 7) {
                semester[jumlahData] = smt;
                break;
            } else {
                System.out.println("Magang Hanya Untuk Semester 6 dan 7!");
            }
        }

        while (true) {
            System.out.print("Status Magang (Diterima/Menunggu/Ditolak): ");
            String sts = sc.nextLine();

            if (sts.equalsIgnoreCase("Diterima") || sts.equalsIgnoreCase("Menunggu")
                    || sts.equalsIgnoreCase("Ditolak")) {
                status[jumlahData] = sts;
                break;
            } else {
                System.out.println("Status Invalid!");
            }
        }
        jumlahData++;
        System.out.println("Data Berhasil Ditambahkan. Total Pendaftar: " + jumlahData);
    }

    public static void menampilkanData() {
        System.out.println("\n=== Data Pendaftaran Magang ===");

        if (jumlahData == 0) {
            System.out.println("Belum ada pendaftar.");
            return;
        }

        System.out.printf("%-5s %-15s %-20s %-20s %-20s %-10s %-10s\n", "No", "Nama", "NIM", "Prodi", "Perusahaan",
                "Semester",
                "Status");

        for (int i = 0; i < jumlahData; i++) {
            System.out.printf("%-5s %-15s %-20s %-20s %-20s %-10s %-10s\n", i + 1, nama[i], nim[i], prodi[i],
                    perusahaan[i], semester[i], status[i]);
        }
    }

    public static void searchData() {
        System.out.println("Masukkan Program Studi: ");
        String cari = sc.nextLine();

        boolean ditemukan = false;

        for (int i = 0; i < jumlahData; i++) {
            if (prodi[i].equalsIgnoreCase(cari)) {
                if (!ditemukan) {
                    System.out.println("\n=== Hasil Pencarian ===");
                    System.out.printf("%-5s %-15s %-20s %-20s %-20s %-10s %-10s\n", "No", "Nama", "NIM", "Prodi",
                            "Perusahaan", "Semester", "Status");
                    ditemukan = true;
                }
                System.out.printf("%-5s %-15s %-20s %-20s %-20s %-10s %-10s\n", i + 1, nama[i], nim[i], prodi[i],
                        perusahaan[i], semester[i], status[i]);
            }
        }
        if (!ditemukan) {
            System.out.println("Data Tidak Ditemukan.");
        }
    }

    public static void pendaftarByStatus() {
        if (jumlahData == 0) {
            System.out.println("Belum ada pendaftar.");
            return;
        }

        int diterima = 0, menunggu = 0, ditolak = 0;

        for (int i = 0; i < jumlahData; i++) {
            if (status[i].equalsIgnoreCase("Diterima"))
                diterima++;
            else if (status[i].equalsIgnoreCase("Menunggu"))
                menunggu++;
            else if (status[i].equalsIgnoreCase("Ditolak"))
                ditolak++;
        }

        System.out.println("\n=== Jumlah Pendaftar By Status ===");
        System.out.println("Diterima: " + diterima);
        System.out.println("Menunggu: " + menunggu);
        System.out.println("Ditolak: " + ditolak);
        System.out.println("Total pendaftar: " + jumlahData);
    }
}