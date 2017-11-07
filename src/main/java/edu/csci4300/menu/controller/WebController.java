package edu.csci4300.menu.controller;

import edu.csci4300.menu.dao.ItemRepository;
import edu.csci4300.menu.pojo.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class WebController {

    @Autowired
    private ItemRepository itemRepository;

    @RequestMapping("/items")
    public String items(Model model){
        List<Item> itemList = itemRepository.findAll();
        model.addAttribute("items", itemList);
        return "items";
    }

    @GetMapping("admin/items")
    public String adminItems(Model model){
        List<Item> itemList = itemRepository.findAll();
        model.addAttribute("items", itemList);
        model.addAttribute("newItem", new Item());
        return "admin/items";
    }
    @PostMapping("admin/items")
    public String adminItemUpdate(Model model, @ModelAttribute Item item, @RequestParam(required=false) String action){
        System.out.println(item.toString());
        if(action != null && action.equalsIgnoreCase("remove")){
            itemRepository.delete(item.getId());
        }else {
            itemRepository.save(item);
        }
        return adminItems(model);
    }


    @RequestMapping("/")
    public String index(Model model){
        return "index";
    }
}
