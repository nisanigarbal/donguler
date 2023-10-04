import java.util.Scanner;
public class harmonik {
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print(" N sayısını girin: ");
        int n = scan.nextInt();
        double result = 0.0;

        for(int i =1;i<=n;i++){
            result +=(1.0/i);
        }
        System.out.println(result);
    }
}
