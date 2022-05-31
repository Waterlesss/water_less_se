package collection.generics;

/**
 * @Author: Waterless
 * @Date: 2022/05/31/9:55
 * @Description: 子类实现接口时明确当前类型为String类型
 */
public class Message2 implements IMessage<String>{
    @Override
    public void print(String s) {
        System.out.println(s);
    }

    @Override
    public String getMsg() {
        return null;
    }

    @Override
    public void setMsg(String s) {

    }
}
