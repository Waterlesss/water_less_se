package book_management.user;

import book_management.book.BookList;
import book_management.operation.IOperation;

public abstract class User {
    //用户名
    protected String name;
    //对于书籍的操作权限
    //此时不确定用户类型，是个空数组，由子类确定到底具备哪些权限
    protected IOperation[] operations;

    public User(String userName) {
        this.name = userName;
    }

    //不同用户的菜单是不同的，根据菜单的返回值取得用户的操作
    public abstract int menu();

    //根据用户输入的指令，来执行不同的操作
    public void doOperation(BookList bookList,int choice) {
        operations[choice - 1].work(bookList);
    }
}
