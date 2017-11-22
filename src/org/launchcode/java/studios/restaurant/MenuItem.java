package org.launchcode.java.studios.restaurant;

import org.launchcode.java.studios.restaurant.XDate;

public class MenuItem {

    private static int nextId = 1;
    private final int menuItemId;
    private String name;
    private String description;
    private String category;
    private double price;
    private final XDate dateCreated;
    private boolean newness;

    private MenuItem(int menuItemId, String name, String description, String category, double price, XDate dateCreated, boolean newness) {
        this.menuItemId = menuItemId;
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
        this.dateCreated = dateCreated;
        this.newness = newness;
    }

    public MenuItem(String name, String description, String category, double price) {
        this(nextId, name, description, category, price, XDate.xNow(), true);
        nextId++;
    }

    public String getName() {
        return name;
    }

    private void setName(String aName) {
        this.name = aName;
    }

    public String getDescription() {
        return description;
    }

    private void setDescription(String aDescription) {
        this.description = aDescription;
    }

    public String getCategory() {
        return category;
    }

    private void setCategory(String aCategory) {
        this.category = aCategory;
    }

    public double getPrice() {
        return price;
    }

    private void setPrice(double aPrice) {
        this.price = aPrice;
    }

    public XDate getDateCreated() {
        return dateCreated;
    }

    public boolean isNewness() {
        return newness;
    }

    public void setNewness() {
        // new for 2 weeks, then not new
        XDate now = XDate.xNow();
        if (XDate.compare2XDates(this.dateCreated, now) > 14) {
            newness = false;
        } else {
            newness = true;
        }
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", dateCreated=" + dateCreated +
                ", newness=" + newness +
                '}';
    }


}
