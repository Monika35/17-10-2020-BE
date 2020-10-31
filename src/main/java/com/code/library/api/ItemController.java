package com.code.library.api;

import com.code.library.domain.Item;
import com.code.library.dto.ItemRequest;
import com.code.library.service.ItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/items")
@CrossOrigin
public class ItemController {
    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping(value="/list")
    public List<Item> getAllItems() {
        return itemService.getAll();
    }

    @RequestMapping(method = RequestMethod.POST, value="/add")
    public Item addItem(@RequestBody ItemRequest itemRequest) {
        return itemService.addItem(itemRequest);
    }

}
