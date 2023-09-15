public class D extends C{
    String color;

    public D(String color) {
        super(color+" zero");
        System.out.println("constructor D with color");
        this.color = color;
    }

    public D(int value, String color) {
        super(color+" "+value, value);
        System.out.println("constructor D with value and color");
        this.color = color;
    }
}
