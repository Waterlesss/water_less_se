package equalsTest;

public class Student {
    private int age;
   protected String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public static void main(String[] args) {
        Student stu1 = new Student(16,"呆呆");
        Student stu2 = new Student(16,"呆呆");
        System.out.println(stu1 == stu2);
        System.out.println(stu1.equals(stu2));
    }
    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj instanceof Student) {
            Student stu = (Student) obj;
            return this.age == stu.age && this.name.equals(stu.name);
        }
        return false;
    }
}
