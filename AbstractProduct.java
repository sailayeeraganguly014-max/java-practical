import java.util.Scanner;

abstract class AbstractProduct {
    int product_id;
    String name, description;

    AbstractProduct(int id, String name, String desc) {
        this.product_id = id;
        this.name = name;
        this.description = desc;
    }
}

class Product extends AbstractProduct {
    double price;

    Product(int id, String name, String desc, double price) {
        super(id, name, desc);
        this.price = price;
    }
}

class Book extends Product {
    String isbn, author, title;

    Book(int id, String name, String desc, double price,
        String isbn, String author, String title) {
        super(id, name, desc, price);
        this.isbn = isbn;
        this.author = author;
        this.title = title;
    }
}

class TravelGuide extends Book {
    String country;

    TravelGuide(int id, String name, String desc, double price,
                String isbn, String author, String title, String country) {
        super(id, name, desc, price, isbn, author, title);
        this.country = country;
    }

    void display() {
        System.out.println("TG " + product_id + " " + country);
    }
}

class CompactDisc extends Product {
    String artist, title;

    CompactDisc(int id, String name, String desc, double price,
                String artist, String title) {
        super(id, name, desc, price);
        this.artist = artist;
        this.title = title;
    }

    void display() {
        System.out.println("CD " + product_id + " " + artist);
    }



    public static void main(String[] args) {
        TravelGuide tg = new TravelGuide(101, "Book", "Guide", 500,
                "ISBN", "Auth", "Title", "India");

        CompactDisc cd = new CompactDisc(102, "CD", "Music", 300,
                "Artist", "Album");

        tg.display();
        cd.display();
    }
}
