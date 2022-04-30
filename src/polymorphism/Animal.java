package polymorphism;

public class Animal {

    public static void main(String[] args) {

        Animal animal1 = new Animal();
        Animal bird = new Bird();
        Animal duck = new Duck();
        Animal cat = new Cat();
        fun(animal1);
        fun(bird);
        fun(duck);
        fun(cat);
//        fun(new Animal());
//        fun(new Bird());
//        fun(new Duck());
    }
    public static void fun(Animal animal) {
        animal.eat();
    }

    protected void eat() {
        System.out.println("Animal的eat方法");
    }
}
