package com.kodilla.stream.beautifier;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain1 {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("what the ", text -> text);
    }
}
