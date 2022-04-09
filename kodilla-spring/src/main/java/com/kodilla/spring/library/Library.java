package com.kodilla.spring.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Component
public final class Library {

    private final List<String> books = new ArrayList<>();
    private LibraryDbController libraryDbController;

    @Autowired
    //wykorzystanie settera, adnotacja Autowired powoduje, że dana metoda jest domyślna
    public void setLibraryDbController(LibraryDbController libraryDbController) {
        this.libraryDbController = libraryDbController;
    }

    //konstruktor
    //public Library(final LibraryDbController libraryDbController) {
    //    this.libraryDbController = libraryDbController;
    //}

    public void saveToDb() {
        libraryDbController.saveData();
    }

    public void loadFromDb() {
        libraryDbController.loadData();
    }


}