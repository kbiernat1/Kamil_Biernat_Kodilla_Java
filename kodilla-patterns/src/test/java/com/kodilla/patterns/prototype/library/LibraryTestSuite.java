package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTestSuite {
    @Test
    void testGetBooks() {
        //given
        Library library = new Library("Books in library");
        Book book1 = new Book("Book1", "Author1", LocalDate.of(1990,1,1));
        Book book2 = new Book("Book2", "Author2", LocalDate.of(1991,2,1));
        Book book3 = new Book("Book3", "Author3", LocalDate.of(1992,3,1));
        Book book4 = new Book("Book4", "Author4", LocalDate.of(1993,4,1));
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);
        System.out.println(library);

        //when
        Library clonedLibraryS = null;
        try {
            clonedLibraryS = library.shallowCopy();
            clonedLibraryS.setName("Shallow copy of books in library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        System.out.println(clonedLibraryS);

        //when
        Library clonedLibraryD = null;
        try {
            clonedLibraryD = library.deepCopy();
            clonedLibraryD.setName("Deep copy of books in library");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(clonedLibraryD);

        library.getBooks().remove(book1);

        //then
        assertEquals(3, library.getBooks().size());
        assertEquals(3, clonedLibraryS.getBooks().size());
        assertEquals(4, clonedLibraryD.getBooks().size());
    }
}
