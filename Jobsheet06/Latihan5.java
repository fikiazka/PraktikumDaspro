import java.util.Scanner;

public class Latihan5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int biayaListrikBulan = 50000;
        int tarifListrik = 0;
        double ppn = 0.1;
        int kwh;
        int biayaPemakaian;
        double totalBiayaListrik;

        System.out.println("Jumlah Kwh: ");
        kwh = sc.nextInt();

        System.out.println("Opsi Daya (900 / 1300 / 2200 / 3500 /5500): ");
        int opsiDaya = sc.nextInt();

        if (opsiDaya == 900) {
            tarifListrik = 1300;
            System.out.println("Jumlah tarif listrik 900VA: ");
        } else if (opsiDaya == 1300 || opsiDaya == 2200) {
            tarifListrik = 1500;
            System.out.println("Jumlah tarif listri 1300VA / 2200VA: ");
        } else if (opsiDaya == 3500 || opsiDaya == 5500) {
            tarifListrik = 1700;
            System.out.println("Jumlah tarif listrik 3500VA / 5500: ");
        } else {
            System.out.println("Tidak Ada Opsi Daya!");
            sc.close();
            return;
        }

        biayaPemakaian = biayaListrikBulan + (tarifListrik * kwh);
        System.out.println("Total biaya pemakaian: " + biayaPemakaian);

        ppn *= biayaPemakaian;
        System.out.println("Total PPN Listrik: " + ppn);

        totalBiayaListrik = biayaPemakaian + ppn;
        System.out.println("Total Biaya Listrik: " + totalBiayaListrik);
        
        sc.close();
    }
}
