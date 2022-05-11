package book_management.user;

import book_management.operation.IOperation;
import book_management.operation.impl.*;

import java.util.Scanner;

public class AdminUser extends User {
    public AdminUser(String userName) {
        super(userName);
        this.operations = new IOperation[]{
                new ListAllBooksOperation(),
                new AddOperation(),
                new RemoveOperation(),
                new UpdateOperation(),
                new FindOperation(),
        };
    }

    @Override
    public int menu() {
        System.out.println("=====================================");
        System.out.println("欢迎 " + this.name + " 登录仙科带图书管理系统");
        System.out.println("1.显示当前书籍列表");
        System.out.println("2.增加书籍");
        System.out.println("3.下架书籍");
        System.out.println("4.更新书籍");
        System.out.println("5.查找书籍");
        System.out.println("-1.退出系统");
        System.out.println("=====================================");
        System.out.println("请选择您要进行的操作");
        Scanner scanner = new Scanner(System.in);
         int choice = scanner.nextInt();
         if (choice > operations.length) {
//             System.err.println();
             throw new ArrayIndexOutOfBoundsException();
         }
        return choice;
    }

}
