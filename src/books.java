public class books {

    static int totalnobooks;

    String title;

    String author;

    String isbn;

    boolean isborrowed;

    static {
        totalnobooks = 0;
    }

    {
        totalnobooks++;
    }

    books(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    books(String isbn) {
        this("UNKNOWN", "UNKNOWN", isbn);
    }

    static int gettotalbook() {
        return totalnobooks;
    }

    void borrowbook() {
        if (isborrowed) {
            System.out.println("Book is already borrowed");
        } else {
            this.isborrowed = true;
            System.out.println("thanks  " + this.title);
        }
    }

    void returnbook() {
        if (isborrowed) {
            System.out.println("This book is already in the library");
        } else {
            this.isborrowed = false;
            System.out.println("hope u enjoyed it");
        }
    }

    public static void main(String[] args) {
        books b1 = new books("don","honey","3");
        books b2 = new books("2");
        System.out.println(books.gettotalbook());
        b1.borrowbook();
        b2.borrowbook();
        b1.borrowbook();
        b1.returnbook();
        b1.returnbook();

    }
}