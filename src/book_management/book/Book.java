package book_management.book;

public class Book {
    //类中的成员变量用包装类
    //书名
    private String name;
    //作者
    private String author;
    //价格
    private Double price;
    //类型
    private String type;
    //书籍是否被借出，默认false
    private boolean isBorrowed;

    public Book() {

    }
    public Book(String name, String author, Double price, String type) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public Double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", isBorrowed=" + isBorrowed +
                '}';
    }
}
