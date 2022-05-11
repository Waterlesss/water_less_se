package book_management;

import book_management.book.BookList;
import book_management.user.AdminUser;
import book_management.user.NormalUser;
import book_management.user.User;

import java.util.NoSuchElementException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
    //1.此时图书馆只有一个书架
        BookList bookList = new BookList();
    //2.用户登录操作
        User user = login();
    //3.开始进行选择
        while(true) {
            try {
                int choice = user.menu();
                if (choice == -1) {
                    System.out.println("系统退出");
                    break;
                }
                user.doOperation(bookList,choice);
            } catch(ArrayIndexOutOfBoundsException e) {
                System.err.println("操作有误");
            }
        }
    }
    public static User login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的用户名：");
        String str = scanner.nextLine();
        System.out.println("请输入您登录的角色：0.管理员；1.普通用户");
        int choice = scanner.nextInt();
        if (choice == 1) {
            return new NormalUser(str);
        } else if (choice == 0) {
            return new AdminUser(str);
        }
        throw new NoSuchElementException("输入有误");
    }

}
