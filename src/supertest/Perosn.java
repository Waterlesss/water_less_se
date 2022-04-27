package supertest;

public class Perosn extends Animal{
    protected String name = "person";

    /**
     * person默认的无参构造不再产生
     * @param name
     */
    public Perosn(String name) {
        super(name);
        this.name = name;
        System.out.println("person的有参构造");
    }

    public Perosn() {
        System.out.println("Person的无参构造");
    }
//    private  String name = "preson";

    public void fun() {
        System.out.println("person的fun方法");
//        System.out.println(super.name);
    }

}

