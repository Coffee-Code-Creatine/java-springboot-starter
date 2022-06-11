package com.coffeecodecreatine.education.demo4;

import com.coffeecodecreatine.education.demo4.item.ItemRepository;
import com.coffeecodecreatine.education.demo4.item.Item;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(ItemRepository repository) {

        return args -> {
            log.info("Preloading " + repository.save(new Item("Get coffee", "You are not yet awake..")));
            log.info("Preloading " + repository.save(new Item("Drink coffee", "It is hot, be careful")));
        };
    }
}
