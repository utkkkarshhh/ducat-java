// Write a Program to Calculate Area of Rectangle?
// Write a Program to Calculate Area of Circle?
// Write a Program to Calculate Area of Triangle?

public class AreaCalculator {

    static int Rectangle(int length, int breadth) {
        int area = length * breadth;
        return area;
    }

    static double Circle(int radius) {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    static int Triangle(int base, int height) {
        int area = (base * height) / 2;
        return area;
    }

    public static void main(String[] args) {
        int rectangleArea = Rectangle(10, 8);
        double circleArea = Circle(20);
        int triangleArea = Triangle(10, 30);

        System.out.println("Area of Rectangle is : " + rectangleArea);
        System.out.println("Area of Circle is : " + circleArea);
        System.out.println("Area of Triangle is : " + triangleArea);

    }
}
