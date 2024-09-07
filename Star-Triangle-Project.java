import java.util.Scanner;

public class DiamondShapeWithStars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the height of the diamond: ");
        int height = input.nextInt();

        int spaceCount = height - 1;
        int starCount = 1;

        // Drawing the upper part
        for (int i = 0; i < height; i++) {

            // Printing spaces
            for (int j = 0; j < spaceCount; j++) {
                System.out.print(" ");
            }

            // Printing stars
            for (int j = 0; j < starCount; j++) {
                System.out.print("*");
            }
            System.out.println();

            spaceCount--;
            starCount += 2;
        }
        spaceCount = 1;
        starCount = 2 * height - 3;

        // Drawing the lower part
        for (int i = 0; i < height - 1; i++) {

            // Printing spaces
            for (int j = 0; j < spaceCount; j++) {
                System.out.print(" ");
            }

            // Printing stars
            for (int j = 0; j < starCount; j++) {
                System.out.print("*");
            }

            System.out.println();

            spaceCount++;
            starCount -= 2;
        }
    }
}
