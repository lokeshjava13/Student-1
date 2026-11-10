package com.foodiehub.restaurant.repository;

import com.foodiehub.restaurant.model.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface MenuRepository extends JpaRepository<Menu, Long> {
    
    List<Menu> findByCategory(String category);
    
    // CORRECT - isAvailable tho match ayyela
    List<Menu> findByIsAvailableTrue();
    List<Menu> findByIsAvailable(Boolean isAvailable);
}