public class B extends A{

    static {
        System.out.println("STATIC init section of B");
    }

    {
        System.out.println("first init section of B");
    }
    public B() {
        //������ ���������� ����������� �������� ������
        //super();
        System.out.println("default constructor B");
    }
}
