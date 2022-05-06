package interface_test.demo;

public class Fun extends BaseTest {
    public Fun() {
        System.out.println("子类的无参构造");
    }
    public Fun(int age) {
        System.out.println("子类的有参构造，age=" + age);
    }
    private int num = 10;
    //覆写父类的抽象方法
    void print() {
        System.out.println("num=" + num);
    }
    public static void main(String[] args) {
        //newFun的时候先在子类的无参构造首行默认调用父类的无参构造
        new Fun(10);
    }
}
abstract class BaseTest {
    public BaseTest() {
        this.print();
        System.out.println("父类的无参构造");
    }
    public BaseTest(int age) {

        System.out.println("父类的有参构造，age=" +age);
    }
    abstract void print();
}