package com.papaya.never_use_switch;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class WhatsappMessageSender implements MessageSender {
    @Override
    public void send(Message message) {
        //60 lines of code which send whatsapp
        System.out.println("whatsapp was send with text: "+message.getText());

    }

    @Override
    public String myType() {
        return "WHATSAPP";
    }
}
