package com.kodilla.patterns.strategy.social.medium;

import com.kodilla.patterns.strategy.social.SocialPublisher;

public class FacebookPublisher implements SocialPublisher {

    @Override
    public String share() {
        return "Y-Generation user shares posts on Facebook";
    }

    public String mediumName (String name) {
        return "Facebook";
    }
}
