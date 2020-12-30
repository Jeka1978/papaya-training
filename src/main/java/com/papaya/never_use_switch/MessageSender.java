package com.papaya.never_use_switch;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Evgeny Borisov
 */
public interface MessageSender {
    void send(Message message);

    String myType();

    @Autowired
    default void registerMySelf(DistributionService distributionService) {
        distributionService.register(myType(), this);
    }
}
