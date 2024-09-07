
import java.util.Scanner;

public class CLASSS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maths, physics, turkish, chemistry, music;

        System.out.println("Please enter your | MATHS - PHYSICS - TURKISH - CHEMISTRY - MUSIC | scores in order:");
        maths = scanner.nextInt();
        physics = scanner.nextInt();
        turkish = scanner.nextInt();
        chemistry = scanner.nextInt();
        music = scanner.nextInt();

        int average = (maths + physics + turkish + chemistry + maths) / 5;

        if (average >= 55 && average <= 100) {
            System.out.println("Passed the grade. Congrulations!");
        }
        else if (average < 55 && average >= 00) {
            System.out.println("You failed the grade.");
        }
        else {
            System.out.println("Your average have to be between 0 and 100");
        }
    }
}
