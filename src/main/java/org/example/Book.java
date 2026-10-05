package org.example;

import java.sql.SQLOutput;

public class Book extends LibraryItem{
    protected int pageCount;
    public Book(String title, String author, int year, int trackCount){
        super(title,author,year);
        this.pageCount = trackCount;
    }
    public String toString() {
        return "Book: <" + title + "> by <" + author + "> (<" + year + ">) - <" + pageCount + "> pages";
    }
    public void readBook(){
        System.out.println("Reading <" + title + "> by <" + author + ">...\n" + "Done!");
    }
}
