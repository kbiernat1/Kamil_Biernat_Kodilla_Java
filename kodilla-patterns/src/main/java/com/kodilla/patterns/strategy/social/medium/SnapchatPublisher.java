package com.kodilla.patterns.strategy.social.medium;

import com.kodilla.patterns.strategy.social.SocialPublisher;

public class SnapchatPublisher implements SocialPublisher {

    @Override
    public String share() {
        return "Millenial user shares posts on Snapchat";
    }

    public String mediumName (String name) {
        return "Snapchat";
    }
}
