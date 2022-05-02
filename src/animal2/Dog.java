package animal2;

public class Dog implements IRun,ISwim{
    @Override
    public void run() {
        System.out.println("狗子在跑~");
    }

    @Override
    public void swim() {
        System.out.println("狗子在游泳~");
    }
}
