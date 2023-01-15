package BASICS;

class Library {
    String[] books;
    int no_of_books;

    Library() {
        this.books = new String[100];
        this.no_of_books = 0;
    }

    void addBook(String book) {
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book + " has been added");
    }

    void showavailablebooks() {
        System.out.println("available books are :- ");
        for (String book : this.books) {
            if (book == null) {
                continue;
            }
            System.out.println("* " + book);
        }
    }

    void issueBook(String book) {
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i].equals(book)) {
                System.out.println("the book " + book + " has been issued");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("this book does not exixt");
    }

    void returnbook(String book) {
        addBook(book);
    }
}

public class Exercise4_Library {
    public static void main(String[] args) {
        // you have to implement a library using java class library
        // Methods:
        // 1. addbook, issuse book, returnbook, showavailablebooks
        // properties
        // 1.array to store the available books,
        // 2. array to store the issued books

        Library cL = new Library();
        cL.addBook("Think and grow rich");
        cL.showavailablebooks();
        cL.issueBook("Think and grow rich");
        cL.showavailablebooks();
        cL.returnbook("Think and grow rich");
        cL.showavailablebooks();
    }
}