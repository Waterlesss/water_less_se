package exception_test;

public class ExceptionTest {

    public static void main(String[] args) {
        //使用try catch处理异常
        int[] data = {1, 2, 3};
        //空指针异常
//        data = null;
        System.out.println("before exception...");
        //明确知道try中可能产生的异常类型，catch捕获相应的类型
        //如果不明确异常产生的类型，使用所有异常的父类 Exception
        try {
            //可能会产生异常的语句
            //数组越界异常
//            System.out.println(data[10]);
            //除0异常
              System.out.println(data[1] / 0);
            //如果此时产生了异常，直接跳转到catch语句，不会执行异常下面的代码
            System.out.println("other code block");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("exist exception~~~");
        } catch (NullPointerException e) {
            System.out.println("exist exception~~~");
        } catch (Exception e) {
            System.out.println("exist exception");
        }finally {
            //无论异常是否产生，finally代码块都会执行，不要在finally代码块中写返回值
            System.out.println("after exception...");
        }
        /**
         * 异常的处理流程
         * 程序先执行try中的代码块
         * 如果try中的代码块出现异常，就会结束try中的代码，看和catch中的异常类型是否匹配
         * 如果匹配到，就会执行catch中的代码块
         * 如果没有匹配到，就会将异常向上传递到上层调用者
         * 无论是否匹配到异常，finally代码块都会执行(在刚方法结束之前执行)
         * 如果上层调用者也没有处理异常，就继续向上传递
         * 一直到main方法，如果也没有处理，就会交给JVM来处理，此时程序就会异常终止
         */
    }
}
