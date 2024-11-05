package org.example;

public class Book {
    private String name;
    private String author;
    private String publisher;
    private String adress; //colection location
    private String status;  // Borrowing status
    private int qty;  // Copies for sales
    private double price;
    private int brwcopies; //Copy for borrowing

    public Book() {}
    public Book(String name, String author, String publisher,
                String adress, int qty, double price, int brwcopies) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.adress = adress;
        this.qty = qty;
        this.price = price;
        this.brwcopies = brwcopies;

    }
    @Override
    public String toString() {
        return "Book name :" + name +
                "Book Author :" + author +
                "Book publisher :" + publisher+
                "Book Collection Adress :" + adress +
                "Qty :" + String.valueOf(qty) +
                "Price :" + String.valueOf(price)+
                "Borrowing Copies :" + String.valueOf(brwcopies);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public String getAdress() {
        return adress;
    }
    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getQty() {
        return qty;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getBrwcopies() {
        return brwcopies;
    }
    public void setBrwcopies(int brwcopies) {
        this.brwcopies = brwcopies;
    }


}
