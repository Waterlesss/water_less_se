package book_management.user;

import book_management.operation.IOperation;
import book_management.operation.impl.BorrowOperation;
import book_management.operation.impl.FindOperation;
import book_management.operation.impl.ListAllBooksOperation;
import book_management.operation.impl.ReturnOperation;

import java.util.Scanner;

public class NormalUser extends User{

    public NormalUser(String userName) {
        super(userName);
        this.operations = new IOperation[] {
                new ListAllBooksOperation(),
                new FindOperation(),
                new BorrowOperation(),
                new ReturnOperation(),
        };
    }

    @Override
    public int menu() {
        System.out.println("=====================================");
        System.out.println("欢迎 "+ this.name +" 登录仙科带图书管理系统");
        System.out.println("1.显示当前书籍列表");
        System.out.println("2.查找书籍");
        System.out.println("3.借阅书籍");
        System.out.println("4.归还书籍");
        System.out.println("-1.退出系统");
        System.out.println("=====================================");
        System.out.println("请选择您要进行的操作");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        if (choice > operations.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return choice;
    }
}
