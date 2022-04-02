package chapter11;

import java.awt.*;

public class Book implements Product{

    private double price;
    private String name;
    private String color;
    private String author;
    private int pages;
    private String isbn;

    @Override
    public double getPrice(){
        return price;
    }

    @Override
    public void setPrice(double price){
        this.price = price;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public void setName(String name){
        this.name = name;
    }

    @Override
    public String getColor(){
        return color;
    }

    @Override
    public void setColor(Color color) {
        this.color = String.valueOf(color);
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getpages(){
        return pages;
    }

    public void setPages(int pages){
        this.pages = pages;
    }

    public String getIsbn(){
        return isbn;
    }

    public void setIsbn(String isbn){
        this.isbn = isbn;
    }

}
