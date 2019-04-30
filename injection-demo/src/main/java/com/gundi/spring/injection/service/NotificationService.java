package com.gundi.spring.injection.service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    public NotificationService() {
    }

    public void send() {

    }

    public void sendAsync() {

    }

    @Override
    public String toString() {
        return "Notification Service ";
    }
}
