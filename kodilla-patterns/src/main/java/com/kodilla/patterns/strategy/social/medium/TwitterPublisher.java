package com.kodilla.patterns.strategy.social.medium;

import com.kodilla.patterns.strategy.social.SocialPublisher;

public class TwitterPublisher implements SocialPublisher {

    @Override
    public String share() {
        return "Z-Generation user shares posts on Twitter";
    }

    public String mediumName (String name) {
        return "Twitter";
    }
}
