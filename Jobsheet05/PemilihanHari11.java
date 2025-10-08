package PraktikumDaspro.Jobsheet05;

import java.util.Scanner;

public class PemilihanHari11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String dayName, dayType;

        System.out.print("Input day name: ");
        dayName = sc.nextLine();

        switch (dayName) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "friday":
                dayType = "weekday";
                break;
            case "saturday":
            case "sunday":
                dayType = "weekend";
                break;
            default:
                dayType = "invalid day name";
        }
        System.out.println(dayName + " is a " + dayType);
        sc.close();
    }
}
