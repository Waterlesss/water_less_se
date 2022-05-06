package interface_test.shape;

public class C extends B{
    //C是普通类，必须覆写B中所有的抽象方法(包括继承来的抽象方法)
    @Override
    void print(){
    }
    @Override
    void say() {
    }
    @Override
    void printA() {

    }

}
abstract class A{
    abstract void print();
    abstract void say();
}

abstract class B extends A{
    //B是抽象类，可以选择性的覆写父类抽象方法
    abstract void printA();
    abstract void print();
    abstract void say();

//     void printA() {};
}