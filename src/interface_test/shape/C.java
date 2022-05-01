package interface_test.shape;

public class C extends B{
    //C是普通类，必须覆写B中所有的抽象方法(包括继承来的抽象方法)
    @Override
    void printB() {

    }

    @Override
    void printA() {

    }
}

abstract class A{
    abstract void printA();
}

abstract class B extends A{
    //B是抽象类，可以选择性的覆写父类抽象方法
    abstract void printB();

//     void printA() {};
}