package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.medium.TwitterPublisher;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //given
        User john = new Millenials("John");
        User jenny = new ZGeneration("Jenny");
        User anna = new YGeneration("Anna");

        //when
        String johnUses = john.sharePost();
        System.out.println("John: " + johnUses);
        String jennyUses = jenny.sharePost();
        System.out.println("Jenny: " + jennyUses);
        String annaUses = anna.sharePost();
        System.out.println("Anna: " + annaUses);

        //then
        Assertions.assertEquals("Millenial user shares posts on Snapchat", johnUses);
        Assertions.assertEquals("Z-Generation user shares posts on Twitter", jennyUses);
        Assertions.assertEquals("Y-Generation user shares posts on Facebook", annaUses);

    }

    @Test
    void testIndividualSharingStrategy() {
        //given
        User john = new Millenials("John");

        //when
        String johnUses = john.sharePost();
        System.out.println("John: " + johnUses);
        john.setSocialPublisher(new TwitterPublisher());
        johnUses = john.sharePost();
        System.out.println("John (if were older): " + johnUses);

        //then
        Assertions.assertEquals("Z-Generation user shares posts on Twitter", johnUses);
    }
}
