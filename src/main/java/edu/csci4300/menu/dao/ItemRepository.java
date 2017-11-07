package edu.csci4300.menu.dao;

import edu.csci4300.menu.pojo.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface ItemRepository extends JpaRepository<Item, Long> {

}
