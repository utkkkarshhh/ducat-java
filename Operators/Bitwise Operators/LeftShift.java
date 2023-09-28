import java.util.Scanner;

public class LeftShift {

    static int LeftShift1(int x, int y) {
        return x << y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        System.out.println(LeftShift1(i, j));
        sc.close();
    }
}
