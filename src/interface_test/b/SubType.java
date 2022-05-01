package interface_test.b;

import interface_test.a.Base;
import polymorphism.B;

public class SubType extends Base {
    public void fun() {
        System.out.println(name);
        System.out.println(super.name);
        System.out.println(this.name);
        Base base = new Base();
        //无法通过父类的引用使用，在父类的外部
//        System.out.println(base.name);
        SubType subType = new SubType();
        
    }
}
