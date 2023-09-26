public class TypePromotion {

    static void show(int i) {
        System.out.println("int i :" + i);
    }

    static void show(long i) {
        System.out.println("long i :" + i);
    }

    static void show(double i) {
        System.out.println("double i :" + i);
    }

    static void show(float i) {
        System.out.println("float i :" + i);
    }

    public static void main(String[] args) {
        show('A');
    }
}
