package org.example.generics.storage;

public class AppStore {
    public static void main(String[] args) {
        Storage<Book> bookStorage=new Storage<>();
        bookStorage.setBook(new Book());
        bookStorage.setBook(new Broshure());

        Storage<Broshure> broshureStorage=new Storage<>();
        broshureStorage.setBook(new Broshure());
    //    broshureStorage.setBook(new Book());

//        Storage<String> stringStorage=new Storage<>();
//        stringStorage.setBook("");
    }
}
