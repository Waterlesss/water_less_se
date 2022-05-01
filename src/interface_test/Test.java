package interface_test;

public class Test {
    public static void main(String[] args) {
        new Student().fun();
    }

}

class Person {
    public void fun() {
        this.test();
    }
    private void test() {
        System.out.println("1.Person的test方法");
    }
}

class Student extends Person {
    public void test() {
        System.out.println("2.Student的test方法");
    }
}