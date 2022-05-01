package interface_test.shape;

public class Example extends BaseTest{
    private int num = 10;
    @Override
    void print() {
        System.out.println("num=" + num);
    }

    public static void main(String[] args) {
        new Example();
    }
}

abstract class BaseTest {
    public BaseTest() {
        this.print();
    }

    abstract void print();
}
