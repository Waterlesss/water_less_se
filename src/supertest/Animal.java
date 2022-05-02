package supertest;

public class Animal {
//      public Animal() {
//         System.out.println("1.父类Animal的无参构造");
//     }

//    protected String name = "animal";
    private int age = 0;

    protected void play() {
        System.out.println("Animal的play方法");
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal(String name) {
        System.out.println("1.Animal的有参构造" + name);
//        this.name = name;
    }

//    public static void main(String[] args) {
//        Animal animal = new Animal();
//        animal.play();
//    }

}
