import java.util.ArrayList;
import java.util.Iterator;

class Book {
    int isbn, no_of_page;
    String title, autour;

    Book(int isbn, String title, String auther, int no_of_page) {
        this.isbn = isbn;
        this.title = title;
        this.autour = auther;
        this.no_of_page = no_of_page;
    }

    void display() {
        System.out.println(isbn + "\t" + title + "\t" + autour + "\t" + no_of_page);
    }

}

public class Arraylist_class {
    public static void main(String[] args) {
        ArrayList<Book> lstBookList = new ArrayList<Book>();
        lstBookList.add(new Book(1010, "JAVA Book", "James", 200));
        lstBookList.add(new Book(123410, "Python Book", "David", 490));
        lstBookList.add(new Book(789, "Frontend", "Smit", 100));
        lstBookList.add(new Book(110, "Programming in C", "sami", 600));
        lstBookList.add(new Book(560, "Motivational", "James", 200));

        Iterator<Book> i = lstBookList.iterator();
        while (i.hasNext()) {
            Book b = i.next();
            b.display();
        }

    }
}
