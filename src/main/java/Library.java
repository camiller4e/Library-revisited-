import java.util.ArrayList;

public class Library {

    private String name;
    private int capacity;
    private ArrayList<Book> collection;

    public Library(String name, int capacity){
        this.name = name;
        this.collection = new ArrayList<Book>();
    }

    public int bookCount(){
        return this.collection.size();
    }

    public void addBook(Book book) {
        this.collection.add(book);
    }
}
