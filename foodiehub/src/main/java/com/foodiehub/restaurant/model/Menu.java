package com.foodiehub.restaurant.model;

import jakarta.persistence.*;

@Entity
@Table(name = "menu_items") // 
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Double price;
    private String description;
    private String imageUrl;
    private String category;


    @Column(name = "is_available")
    private Boolean isAvailable = true;

    @Column(name = "next_available_date")
    private String nextAvailableDate = "";
    // ---------------------------------------------

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Double getPrice() { return price; }
    public void setPrice(Double price) { this.price = price; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getImageUrl() { return imageUrl; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public Boolean getIsAvailable() { return isAvailable; }
    public void setIsAvailable(Boolean isAvailable) { this.isAvailable = isAvailable; }

    public String getNextAvailableDate() { return nextAvailableDate; }
    public void setNextAvailableDate(String nextAvailableDate) { this.nextAvailableDate = nextAvailableDate; }
}