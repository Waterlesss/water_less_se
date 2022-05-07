package interface_test.demo;

public class Test {
}
interface IA{
    void testA();
}
interface IB{
    void testB();
}
//接口之间存在继承关系，可以多继承。
//接口坚决不能继承一个类
interface IC extends IA,IB{

}
class CImpl implements IC{

    @Override
    public void testA() {

    }

    @Override
    public void testB() {

    }
}
abstract class Person{

}
//一个类继承一个类，同时实现多个接口
//修饰符 class 类名 extends 父类名 implements 接口1,接口2{}
class China extends Person implements IA,IB{
    @Override
    public void testA() {

    }
    @Override
    public void testB() {

    }
}
