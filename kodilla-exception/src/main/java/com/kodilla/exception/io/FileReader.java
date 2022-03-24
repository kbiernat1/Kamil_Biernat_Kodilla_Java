package com.kodilla.exception.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReader {

    public void readFile() {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File("C:\\Users\\Vi i Kamil\\IdeaProjects\\kodilla-course\\kodilla-exception\\out\\production\\resources\\names.txt");

        try (Stream<String> fileLines = Files.lines(Paths.get(file.getPath()))) {
            fileLines.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("błąd odczytu plików " + e);
        } finally {
            System.out.println("jak");
        }
        System.out.println(file.getPath());
    }
}