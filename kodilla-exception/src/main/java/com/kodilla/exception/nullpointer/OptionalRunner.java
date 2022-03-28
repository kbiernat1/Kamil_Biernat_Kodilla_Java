package com.kodilla.exception.nullpointer;

import java.util.Optional;

public class OptionalRunner {
    public static void main(String[] args) {
        User user = new User("Jan"); //null;

        Optional<User> optionalUser = Optional.ofNullable(user);


        // .ifPresent - gdy optionalUser przyjmie wartość inną niż null,
        // program wywoła metodę getUsername(). Jeśli optionalUser będzie zawierał w środku null,
        // nic się nie stanie
        optionalUser.ifPresent(u -> System.out.println(u.getName()));

        // .orElse - pobiera i zwraca opakowaną zmienną, a jeżeli trafi na null, to zwraca obiekt,
        // który został przekazany jako argument metody:

        // String username = optionalUser.orElse(new User("John")).getName();
        //System.out.println(username);
    }
}
