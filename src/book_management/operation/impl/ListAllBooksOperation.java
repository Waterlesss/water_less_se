package book_management.operation.impl;

import book_management.book.BookList;
import book_management.operation.IOperation;

public class ListAllBooksOperation implements IOperation {


    @Override
    public void work(BookList bookList) {
        System.out.println("展示书籍列表：");
        bookList.listBooks();

    }
}
