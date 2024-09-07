# dikucgen
import java.util.Scanner;

public class dikucgenhesaplama {
    public dikucgenhesaplama() {
    }

    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.print("1.kenarı girin: ");
        int a = girdi.nextInt();
        System.out.print("2.kenarı girin:");
        int b = girdi.nextInt();
        double c = Math.sqrt((double)(a * a + b * b));
        System.out.println("hipo:" + c);
    }
}
