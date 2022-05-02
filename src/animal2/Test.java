package animal2;

public class Test {
    public static void main(String[] args) {
        IRun run = new Rabbit();
        IRun run1 = new Dog();
        ISwim swim = new Dog();
        IFly fly = new Duck();
        run.run();
        run1.run();
        swim.swim();
        fly.fly();
    }
}
