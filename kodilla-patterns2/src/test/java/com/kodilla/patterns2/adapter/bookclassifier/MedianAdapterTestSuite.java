package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {

    @Test
    void publicationYearMedianTest() {
        //g
        Set<Book> exemplarySet = new HashSet<>();
        Book book1 = new Book("Tolkien", "LOTR", 1954, "TL54");
        Book book2 = new Book("Rowling", "HP", 1999, "RH19");
        Book book3 = new Book("Sapkowski", "W", 1998, "SW98");

        exemplarySet.add(book1);
        exemplarySet.add(book2);
        exemplarySet.add(book3);
        //w
        MedianAdapter medianAdapter = new MedianAdapter();
        int median = medianAdapter.publicationYearMedian(exemplarySet);
        //t
        Assertions.assertEquals(median, 1998);
    }
}
