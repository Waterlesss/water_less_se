package collection.generics;

/**
 * @Author: Waterless
 * @Date: 2022/05/31/8:58
 * @Description:
 */
//T必须是Number或者其子类
public class TestMethod<T extends Number> {
    //只是一个使用了类型参数的普通方法
    public void testMethod1(T t) {
        System.out.println(t);
    }
    //使用泛型定义的泛型方法
//    public <T> T funMethod(T t) {
    //泛型方法里的T和类中的T是两码事
//        return t;
//    }
    //明确类的类型为String
//    TestMethod<String> cls = new TestMethod<>();
//    //此时这个泛型方法就只能为String
//        cls.funMethod("123a");
//    //当产生一个Integer类型的时候，这个String就被替换为Integer
//    Integer i1 = cls.funMethod(123);
//        System.out.println(cls.funMethod("123a"));
//        System.out.println(i1);

    //使用不同的参数类型，不造成异议
    public <E> E funMethod(E t) {
        return t;
    }

    public static void main(String[] args) {
//        TestMethod<String> cls = new TestMethod<>();
        //泛型方法始终以自己的类型为准
//        cls.funMethod("123a");
//        cls.funMethod(132);
//        cls.funMethod(132.2);
    }
}
