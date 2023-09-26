
// Write a Program to Calculate Simple Interest ?
// Expexted:- Principal amount:
// 	Annual interest rate:	
// 	Period:
// output-
// 	Interest amount:
// 	Total amount:
import java.util.Scanner;

public class SimpleInterest {

    static float SI(int interest, int principal, int time) {
        float si = (principal * interest * time) / 100;
        return si;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the principal amount");
        int principal = sc.nextInt();

        System.out.println("Enter the interest rate");
        int interest = sc.nextInt();

        System.out.println("Enter the time");
        int time = sc.nextInt();

        sc.close();

        float interestAmount = SI(principal, interest, time);
        float totalAmount = interestAmount + principal;

        System.out.println("Interest Amount is :" + interestAmount);
        System.out.println("Total amount is :" + totalAmount);

    }
}
