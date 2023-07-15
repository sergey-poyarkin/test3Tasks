public class Book {
public String nameOfBook;
public String author;
public int year;
public int rating;
public String textOfBook = "";

   public Book (String nameOfBook, String author, int year, int rating, String textOfBook) {
        this.nameOfBook = nameOfBook;
        this.author = author;
        this.year = year;
        this.rating = rating;
        this.textOfBook += textOfBook;

    }

    public Book (String nameOfBook, String author, int year) {
        this (nameOfBook, author, year, 3, "");

    }

    public void up () {
        if (rating < 5) {
            rating++;
        }
    }

    public void down () {
        if (rating > 0) {
                rating--;
            }
        }

    public void append(String moreText) {
       this.textOfBook += moreText;
    }

    public String toString () {
       return "[ " + rating + " ]" + " " + nameOfBook + " " + year + " " + author;
   }
}

