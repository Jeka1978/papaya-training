package com.papaya.never_use_switch;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component

public class SmsMessageSender implements MessageSender {
    @Override
    public void send(Message message) {
        //40 lines of code which send sms
        System.out.println("sms was send with text: "+message.getText());
    }

    @Override
    public String myType() {
        return "SMS";
    }
}
