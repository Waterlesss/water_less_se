package polymorphism;

public class Animal {

    public static void main(String[] args) {

        Animal animal = new Animal();
        Animal bird = new Bird();
        Animal duck = new Duck();
        Animal cat = new Cat();
        animal.fun(animal);
        animal.fun(bird);
        animal.fun(duck);
        animal.fun(cat);
//        fun(new Animal());
//        fun(new Bird());
//        fun(new Duck());
    }
    public  void fun(Animal animal) {
        animal.eat();
    }

    protected void eat() {
        System.out.println("Animal的eat方法");
    }
}
