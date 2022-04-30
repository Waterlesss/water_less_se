package polymorphism;

public class D extends B{

    private int num = 10;

    public void fun() {
        System.out.println("D.fun num=" + num);
    }

    public D() {
        super();
    }

    public static void main(String[] args) {

        D d = new D();
        d.fun();
    }
}
