package exception_test;

public class ThrowThrowsTest {
    //throws用在方法声明上，表示该方法可能会产生的异常类型
    //但是本方法中不处理该异常。抛回给调用者
    public static void main(String[] args) {
//        try {
//            fun();
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("exist exception");
//        }
        int age = 10;
        printAge(age);
//        try {
//            printAge(age);
//        } catch (Exception e) {
//            System.out.println("捕获的异常信息为：" + e.getMessage());
//        }
    }
//    public static void fun() throws ArrayIndexOutOfBoundsException {
//        int[] data = {1, 2, 3};
//        System.out.println(data[10]);
//    }
      public static void printAge(int age) throws ArithmeticException{
//        if (age <= 0) {
//            throw new ArithmeticException("input age error");
//        } else {
//            System.out.println("此人年龄为：" + age);
//        }
          System.out.println(age);
          throw new NullPointerException("抛个异常");
      }

}
