package string_test;

public class StringBuilderTest {
    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder();
//        sb.append("hello");
//        sb.append("world");
//        sb.append("!");
//        System.out.println(sb);
        /**
         * String和StringBuilder类不能直接转换
         * 转为StringBuilder：利用StringBuilder的构造方法或append方法
         * 转为String：调用String类的toString方法
         */
        StringBuilder sb = new StringBuilder("hello");
//        sb.append("123");
        sb.append("world");
        //删除指定范围的数据
        sb.delete(5,10);
        //字符串反转
//        sb.reverse();
        //插入数据
        sb.insert(5,10);
        String str = sb.toString();
        System.out.println(str);
    }
}
