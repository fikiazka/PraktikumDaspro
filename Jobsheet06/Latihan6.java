import java.util.Scanner;

public class Latihan6 {
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

        switch (opsiDaya) {
            case 900:
                tarifListrik = 1300;
                break;
            case 1300:
            case 2200:
                tarifListrik = 1500;
                break;
            case 3500:
            case 5500:
                tarifListrik = 1700;
                break;
            default:
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
