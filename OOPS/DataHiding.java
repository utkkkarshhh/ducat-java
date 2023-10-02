import java.util.Scanner;

class Rectangle {
    private double length;
    private double breadth;

    // Set Function
    public void setLength(Scanner sc) {
        System.out.print("Enter Length : ");
        double input = sc.nextDouble();
        if (input > 0) {
            length = input;
        } else
            length = 0;
    }

    public void setBreadth(Scanner sc) {
        System.out.print("Enter breadth: ");
        double input = sc.nextDouble();
        if (input > 0) {
            breadth = input;
        } else {
            breadth = 0;
        }
    }

    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }

    public double area() {
        return length * breadth;
    }

    public double perimeter() {
        return 2 * (length + breadth);
    }

    public boolean isSquare() {
        return length == breadth;
    }

}

public class DataHiding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle r = new Rectangle();

        r.setLength(sc);
        r.setBreadth(sc);

        System.out.println("Area of Rectangle is : " + r.area());
        System.out.println("Perimeter of Rectangle is : " + r.perimeter());
        System.out.println("Is Rectangle a square : " + r.isSquare());
    }
}