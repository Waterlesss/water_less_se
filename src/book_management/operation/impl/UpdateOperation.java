package book_management.operation.impl;

import book_management.book.BookList;
import book_management.operation.IOperation;

public class UpdateOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("请输入你想更新的书籍：");
        String name = scanner.nextLine();
        if (!bookList.contains(name)) {
            System.err.println(name + "在当前书架不存在");
            return;
        }
        System.out.println("请输入你想要修改的类型：");

        String type = scanner.nextLine();

        System.out.println("请输入你想修改的价格：");

        Double price = scanner.nextDouble();
        scanner.nextLine();
        bookList.updataBook(name, type, price);

        System.out.println("更新成功");


    }
}
