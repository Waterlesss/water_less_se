package exception_test;

import java.util.Scanner;


public class MyExceptionTest {
    private static final String USER_NAME = "回水";
    private static final String PASSWORD = "123";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String userName = scanner.nextLine();
        if (!USER_NAME.equals(userName)) {
            //用户名错误异常
            throw new UserNameException("用户名错误");
        }
        System.out.println("请输入密码：");
        String password = scanner.nextLine();

        if (!PASSWORD.equals(password)) {
            //密码错误异常
            throw new PassWordException("密码错误");
        }
    }
}

class UserNameException extends RuntimeException {

    public UserNameException(String msg) {
        super(msg);
    }
}

class PassWordException extends RuntimeException {
    public PassWordException(String msg) {
        super(msg);
    }
}