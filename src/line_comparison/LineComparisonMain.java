package line_comparison;

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
    }
}