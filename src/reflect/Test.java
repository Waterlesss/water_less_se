package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @Author: Waterless
 * @Date: 2022/06/01/8:43
 * @Description:
 */
public class Test {
    public static void main(String[] args) throws Exception {
//        //1.获取Student类的class对象
//        Class<Student> cls1 = (Class<Student>) Class.forName("reflect.Student");
//        //2.通过类名称.class获取class对象
//        Class<Student> cls2 = Student.class;
//        //3.通过Student对象的getClass方法
//        Class<Student> cls3 = (Class<Student>) new Student().getClass();
//        System.out.println(cls1==cls2);
//        System.out.println(cls1==cls3);

        //此时编译时类型是Person 运行时类型就是Student
//        Person per = new Student();
//        System.out.println(per.getClass());

//        Class<Student> cls = Student.class;
//        //获取所有public权限的构造方法
//        Constructor[] constructors = cls.getConstructors();
//        for (Constructor constructor : constructors) {
//            System.out.println(constructor);
//        }
//        System.out.println("————————————————————————————");
//        //获取该类的所有构造方法
//        Constructor[] constructors1 = cls.getDeclaredConstructors();
//        for (Constructor constructor : constructors1) {
//            System.out.println(constructor);
//        }

//        Class<Student> cls = Student.class;
        //拿到了三个参数的有参构造
//        Constructor<Student> constructor = cls.getDeclaredConstructor(String.class,int.class,String.class);
//        Student student = constructor.newInstance("张三",18,"男");
//        System.out.println(constructor);
//        System.out.println(student);


//        Class<Student> cls = Student.class;
//        Constructor<Student> constructor = cls.getDeclaredConstructor(String.class);
//        constructor.setAccessible(true);
//        Student student = constructor.newInstance("鹏哥");
//        System.out.println(student);

        //你要用谁，就要获取哪个类型的对象
//        Class<Student> cls = Student.class;
//        Method method1 = cls.getDeclaredMethod("test");
        //test是静态方法，无需产生Student对象，没有参数就传null
//        method1.invoke(null);
        //反射调用普通方法
//        Method method2 = cls.getDeclaredMethod("fun",String.class);
//        method2.invoke(new Student("张三",18,"男"),"李四");

        //获取要拿到的属性field对象
        Class<Student> cls = Student.class;
        Field field = cls.getDeclaredField("country");
        System.out.println(field.get(null));
        //拿到age属性
        Field field1 = cls.getDeclaredField("age");
        Student stu = new Student("王五",18,"男");
        System.out.println(field1.get(stu));
        field1.set(stu,20);
        System.out.println(field1.get(stu));
    }
}
