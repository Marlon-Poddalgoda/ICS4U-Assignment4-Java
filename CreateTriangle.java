import java.util.Scanner;
/**
 * This program creates a triangle and calculates the area using user input.
 *
 * @author  Marlon Poddalgoda
 * @version 1.0
 * @since 2021-05-30
 */

public final class CreateTriangle {
    private CreateTriangle() {

        // Throw an exception if this ever *is* called
        throw new AssertionError("Instantiating utility class.");
    }

    /**
    * This method creates a triangle instance.
    * @param args
    */
    public static void main(final String[] args) {
        // main stub, creates triangle

        // basic info
        System.out.println("This program calculates different trig methods.");
        System.out.println("All lengths are in cm.");
        System.out.println();

        // Create new Scanner
        Scanner inputA = new Scanner(System.in);
        Scanner inputB = new Scanner(System.in);
        Scanner inputC = new Scanner(System.in);

        try {
            // try statement

            // variables
            int lengthA;
            int lengthB;
            int lengthC;

            // user input
            // side A input
            System.out.print("Enter the length of side A: ");
            // check if input is an integer
            while (!inputA.hasNextInt()) {
                System.out.println("That's not a number!");
                System.out.print("Enter the length of side A: ");
                inputA.next(); // moves scanner until correct value
            }
            lengthA = inputA.nextInt();

            // side B input
            System.out.print("Enter the length of side B: ");
            // check if input is an integer
            while (!inputB.hasNextInt()) {
                System.out.println("That's not a number!");
                System.out.print("Enter the length of side B: ");
                inputB.next(); // moves scanner until correct value
            }
            lengthB = inputB.nextInt();

            // side C input
            System.out.print("Enter the length of side C: ");
            // check if input is an integer
            while (!inputC.hasNextInt()) {
                System.out.println("That's not a number!");
                System.out.print("Enter the length of side C: ");
                inputC.next(); // moves scanner until correct value
            }
            lengthC = inputC.nextInt();

            // create new triangle instance
            Triangle triangle = new Triangle(lengthA, lengthB, lengthC);

            // print name
            System.out.println();
            System.out.println("This is a "
                            + triangle.findName() + " triangle.");

            // print semiperimeter, area and height
            System.out.println();
            System.out.println("The perimeter of this triangle is "
                            + triangle.getPeri() + " cm.");
            System.out.println("The area of this triangle is "
                            + triangle.calcArea() + " cm².");
            System.out.println("The height of this triangle is "
                            + triangle.calcHeight() + " cm.");

            // print radius of incircle, area of circumcircle
            System.out.println();
            System.out.println("This radius of the incircle is "
                            + triangle.incircleRad() + " cm.");
            System.out.println("This area of the circumcircle is "
                            + triangle.circumcircleArea() + " cm².");

            // Done
            System.out.println();
            System.out.println("Done.");

        } catch (Exception e) {
            System.out.println("Sorry, that's not a valid triangle.");
        }
    }
}
