// Write a Program to Calculate GST Tax Calculator?
// Expected:- Initial amount
// GST Rate
// output:-
// Net amount
// GST amount
// Gross amount

import java.util.Scanner;

public class GSTCalculator {

    static float GST(float amount, float rate) {
        float gstAmount = (amount * rate) / 100;
        return gstAmount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Initial Amount");
        int initialAmount = sc.nextInt();

        System.out.println("Enter GST Rate");
        int gstRate = sc.nextInt();

        sc.close();

        float gst = GST(initialAmount, gstRate);
        float netAmount = gst + initialAmount;

        System.out.println("GST Amount is : " + gst);
        System.out.println("Net amount is : " + netAmount);
    }
}