package book_management.operation.impl;

import book_management.book.BookList;
import book_management.operation.IOperation;

public class AddOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("开始添加书籍：");
        System.out.println("请输入你要添加的书籍名称：");
        String booksName = scanner.nextLine();
        //假设此时书籍已经存在
        if (bookList.contains(booksName)) {
            System.err.println(booksName + "在当前书架上已经存在了，无需添加");
            return;
        }
        System.out.println("请输入你要添加的书籍作者：");
        String author = scanner.nextLine();

        System.out.println("请输入你要添加的书籍类别：");
        String type = scanner.nextLine();

        System.out.println("请输入你要添加的书籍的价格：");
        Double price = scanner.nextDouble();
        scanner.nextLine();
        //产生书籍对象，保存到书架上
        bookList.addNewBook(booksName,author,price,type);
        System.out.println("添加成功");
    }
}
