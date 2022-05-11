package book_management.operation;

import book_management.book.BookList;

import java.util.Scanner;

//操作书籍的接口
public interface IOperation {
    Scanner scanner = new Scanner(System.in);
    void work(BookList bookList);
}
