import java.util.ArrayList;

public class Library {

    private ArrayList<Book> libraryStockList;
    private int capacity;

    public Library(int capacity){
        this.capacity = capacity;
     this.libraryStockList = new ArrayList<Book>();
    }

    public int bookCount() {
        return this.libraryStockList.size();
    }

    public void add(Book book) {
        if (this.libraryStockList.size() < this.capacity) {
            this.libraryStockList.add(book);
        }
    }

    public void lend(Book book) {
        this.libraryStockList.remove(book);
    }
}


