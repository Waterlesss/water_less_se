package collection.generics;

/**
 * 在类定义时不明确类型，在使用时明确类型
 * 使用 <> 操作符
 */

public class GenericsTest<T> {
    //此时x，y的类型不定，再产生这个对象时确定类型
    private T x;

    private T y;

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }

    public static void main(String[] args) {
        //产生对象时，就会将类型参数替换
        GenericsTest<String> gt = new GenericsTest<>();
        gt.setX("123");
        System.out.println(gt.getX());
        System.out.println(gt.getY());
        gt.setY("456");
        System.out.println(gt.getY());
        System.out.println(gt.getX() + gt.getY());
        /**
         * 引入泛型后可以在编译阶段检查设置的值是否是指定类型，若不一致编译报错
         * 取出值的时候无需再进行强转
         */
    }
}
