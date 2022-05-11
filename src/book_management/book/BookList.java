package book_management.book;

import java.util.ArrayList;
import java.util.List;

public class BookList {
    //书架就是保存书籍的，书本的个数不确定，要么用动态数组，要么用链表
    private List<Book> books = new ArrayList<>();
    //保存当前书架上所有书籍的名称，以后的操作就是根据这个书籍的名称来查找具体的Book对象
    // 一一对应的映射关系
    private List<String> booksName = new ArrayList<>();

    public BookList() {
        books.add(new Book("三国演义","罗贯中",43.5,"军事历史"));
        books.add(new Book("水浒传","施耐庵",28.5,"农民起义"));
        books.add(new Book("西游记","吴承恩",30.5,"神话传奇"));
        books.add(new Book("红楼梦","曹雪芹&未知",23.5,"世情小说"));
        //将当前四本书的书名添加到booksName列表中
        booksName.add("三国演义");
        booksName.add("水浒传");
        booksName.add("西游记");
        booksName.add("红楼梦");
    }

    public void listBooks() {
        for(Book book : books) {
            System.out.println(book);
        }
    }

    public boolean contains(String booksName) {
        //遍历booksName即可
        for (String str : this.booksName) {
            if (str.equals(booksName)) {
                return true;
            }
        }
        return false;
    }

    public void addNewBook(String booksName, String author, Double price,String type) {
        Book book = new Book(booksName,author,price,type);
        this.books.add(book);
        this.booksName.add(booksName);
    }

    public void bookBorrowed(String booksName) {

       for (Book book : this.books) {
           if (book.getName().equals(booksName)) {
                book.setBorrowed(true);
           }
       }
    }

    public void removeBook(String name) {
        for (Book book : this.books) {
            if (book.getName().equals(name)) {
                this.books.remove(book);
                return;
//                return true;
            }
        }
        System.out.println("下架成功");
//        return false;
    }

    public void updataBook(String name,String type,Double price) {
        for (Book book : this.books) {
            if (book.getName().equals(name)) {
                book.setType(type);
                book.setPrice(price);
                return;
            }
        }
    }

    public void returnBook(String name) {
        for (Book book : this.books) {
            if (book.getName().equals(name)) {
                book.setBorrowed(false);
            }
        }
    }
}
