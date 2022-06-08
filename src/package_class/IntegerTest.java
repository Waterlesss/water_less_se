package package_class;

public class IntegerTest {
    public static void main(String[] args) {
//        int val = 10;
        // int->Integer
        Integer i1 = 128;
//        i1 += 10;
//        System.out.println(i1);
        Integer i2 = 128;
        //包装类比较相等时使用equals方法
        System.out.println(i1==i2);
        i1 = 120;//创建一个Integer对象保存到常量池中
        i2 = 120;//此时已经有了，直接复用
        //引用类型的比较一定使用equals方法
        System.out.println(i1.equals(i2));
    }
}
