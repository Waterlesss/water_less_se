package collection.generics;

import java.awt.print.PrinterGraphics;

/**
 * @Author: Waterless
 * @Date: 2022/05/31/9:56
 * @Description:
 */
public class MessageTest {
    public static void main(String[] args) {

//        IMessage<String> message = new Message1<>();
//        fun(message);
//        message.print("abc");
//        IMessage<Integer> message2 = new Message1<>();
//        message2.print(123);
//        //此时不能接收Integer类型
////        fun(message2);
//        IMessage<String> message3 = new Message2();
//        message3.print("ABC");
        //Message1仍然是泛型类，因此产生什么类型，就可以接受啥类型
        //Message2是一个普通类 只能接受String类
//        IMessage<Integer> message4 = new Message2();
//        message4.print(456);
//        IMessage<String>  msg1 = new Message1<>();
//        msg1.setMsg("张三");
//        IMessage<Integer> msg2 = new Message1<>();
//        msg2.setMsg(18);
//        fun(msg1);
//        fun(msg2);

//        IMessage<Integer> msg = new Message1<>();
//        IMessage<Double> msg2 = new Message1<>();
//        IMessage<String> msg3 = new Message1<>();
//        msg.setMsg(123);
//        msg2.setMsg(12.2);
//        msg3.setMsg("abc");
        //Integer和Double都是Number的子类
//        fun2(msg);
//        fun2(msg2);
        //String 不是Number的子类
//        fun2(msg3);

        IMessage<String> msg1 = new Message1<>();
//        IMessage<Integer> msg2 = new Message1<>();
        msg1.setMsg("李四");
        fun3(msg1);
//        msg2.setMsg(10);
        //不能接收msg2 ，msg2是Integer类型，不是String类的父类
//        fun3(msg2);

    }
//    public static void fun(IMessage<String> msg) {
//        //fun只能接受String类型的对象
//        msg.print("123");
//    }
    public static void fun(IMessage<?> msg) {
//        msg.setMsg("李四");
        //使用通配符 ? ，可以用在类中和方法中，表示可以接收所有类型的IMessage对象
        //不能调用set方法修改值
        System.out.println(msg.getMsg());
    }
    //这个msg仍然可以接收所有类型，但必须是Number类及其子类
    //设置泛型上限
    public static void fun2(IMessage<? extends Number> msg) {
        //只能明确父类是Number，具体传入什么子类 未知
        //父类的Number类型的值强制赋值给子类，向下转型，不一定成功
        //我们现在明确的知道的是父类是啥，设置也只能设置Number的值
        //不同的子类之间没有关系，不能设置值
//        msg.setMsg(132);
        System.out.println(msg.getMsg());
    }
    //此时fun3只能接收String及其父类的对象
    //super通配符只能用在方法内部
    public static void fun3(IMessage<? super String> msg) {
        //此时可以修改值，明确的是子类，不管是啥类型，都天然的是String类或其父类
//        msg.setMsg("张三");
        System.out.println(msg.getMsg());
    }
}
