package animal2;

public class Duck implements IRun,ISwim,IFly{
    @Override
    public void fly() {
        System.out.println("鸭子在飞~");
    }

    @Override
    public void run() {
        System.out.println("鸭子在跑~");
    }

    @Override
    public void swim() {
        System.out.println("鸭子在游泳~");
    }
}
