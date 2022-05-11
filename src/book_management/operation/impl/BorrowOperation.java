package book_management.operation.impl;

import book_management.book.Book;
import book_management.book.BookList;
import book_management.operation.IOperation;

public class BorrowOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("请输入你要借阅的书籍：");
        String bookName = scanner.nextLine();
        if (!bookList.contains(bookName)) {
            System.err.println(bookName + "在当前书架不存在");
            return;
        }

        bookList.bookBorrowed(bookName);
        System.out.println("借书成功");
    }
}
