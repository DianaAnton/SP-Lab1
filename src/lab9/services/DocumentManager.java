package lab9.services;
import lab9.models.*;

public class DocumentManager {
    private static DocumentManager instance;
    private Book book;

    private DocumentManager()
    {

    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Book getBook() {
        return this.book;
    }

    public static DocumentManager getInstance() {
        if (instance == null) {
            instance = new DocumentManager();
        }
        return instance;
    }
}
