package supertest;

public class Dog extends Animal{

    public Dog() {
        super("狗子");
        System.out.println("2.子类Dog的无参构造");
    }

    public Dog(String name) {
        super(name);
        System.out.println("2.Dog的有参构造");
    }

    protected void test() {
        super.play();
    }

    public static void main(String[] args) {

        Dog dog = new Dog("柴犬");
        dog.test();
    }
}
