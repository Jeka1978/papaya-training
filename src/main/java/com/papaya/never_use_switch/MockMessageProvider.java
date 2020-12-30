package com.papaya.never_use_switch;

import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

/**
 * @author Evgeny Borisov
 */
@Service
public class MockMessageProvider {

    @Autowired
    private DistributionService distributionService;

    @Autowired
    private Faker faker;


    private List<String> msgTypes = List.of("SMS", "WHATSAPP","TELEGRAM","VIBER");


    @Scheduled(fixedDelay = 1000)
    public void sendMessagesForever() {
        Random random = new Random();
        random.nextInt();
        int i = random.nextInt(msgTypes.size());
        String fact = faker.chuckNorris().fact();
        Message message = Message.builder().distributionType(msgTypes.get(i)).text(fact).build();
        distributionService.deliver(message);
    }
}






