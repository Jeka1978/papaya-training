package com.papaya.never_use_switch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author Evgeny Borisov
 */

@Service
public class DistributionService {

    @Autowired
    private Map<String,MessageSender> map;


    public void deliver(Message message) {
        MessageSender messageSender = map.get(message.getDistributionType());
        if (messageSender == null) {
            throw new UnsupportedOperationException(message.getDistributionType());
        }

        messageSender.send(message);













    }
}
