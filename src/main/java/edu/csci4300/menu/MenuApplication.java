package edu.csci4300.menu;

import edu.csci4300.menu.dao.ItemRepository;
import edu.csci4300.menu.pojo.Item;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class MenuApplication {
	private static final Logger log = LoggerFactory.getLogger(MenuApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(MenuApplication.class, args);
	}

//	@Bean
//    CommandLineRunner test(ItemRepository itemRepository){
//	    return (args) -> {
//            Item item = new Item();
//            item.setName("Item1").setDescription("An Item").setPrice(154);
//            itemRepository.save(item);
//            System.out.println(itemRepository.findAll());
//        };
//    }
}
