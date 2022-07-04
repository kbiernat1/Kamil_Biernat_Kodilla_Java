package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclassifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        //SOLUTION_1

        //Map<BookSignature, com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book> books = new HashMap<>();

        /*for (Book bookA : bookSet) {
            com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book bookB =
                    new com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book(bookA.getAuthor(), bookA.getTitle(), bookA.getPublicationYear());

            books.put(new BookSignature(bookA.getSignature()), bookB);
        }*/



        //SOLUTION_2

        Map<BookSignature, com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book> books = bookSet.stream()
                .collect(Collectors.toMap(bookA -> new BookSignature(bookA.getSignature()), bookA ->
                        new com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book(bookA.getAuthor(), bookA.getTitle(), bookA.getPublicationYear())));

        return medianPublicationYear(books);
    }
}
