
import java.util.Scanner;

class RelationalOperators {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter First Number  : ");
        int num1 = s1.nextInt();
        System.out.print("Enter Second Number : ");
        int num2 = s1.nextInt();

        System.out.println("Num1 is Bigger than Num2 :  " + (num1 > num2));
        System.out.println("Num1 is Smaller than Num2 : " + (num1 < num2));
        System.out.println("Num1 is Greater than or Equal to Num2 : " + (num1 >= num2));
        System.out.println("Num1 is Less than or Equal to Num2 : " + (num1 <= num2));
        System.out.println("Num1 is Equal to Num2 : " + (num1 == num2));
        System.out.println("Num1 is Not Equal to Num2 : " + (num1 != num2));

        s1.close();
    }
}