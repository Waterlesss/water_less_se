package supertest;

public class China extends Perosn{

//    public China() {
//
//        //若父类中不存在无参构造，则子类构造方法的首行必须使用super(有参构造)；
//        //当父类不存在无参构造的时候，子类不能在构造方法中既调用super又调用this
////        super("呆呆");
//        System.out.println("China的无参构造");
//    }

    public China(String name) {
//        this();
        super(name);
        this.name = name;
        System.out.println("China的有参构造");
    }

    public String name = "china";

    public void fun() {
        /**
         * 当有继承时，this关键字默认先在当前类中寻找同名属性。
         * 若没找到。继续向上寻找父类中是否有同名属性。
         *直接使用name，编译器默认都是this.name
         * super修饰属性的时候表示先从直接父类中寻找，若不存在再向上寻找
         */
//        System.out.println(super.name);
        System.out.println("china的fun方法");
    }

    public void test() {
        //直接从父类寻找
        super.fun();
    }

    public static void main(String[] args) {
        /**
         * 只要存在继承关系，当你产生的是一个子类对象，向上搜索，所有父类的对象都要产生
         */
        China china = new China("呆呆");

        china.test();
//        china.fun();
    }
}
