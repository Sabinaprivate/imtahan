package sual3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);    System.out.print("tam eded daxil edin: ");
        int n = scanner.nextInt();    int toplam = 0;
        while (n > 0) {        toplam += n % 10;
            n /= 10;    }
        System.out.println("ededin cemi: " + toplam);}

}
