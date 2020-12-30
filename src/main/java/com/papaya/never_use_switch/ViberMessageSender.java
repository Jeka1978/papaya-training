package com.papaya.never_use_switch;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Repository
@Primary
public class ViberMessageSender implements MessageSender {
    @Override
    public void send(Message message) {
        System.out.println(message.getText()+" sent by VIBER!!!!!!!!!!");
    }

    @Override
    public String myType() {
        return "VIBER";
    }
}
