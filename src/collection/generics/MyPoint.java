package collection.generics;

public class MyPoint<T,E> {
    private T x;
    //使用不同的大写字母指代不同的类型
    private E y;
    //此时产生对象时，T和E的类型可以相同 可以不同

    public T getX() {
        return x;
    }

    public E getY() {
        return y;
    }

    public void setX(T x) {
        this.x = x;
    }

    public void setY(E y) {
        this.y = y;
    }

    public static void main(String[] args) {
        MyPoint<String ,Integer> myPoint = new MyPoint<>();
        myPoint.setX("东经127.5度");
        myPoint.setY(128);
        System.out.println(myPoint.getX());
        System.out.println(myPoint.getY());
        MyPoint<Integer,Integer> myPoint1 = new MyPoint<>();
        myPoint1.setX(135);
        myPoint1.setY(15);
        System.out.println(myPoint1.getX());
        System.out.println(myPoint1.getY());
    }
}
