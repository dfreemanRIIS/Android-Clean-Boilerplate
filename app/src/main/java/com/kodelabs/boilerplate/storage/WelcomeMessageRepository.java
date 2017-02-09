package com.kodelabs.boilerplate.storage;

import com.kodelabs.boilerplate.domain.repository.MessageRepository;

public class WelcomeMessageRepository implements MessageRepository {
    @Override
    public String getWelcomeMessage() {
        String msg = "Welcome, friend!";

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return msg;
    }
}