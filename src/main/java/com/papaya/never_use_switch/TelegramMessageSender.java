package com.papaya.never_use_switch;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component("telegram")
public class TelegramMessageSender implements MessageSender {
    @Override
    public void send(Message message) {
        System.out.println("telegram sending : "+message.getText());
    }
}
