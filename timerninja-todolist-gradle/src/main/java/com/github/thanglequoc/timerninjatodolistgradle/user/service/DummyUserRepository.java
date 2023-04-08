package com.github.thanglequoc.timerninjatodolistgradle.user.service;

import io.github.thanglequoc.timerninja.TimerNinjaTracker;
import com.github.thanglequoc.timerninjatodolistgradle.user.User;

public class DummyUserRepository {

    @TimerNinjaTracker
    public User createUser(User user) {
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return user;
    }
}
