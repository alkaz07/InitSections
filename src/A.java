public class A {

    private static int lastId;
    private int id;

    public int getId() {
        return id;
    }

    {
        System.out.println("first init section of A");
    }


    {
        System.out.println("second init section of A");
    }
    public A() {
        System.out.println("default constructor A");
        lastId++;
        id = lastId;
    }

    {
        System.out.println("third init section of A");
    }

    static {
        System.out.println("STATIC init section of A");
        lastId=123;
    }
}
