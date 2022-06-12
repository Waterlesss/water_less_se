package animal;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Waterless
 * @Date: 2022/06/12/19:12
 * @Description:
 */
public class Student {
    public static void main(String[] args) {

        Person per = new Person();
        per.age = 18;
        per.name = "张三";
        List<Person> list = new ArrayList<>();
        list.add(per);
        System.out.println(list);
        //修改per的引用 ，之前保存的也会被修改
        //因为两per指向的是同一个地址
        per.name = null;
        list.add(per);
        System.out.println(list);
    }

}
class Person {
    String name;
    Integer age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}