package org.example.generics.wildcard.upper;

import java.util.List;

public class AppWildCardUpper {

    public static void readBooks(List<? extends Book>books){
        //books.addAll(books); так нельзя, возможна попытка присваивания родителя потомку
        books.forEach(Book::read);
    }

    public static void addBook(List<? super Book>books){
        books.add(new Book());
    }

    public static void main(String[] args) {
        List<Book>bookList=List.of(new Book());
        List<Album>albumList=List.of(new Album());
        List<Brochure>brochureList=List.of(new Brochure());
        List<String> strings=List.of("a");

        readBooks(bookList);
        readBooks(albumList);
        readBooks(brochureList);
        //readBooks(strings); так нельзя, не есть наследник класса Book
        addBook(bookList);
        //addBook(albumList);//так нельзя ниже границы ? super Book
    }
}
