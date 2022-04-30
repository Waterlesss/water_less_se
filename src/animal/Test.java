package animal;

public class Test {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.name = "动物";
        animal.eat("烧烤");


        Cat cat = new Cat();
        cat.name = "喵喵";
        cat.setAge(22);
        System.out.println(cat.getAge());
        cat.eat("猫粮");

        Dog dog = new Dog();
        dog.name = "呆呆";
        dog.setAge(10);
        System.out.println(Dog.test);
        System.out.println(dog.getAge());
        dog.eat("骨头");
        Chaiquan cq = new Chaiquan();
        cq.name = "晶晶";
        cq.setAge(12);
        cq.eat("肉肉");
        System.out.println(Chaiquan.test);
    }
//    public  void fun(Animal animal) {}
}
