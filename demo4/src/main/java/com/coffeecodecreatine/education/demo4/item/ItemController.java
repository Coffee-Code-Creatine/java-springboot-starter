package com.coffeecodecreatine.education.demo4.item;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ItemController {

    private final ItemRepository repository;

    ItemController(ItemRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/getItems")
    List<Item> getAll() {
        return repository.findAll();
    }

    @GetMapping("/getItem/{id}")
    Item one(@PathVariable Long id) {

        return repository.findById(id)
                .orElseThrow(() -> new ItemNotFoundException(id));
    }

    @PostMapping("/addItem")
    Item addItem(@RequestBody Item item) {
        return repository.save(item);
    }

    @PutMapping("/updateItem/{id}")
    Item updateItem(@RequestBody Item item, @PathVariable Long id) {
        return repository.findById(id)
                .map(employee -> {
                    employee.setName(item.getName());
                    employee.setDetails(item.getDetails());
                    return repository.save(employee);
                })
                .orElseGet(() -> {
                    item.setId(id);
                    return repository.save(item);
                });
    }

    @DeleteMapping("/deleteItem/{id}")
    void deleteItem(@PathVariable Long id) {
        repository.deleteById(id);
    }

}
