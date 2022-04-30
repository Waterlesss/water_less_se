package animal;

public class Animal {

    public Animal() {

    }
public void fun() {}
    public static String test = "123";

    protected String name;

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat(String food) {
        System.out.println(this.name +"今年" + age + "岁了它正在吃"+ food);
    }
}
