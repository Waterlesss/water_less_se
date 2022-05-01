package interface_test.shape;

public class Test {
    public static void main(String[] args) {
        //抽象类无法直接实例化对象
//        Shape shape = new Shape();
        fun(new Cycle());
        fun(new Square());
        fun(new Triangle());
    }
    //这个方法可以接收所有的Shape类，调用其打印方法
    public static void fun(Shape shape) {
        shape.print();
    }
}
