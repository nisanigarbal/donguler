import java.util.Scanner;
public class oneriverme {
    public static void main(String[]args) {
        int heat;
        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklık girin:");
        heat = input.nextInt();

        if (heat < 5){
            System.out.print(" kayak yapabilirsiniz..");
        }
        else if (heat >= 5 && heat <=25){
            if( heat <= 15){
                System.out.print("sinemaya gidebilirisin..");
            }
            if( heat >=10){
                System.out.print ("piknik yapabilirsiniz..");
            }
        }
        else {
            System.out.print("yüzmeye gideebilirsiniz..");
        }

    }
}
