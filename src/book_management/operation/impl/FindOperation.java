package book_management.operation.impl;

import book_management.book.BookList;
import book_management.operation.IOperation;

public class FindOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("请输入你要查找的书籍名称：");
        String booksName = scanner.nextLine();
        if (bookList.contains(booksName)) {
            System.out.println(booksName + "在当前书架上存在");
            return;
        }
        System.err.println("未找到名称为："+ booksName+"的书籍");

    }
}
