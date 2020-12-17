package com.papaya.never_use_switch;

import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
public class DistributionService {

    public void deliver(Message message) {
        if (message.getDistributionType().equalsIgnoreCase("sms")) {
            //40 lines of code which send sms
            System.out.println("sms was send with text: "+message.getText());
        } else if (message.getDistributionType().equalsIgnoreCase("whatsapp")) {
            //60 lines of code which send whatsapp
            System.out.println("whatsapp was send with text: "+message.getText());
        }

    }
}
