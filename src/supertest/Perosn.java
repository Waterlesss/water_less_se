package supertest;

public class Perosn {
    protected String name = "person";

    public Perosn() {
        System.out.println("Person的无参构造" + name);
    }

    public Perosn(String name) {
//          this();
//        super(name);
//        super();
//        this.name = name;
        System.out.println("person的有参构造" + name);
    }

    // public Perosn() {
    //     super();
    //    System.out.println("Person的无参构造");
    // }
//    private  String name = "preson";

    public void fun() {
        System.out.println("person的fun方法");
//        System.out.println(super.name);
    }

//    public static void main(String[] args) {
//        Perosn perosn = new Perosn("喵喵");
//    }

}

