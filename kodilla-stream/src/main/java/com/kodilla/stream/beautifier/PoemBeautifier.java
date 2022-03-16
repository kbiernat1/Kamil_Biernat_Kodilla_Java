package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String text, PoemDecorator poemDecorator) {
        String newText = text + poemDecorator.decorate("hell");
        String newText1 = poemDecorator.decorate(text.toUpperCase() + "hell".toUpperCase());
        String newText2 = poemDecorator.decorate(text.concat("HECK".toLowerCase()));
        String newText3 = poemDecorator.decorate(text.replaceFirst("what", "by") + "way");
        System.out.println(newText);
        System.out.println(newText1);
        System.out.println(newText2);
        System.out.println(newText3);
    }
}
