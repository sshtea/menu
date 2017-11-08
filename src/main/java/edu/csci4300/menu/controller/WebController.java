package edu.csci4300.menu.controller;

import edu.csci4300.menu.Cart;
import edu.csci4300.menu.dao.ItemRepository;
import edu.csci4300.menu.pojo.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class WebController {

    @Autowired
    private ItemRepository itemRepository;

    @Autowired
    private Cart cart;

    @RequestMapping("/items")
    public String items(Model model){
        List<Item> itemList = itemRepository.findAll();
        model.addAttribute("items", itemList);
        return "items";
    }

    @PostMapping("/cart")
    public String updateCart(Model model, @ModelAttribute Item item, @RequestParam(required=false) String action){
        Item foundItem = itemRepository.findOne(item.getId());
        if(foundItem != null){
            if(action != null && action.equalsIgnoreCase("remove")){
                cart.removeItemFromList(foundItem);
            }else {
                cart.addItemToList(foundItem);
            }
        }
        return cart(model);
    }


    @GetMapping("/cart")
    public String cart(Model model){
        List<Item> itemList = cart.getItemList();
        model.addAttribute("items", itemList);
        return "cart";
    }




    @RequestMapping("/")
    public String index(Model model){
        return "index";
    }
}
