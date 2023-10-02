package OOPS;

import java.util.Scanner;

class Rectangle {
    public double length;
    public double width;

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }

    public boolean isSqaure() {
        if (length == width) {
            return true;
        } else
            return false;
    }
}

public class ClassPractice {
    public static void main(String[] args) {
        // Creating objects
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Length & Breadth of Rectangle 1");
        r1.length = sc.nextInt();
        r1.width = sc.nextInt();

        System.out.println("Enter Length & Breadth of Rectangle 2");
        r2.length = sc.nextInt();
        r2.width = sc.nextInt();

        sc.close();

        System.out.println("Rectange 1 Area: " + r1.area());
        System.out.println("Rectange 1 Perimeter: " + r1.perimeter());
        System.out.println("Rectange 1 is Square?: " + r1.isSqaure());

        System.out.println("Rectange 2 Area: " + r2.area());
        System.out.println("Rectange 2 Perimeter: " + r2.perimeter());
        System.out.println("Rectange 1 is Square?: " + r2.isSqaure());
    }
}
