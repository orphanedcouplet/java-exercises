package org.launchcode.java.studios.restaurant;

import java.util.Date;

public class MenuItem {

    private String name;
    private String description;
    private String category;
    private double price;
    private final Date dateCreated;
    private boolean newness;

    public MenuItem(String name, String description, String category) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.dateCreated = new Date();
        this.newness = true;
    }

    public String getName() {
        return name;
    }

    protected void setName(String aName) {
        this.name = aName;
    }

    public String getDescription() {
        return description;
    }

    protected void setDescription(String aDescription) {
        this.description = aDescription;
    }

    public String getCategory() {
        return category;
    }

    protected void setCategory(String aCategory) {
        this.category = aCategory;
    }

    public double getPrice() {
        return price;
    }

    protected void setPrice(double aPrice) {
        this.price = aPrice;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public boolean isNewness() {
        return newness;
    }

    private void setNewness() {
        Date now = new Date();
        if (now.compareTo(this.dateCreated) >= 14) {
            newness = false;
        };
    }
}
