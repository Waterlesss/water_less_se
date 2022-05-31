package collection.generics;

/**
 * @Author: Waterless
 * @Date: 2022/05/31/9:53
 * @Description: 子类在实现接口时继续保留泛型，子类也不清楚具体类型
 */

public class Message1<T> implements IMessage<T>{
    private T msg;
    @Override
    public void print(T t) {
        System.out.println(t);
    }

    @Override
    public T getMsg() {
        return msg;
    }

    @Override
    public void setMsg(T t) {
        this.msg = t;
    }
}
