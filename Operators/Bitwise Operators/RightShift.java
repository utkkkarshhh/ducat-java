import java.util.Scanner;

public class RightShift {

    static int RightShift1(int x, int y) {
        return x >> y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        System.out.println(RightShift1(i, j));
        sc.close();
    }
}
