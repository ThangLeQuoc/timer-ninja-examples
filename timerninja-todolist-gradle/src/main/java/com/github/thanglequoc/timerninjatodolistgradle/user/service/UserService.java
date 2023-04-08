package com.github.thanglequoc.timerninjatodolistgradle.user.service;

import java.time.temporal.ChronoUnit;

import com.github.thanglequoc.timerninjatodolistgradle.user.User;
import io.github.thanglequoc.timerninja.TimerNinjaTracker;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @TimerNinjaTracker
    public User getUserByName(String username) {
        if ("ninja".equals(username)) {
            User ninja = new User();
            ninja.setUsername("ninja");
            return ninja;
        }
        return null;
    }

    @TimerNinjaTracker
    public User createNewUser(User user) {
        validateUserAlreadyExist(user.getUsername());
        isValidUserName(user.getUsername());
        DummyUserRepository dummyUserRepository = new DummyUserRepository();
        dummyUserRepository.createUser(user);
        return user;
    }

    @TimerNinjaTracker(enabled = true, timeUnit = ChronoUnit.MICROS)
    private void validateUserAlreadyExist(String username) {
        try {
            Thread.sleep(500);
            if (getUserByName(username) != null) {
                throw new IllegalStateException("User already exists");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @TimerNinjaTracker
    private static boolean isValidUserName(String username) {
        return username != null && !username.isBlank();
    }
}
