import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter First Number  : ");
        int num1 = s1.nextInt();
        System.out.print("Enter Second Number : ");
        int num2 = s1.nextInt();
        System.out.print("Enter Third Number : ");
        int num3 = s1.nextInt();

        System.out.println("Result of (num1 >= num2 && num3 <= num2): " + (num1 >= num2 && num3 <= num2));
        System.out.println("Result of (num1 <= num2 && num2 >= num1): " + (num1 <= num2 && num2 >= num1));
        System.out.println("Result of (num1 >= num2 || num2 >= num3): " + (num1 >= num2 || num2 >= num3));
        System.out.println("Result of (num1 <= num2 || num1 >= num3): " + (num1 <= num2 || num1 >= num3));
        System.out.println("Result of !(num1 <= num2 && num2 >= num1): " + !(num1 <= num2 && num2 >= num1));
        System.out.println("Result of !(num1 <= num2 || num1 >= num3): " + !(num1 <= num2 || num1 >= num3));

        s1.close();
    }
}