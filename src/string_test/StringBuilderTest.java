package string_test;

public class StringBuilderTest {
    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder();
//        sb.append("hello");
//        sb.append("world");
//        sb.append("!");
//        System.out.println(sb);
        StringBuilder sb = new StringBuilder("hello");
//        sb.append("123");
        sb.append("world");
        sb.delete(5,10);
//        sb.reverse();
        sb.insert(5,10);
        String str = sb.toString();
        System.out.println(str);
    }
}
