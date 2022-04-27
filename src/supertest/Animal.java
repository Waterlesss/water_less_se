package supertest;

public class Animal {

//    public Animal() {
//        System.out.println("Animal的无参构造");
//    }

    public Animal() {
        System.out.println("Animal的无参构造");
    }
    public Animal(String name) {
        System.out.println("Animal的有参构造");
        this.name = name;

    }

    protected String name = "animal";
}
