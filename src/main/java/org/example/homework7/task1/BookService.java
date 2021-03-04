package org.example.homework7.task1;

//task Сделать чтобы метод мог копировать списки всех подтипов Book:
// List<Book> -> List<Book>, List<Album> -> List<Album>, List<Album> ->
//List<Book.>

import java.util.*;

public class BookService {
    public static void main(String[] args) {
        List<Album> albumSource = new ArrayList<>();
        Album album = new Album();
        albumSource.add(album);
        List<Album> albumDestination = new ArrayList<>();
        List<Book> booksDestination = new ArrayList<>();
        List<Book> bookSource = new ArrayList<>();
        Book book = new Book();
        bookSource.add(book);
        bookSource.add(album);
        copyToBooks(albumSource, booksDestination);
        copyToBooks(albumSource, albumDestination);
        copyToBooks(bookSource, booksDestination);
    }

    public static <Book> void copyToBooks(List<? extends Book> src, List<Book> dest) {
        for (Book book : src) {
            dest.add(book);
        }
        System.out.println(src);
    }
}
