/*  TJ Ross
    2/25/24
    Comp 167 Section: 004
    Description: Object that is sent to bookDatabase to change the array

                
                
 */







public class Book {
    private Author author;

    private String title;

    private int year;

    private String publisher;           //Declarations that represent parts of the book

    private String genre;

    private double rating;

    private double price;






    public Book() {
        this.author = new Author();
        this.title = "";
        this.year = 0;
        this.publisher = "";                //Default constructor that initializes a book objec with default vals
        this.genre = "";
        this.rating = 0.0;
        this.price = 0.0;
    }


    public Book(Author author, String title, int year, String genre, String publisher, double rating, double price) {
        this.author = author;
        this.title = title;
        this.year = year;
        this.publisher = publisher;
        this.genre = genre;                 //Initializes book object with given values
        this.rating = rating;
        this.price = price;
    }
    public Author getAuthor() {
        return author;
    }
    
    public String getTitle() {
        return title;
    }
    public int getYear() {
        return year;
    }
    public String getPublisher() {
        return publisher;
    }
    public String getGenre() {
        return genre;
    }
    public double getRating() {
        return rating;
    }                                   //Getter and setter methods
    public double getPrice() {
        return price;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }
    public void setPrice(double price) {
        this.price = price;
    }


    public String toString() {
        return this.author.toString() + "\nTitle: " + this.title + "\nYear: " + this.year + "\nPublisher: " + this.publisher + "\nGenre: " + this.genre + "\nRating: " + this.rating + "\nPrice: "+ this.price + "\n";
    }

}           //To string method that changes object to strings
       




  