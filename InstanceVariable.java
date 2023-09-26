class InstanceVariable {
    boolean c;
    byte b1;
    short s;
    int i;
    long l;
    float f;
    double d;
    String name;
    static int price;

    public static void main(String[] args) {
        // Object => New allocates memory during runtime and stores it in a heap.
        // Local Variable must be initailised
        InstanceVariable t1 = new InstanceVariable();
        System.out.println(t1.c);
        System.out.println(t1.b1);
        System.out.println(t1.s);
        System.out.println(t1.i);
        System.out.println(t1.l);
        System.out.println(t1.f);
        System.out.println(t1.d);
        System.out.println(t1.name);
        System.out.println(price);
    }
}