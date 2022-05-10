package string_test;


import java.nio.charset.StandardCharsets;
import java.sql.SQLOutput;
import java.util.Arrays;

public class StringTest {

    public static void main(String[] args) {
//        String str ="hello world";
//        String str1 = str;
//        str1 = "Hello";
//        System.out.println(str);

        //比较字符串的相等
//        String str1 = "hello";
//        String str2 = "hello";
//        String str1 = new String("hello");
//        String str2 = new String("Hello");
//        System.out.println(str1.equalsIgnoreCase(str2));
//        System.out.println(str1==str2);

//        String userName = null;
//        System.out.println(userName.equals("张三"));
//        System.out.println("张三".equals(userName));

        //compareTo方法，按照字符串内部的每个数组进行ASCII的比较
//        String str1 = "abc";
//        String str2 = "Abc";
//        System.out.println(str1.compareTo(str2));

//        String str1 = "hello";
//        String str2 = "hello";
//        String str3 = "hello";

//        String str1 = new String("hello");
//        String str2 = new String("hello");
//        String str3 = new String("hello");
//        System.out.println(str1==str2);
//        System.out.println(str2==str3);

        //这个str1指向堆中普通的字符串对象
//        String str1 = new String("hello");
//        str1 = str1.intern();
//        String str2 = "hello";
//        System.out.println(str1 == str2);
            //intern方法手工入池
//        char[] data = new char[] {'a','b','c'};
//        String str1 = new String(data);
//        str1.intern();
//        String str2 = "abc";
//        System.out.println(str1 == str2);

        //将字符数组的部分内容转为字符串对象
//        char[] ch = new char[] {'a','b','c'};
//        String str = new String(ch);
//        String str1 = new String(ch,1,2);
//        String str1 = String.valueOf(ch);
//        System.out.println(str);
//        System.out.println(str1);
        //将字符串中的内容转为字符数组
//        String str = "hello";
//        char[] data = str.toCharArray();
//        System.out.println(data);
        //取出字符串中指定索引的字符
//        System.out.println(str.charAt(1));

//        String str = "hello";
//        char[] data = str.toCharArray();
//        System.out.println(data);
//        System.out.println(data[0]);

        //判断是否由纯数字组成
//        String str1 = "123";
//        String str2 = "123a";
//        System.out.println(isNumber(str1));
//        System.out.println(isNumber(str2));

        //字符串和字节的互相转换
//        byte[] data = new byte[] {97,98,99};
        //按照ASCII转为String
//        String str = new String(data);
//        System.out.println(str);

        //字符串转为字节
//        String str = "你好中国";
        //按照当前默认的编码 UTF-8转为字节
//        byte[] data = str.getBytes();
//        System.out.println(Arrays.toString(data));


//        String str = "hello world";
//        //判断一个子字符串是否存在
//        System.out.println(str.contains("hello"));
//        //判断是否以指定的字符串开头
//        System.out.println(str.startsWith("hello"));
//        //从指定位置开始判断
//        System.out.println(str.startsWith("hello",2));
//        //判断是否以指定字符串结尾
//        System.out.println(str.endsWith("word"));

        //字符串的替换操作
//        String str = "hello world";
        //替换指定的所有内容
//        System.out.println(str.replace("l","-"));
        //替换第一个出现的指定内容
//        System.out.println(str.replaceFirst("l","-"));
        //替换指定的所有内容
//        System.out.println(str.replaceAll("l","2"));

        //字符串的拆分操作
//        String str = "hello world hello ssm";
        //将字符串按照指定的格式全部拆分
//        String[] data1 = str.split(" ");
//        System.out.println(Arrays.toString(data1));
        //将字符串按照指定的格式截取部分内容
//        String[] data2 = str.split(" ",2);
//        System.out.println(Arrays.toString(data2));

        //字符串的截取处理
//        String str = "hello world";
        //从指定索引截取到结尾
//        System.out.println(str.substring(3));
        //截取部分内容
//        System.out.println(str.substring(3,7));

        //以上这些方法都是产生了一个新的字符串
        //字符串的不可变的

        }
      //传入一个string对象，判断是否由纯数字组成
//    public static boolean isNumber(String str) {
//        //转为字符数组
//        char[] data = str.toCharArray();
//        //循环遍历data中的每个字符，判断这个字符是否是数字字符
//        for (char c : data) {
////            if (c < '0' || c > '9') {
////                return false;
////            }
//            if (!Character.isDigit(c)) {
//                return false;
//            }
//        }
//        return true;
//    }

}
