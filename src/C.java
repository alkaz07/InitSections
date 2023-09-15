public class C {
    String name;
    int value;

   /* public C() {
        System.out.println("default constructor C");
    }*/

    public C(String name) {
        System.out.println("constructor C with name");
        this.name = name;
    }

    public C(String name, int value) {
        System.out.println("constructor C with name and value");
        this.name = name;
        this.value = value;
    }


}
