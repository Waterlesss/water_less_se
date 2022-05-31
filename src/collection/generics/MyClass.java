package collection.generics;

import java.lang.reflect.Field;

/**
 * @Author: Waterless
 * @Date: 2022/05/31/8:45
 * @Description: 在普通类中定义泛型方法 & 类型擦除
 */
public class MyClass<T,E extends Number> {
    private T msg;
    private E num;
    public <T> T test(T t) {
        System.out.println(t);
        return t;
    }

    public static void main(String[] args) {
//        MyClass<String> myClass = new MyClass<>();
//        MyClass<Integer> myClass2 = new MyClass<>();
        //进入JVM后都会被擦除为Object或者设置的泛型上限
//        System.out.println(myClass.getClass() == myClass2.getClass());
        MyClass<String,Integer> myClass = new MyClass<>();
        Class cls = myClass.getClass();
        Field[] fields = cls.getDeclaredFields();
        for (Field field : fields) {
            //T没设置泛型上限，擦除为Obje
            //E设置了泛型上限，就擦除为相应的上限类型
            System.out.println(field.getType());
        }

    }
}
