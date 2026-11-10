package com.foodiehub.restaurant.controller;

import com.foodiehub.restaurant.model.Menu;
import com.foodiehub.restaurant.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/menu")
@CrossOrigin(origins = "*") 
public class MenuController {

    @Autowired
    private MenuRepository menuRepository;

    // 1. Anni items techukovali
    @GetMapping
    public List<Menu> getAllMenus() {
        return menuRepository.findAll();
    }

    @PostMapping
    public Menu addMenu(@RequestBody Menu menu) {
        return menuRepository.save(menu);
    }

    // 3. Single item by ID
    @GetMapping("/{id}")
    public Menu getMenuById(@PathVariable Long id) {
        return menuRepository.findById(id).orElse(null);
    }

    // 4. Category wise - Veg, Biryani etc
    @GetMapping("/category/{category}")
    public List<Menu> getByCategory(@PathVariable String category) {
        return menuRepository.findByCategory(category);
    }

    // 5. Delete item
    @DeleteMapping("/{id}")
    public String deleteMenu(@PathVariable Long id) {
        menuRepository.deleteById(id);
        return "Item deleted mawa!";
    }

    // 6. Update item

    @PutMapping("/{id}")
    public Menu updateMenu(@PathVariable Long id, @RequestBody Menu newMenu) {
        return menuRepository.findById(id).map(menu -> {
            menu.setName(newMenu.getName());
            menu.setDescription(newMenu.getDescription());
            menu.setPrice(newMenu.getPrice());
            menu.setCategory(newMenu.getCategory());
            menu.setImageUrl(newMenu.getImageUrl());
            menu.setIsAvailable(newMenu.getIsAvailable()); // FIXED MAWA
            menu.setNextAvailableDate(newMenu.getNextAvailableDate());
            return menuRepository.save(menu);
        }).orElse(null);
    }
 // 7. PAUSE / RESUME - Admin pause chesthe customer ki not available ani chupinchadaniki
    @PutMapping("/{id}/pause")
    public Menu pauseToggle(@PathVariable Long id, @RequestBody Menu pauseData) {
        return menuRepository.findById(id).map(menu -> {
            menu.setIsAvailable(pauseData.getIsAvailable());
            menu.setNextAvailableDate(pauseData.getNextAvailableDate());
            return menuRepository.save(menu);
        }).orElse(null);
    }
}