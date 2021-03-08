package org.example.generics.storage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Storage<T extends Book> {
    private T book;
    private List<T> books = new ArrayList<>();

    public T getBook() {
        return book;
    }

    public void setBook(T book) {
        book.read();
        this.book = book;
    }

    public void addAll(List<? extends T> list) {
        books.addAll(list);
    }

    public static int wildcardsTest(List<? super Integer> numbers) {
        numbers.add(10);
        return (int) numbers.get(0);
    }

    public static void main(String[] args) {
        Storage<Book> bookStorage = new Storage<>();
        List<Broshure> broshures = new ArrayList<>();
        bookStorage.addAll(broshures);
        System.out.println(wildcardsTest(new ArrayList<>()));
    }
}
