public class Main {
    public static void main(String[] args) {
        exempleAB();
    }

    private static void exempleAB() {
        A a1 = new A();
        B b1 = new B();

        B b2 = new B();

        System.out.println(a1.getId());
        System.out.println(b1.getId());
        System.out.println(b2.getId());

        A a2 = new B();
        System.out.println(a2.getId());
    }
}