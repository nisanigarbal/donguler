import java.util.Scanner;

public class oddnumber {
    public static void main(String[] args) {

        int s;
        Scanner input =new Scanner(System.in);
        System.out.print("Sınıf Sayısı Giriniz: ");
        s= input.nextInt();

        System.out.print("Dördün katları: " );
        for (int i = 1; i <= s; i *= 4) {
            System.out.print(i + ",");
        }
        System.out.print("\nBeşin katları: ");
        for (int i = 1; i <= s; i *= 5) {
            System.out.print(i + ",");
        }

    }
}
