package polymorphism;

public abstract class A {
    public abstract void fun();

    public static void main(String[] args) {
        A a = new C();
        a.fun();
    }
}

 class C extends A {

     @Override
     public void fun() {
         System.out.println("C覆写A的抽象方法");
     }
 }