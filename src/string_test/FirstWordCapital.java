package string_test;

public class FirstWordCapital {

    public static void main(String[] args) {
        String str = "hello";
        FirstWordCapital fwc = new FirstWordCapital();
        System.out.println(fwc.firstUpper(str));
    }

    //将字符串的首字母大写
    public String firstUpper(String str) {
        //判断传入的str是否为空
        //isEmpty是成员方法，只能判断字符串长度是否为0；不能判断null
        if (str == null || str.isEmpty()) {
            return null;
        }
        //只有一个字符的情况
        if (str.length()==1) {
            return str.toUpperCase();
        }
        //此时字符串长度大于1,截取 大写 拼接
        return str.substring(0,1).toUpperCase() + str.substring(1);

    }
}
