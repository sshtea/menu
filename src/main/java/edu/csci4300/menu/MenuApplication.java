package edu.csci4300.menu;

import edu.csci4300.menu.dao.ItemRepository;
import edu.csci4300.menu.dao.PurchaseRepository;
import edu.csci4300.menu.pojo.Item;
import edu.csci4300.menu.pojo.Purchase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
@EnableJpaRepositories
@EnableAutoConfiguration
@ComponentScan
public class MenuApplication {
	private static final Logger log = LoggerFactory.getLogger(MenuApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(MenuApplication.class, args);
	}

	@Bean
	CommandLineRunner test(ItemRepository itemRepository, PurchaseRepository purchaseRepository){
	    return (args) -> {
            Item item = new Item();
            item.setName("Item1").setDescription("An Item").setPrice(154);
            itemRepository.save(item);

            Purchase purchase = new Purchase();
            Set<Item> items = new HashSet<>();
            items.add(item);
			purchase.setItems(items);

			purchaseRepository.save(purchase);

        };
    }
}
