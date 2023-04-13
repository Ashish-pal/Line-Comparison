package line_comparison;

import java.util.Objects;
import java.util.Scanner;

public class LineComparisonMain {
    public static void main(String[] args) {
        System.out.printf("Welcome to Line Comparison Computation Program");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter coordinates for point A: ");
        System.out.print("x1 = ");
        double x1 = sc.nextDouble();
        System.out.print("y1 = ");
        double y1 = sc.nextDouble();
        System.out.println("Enter coordinates for point B: ");
        System.out.print("x2 = ");
        double x2 = sc.nextDouble();
        System.out.print("y2 = ");
        double y2 = sc.nextDouble();
        double length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("The length of the line segment AB is " + length);

        System.out.println("Enter coordinates for point C: ");
        System.out.print("p1 = ");
        double p1 = sc.nextDouble();
        System.out.print("q1 = ");
        double q1 = sc.nextDouble();
        System.out.println("Enter coordinates for point D: ");
        System.out.print("p2 = ");
        double p2 = sc.nextDouble();
        System.out.print("q2 = ");
        double q2 = sc.nextDouble();
        double length2 = Math.sqrt(Math.pow(p2 - p1, 2) + Math.pow(q2 - q1, 2));
        System.out.println("The length of the line segment CD is " + length2);

        if (Objects.equals(length, length2)) {
            System.out.println("Line 1 is equal to line 2.");
        } else {
            System.out.println("Line 1 is not equal to line 2.");
        }
    }
}