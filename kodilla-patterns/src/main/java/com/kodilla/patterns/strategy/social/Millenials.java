package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.medium.SnapchatPublisher;

public class Millenials extends User {

    public Millenials(String name) {
        super(name);
        this.socialPublisher = new SnapchatPublisher();
    }
}
