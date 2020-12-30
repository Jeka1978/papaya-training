package com.papaya.never_use_switch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Evgeny Borisov
 */

@PapayaService
public class DistributionService {


    @Autowired
    private MessageSender viberMessageSender;

    private Map<String, MessageSender> map = new HashMap<>();


    public void register(String type, MessageSender messageSender) {
        map.put(type, messageSender);
    }


    public void deliver(Message message) {
        MessageSender messageSender = map.get(message.getDistributionType());
        if (messageSender == null) {
            throw new UnsupportedOperationException(message.getDistributionType());
        }

        messageSender.send(message);

    }
}
