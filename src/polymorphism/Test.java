package polymorphism;

public class Test {
    public static void main(String[] args) {
        test();
    }
//    public static void main(String[] args) {
//
//        Animal animal1 = new Animal();
//        Animal bird = new Bird();
//        Animal duck = new Duck();
//        Animal cat = new Cat();
//        fun(animal1);
//        fun(bird);
//        fun(duck);
//        fun(cat);
////        fun(new Animal());
////        fun(new Bird());
////        fun(new Duck());
//    }
//    public static void fun(Animal animal) {
//        animal.eat();
//    }
    public static Animal test() {
        Bird bird = new Bird();
        System.out.println("返回值");
        return bird;
    }
}
