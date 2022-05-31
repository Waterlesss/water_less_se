package collection.generics;

/**
 * @Author: Waterless
 * @Date: 2022/05/31/9:53
 * @Description:
 */
public interface IMessage<T> {
    void print(T t);
    T getMsg();
    void setMsg(T t);
}
