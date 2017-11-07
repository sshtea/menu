package edu.csci4300.menu.dao;

import edu.csci4300.menu.pojo.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
