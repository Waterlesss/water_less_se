package string_test;

public class toUpper_toLower {
    public static void main(String[] args) {
        String str = " hello world ";
        //trim();方法，去掉字符串中的左右空格，保留中间空格。
        System.out.println(str.trim());
        //字符串转大写
        System.out.println(str.toUpperCase());
        //字符串转小写
        System.out.println(str.toLowerCase());
        //取得字符串长度
        System.out.println(str.length());
        System.out.println("hello".length());
    }
}
