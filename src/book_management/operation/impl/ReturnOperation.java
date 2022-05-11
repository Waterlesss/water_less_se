package book_management.operation.impl;

import book_management.book.BookList;
import book_management.operation.IOperation;

public class ReturnOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("请输入你要归还的书籍");
        String name = scanner.nextLine();
        if (!bookList.contains(name)) {
            System.err.println(name + "在当前书架不存在");
            return;
        }
        bookList.returnBook(name);
        System.out.println("还书成功");
    }
}
