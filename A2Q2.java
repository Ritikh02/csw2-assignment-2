class Book {
    private int bookId;
    private String bookName;
    private double price;
    public Book(int bookId, String bookName, double price) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.price = price;
    }
    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public double getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return "Book ID: " + bookId + ", Book Name: " + bookName + ", Price: $" + price;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Book book = (Book) obj;
        return bookId == book.bookId &&
                Double.compare(book.price, price) == 0 &&
                bookName.equals(book.bookName);
    }
}

public class A2Q2{     //BookDriver Class
    public static void main(String[] args) {
        Book book1 = new Book(100, "Java Programming", 25.50);
        Book book2 = new Book(101, "Python Programming", 20.00);
        if (book1.getPrice() > book2.getPrice()) {
            System.out.println(book1.getBookName() + " is more expensive than " + book2.getBookName());
        } else if (book1.getPrice() < book2.getPrice()) {
            System.out.println(book2.getBookName() + " is more expensive than " + book1.getBookName());
        } else {
            System.out.println("Both books have the same price.");
        }
        System.out.println("Details of Book 1: " + book1);
        System.out.println("Details of Book 2: " + book2);
        Book book3 = new Book(101, "Java Programming", 25.50);
        System.out.println("Are book1 and book3 equal? " + book1.equals(book3));
    }
}
