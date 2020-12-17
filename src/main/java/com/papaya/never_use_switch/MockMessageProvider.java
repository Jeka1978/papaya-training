package com.papaya.never_use_switch;

import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

/**
 * @author Evgeny Borisov
 */
@Component
public class MockMessageProvider {

    @Autowired
    private DistributionService distributionService;

    private Faker faker = new Faker();


    private List<String> msgTypes = List.of("sms", "whatsapp");


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






