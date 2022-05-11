package book_management.operation.impl;

import book_management.book.BookList;
import book_management.operation.IOperation;
import com.sun.corba.se.impl.orbutil.ObjectStreamClassUtil_1_3;


public class RemoveOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("请输入你要下架的书籍：");
        String name = scanner.nextLine();
        if (!bookList.contains(name)) {
            System.err.println(name + "在当前书架不存在");
            return;
        }
        bookList.removeBook(name);
//        System.out.println("下架成功");
    }
}
