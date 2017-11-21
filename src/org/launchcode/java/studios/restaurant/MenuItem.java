package org.launchcode.java.studios.restaurant;

public class MenuItem {

    private String name;
    private String description;
    private String category;
    private double price;
    private final XDate dateCreated;
    private boolean newness;

    public MenuItem(String name, String description, String category) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.dateCreated = XDate.xNow();
        this.setNewness();
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

    private void setNewness() {
        XDate now = XDate.xNow();
        if (XDate.compare2XDates(this.dateCreated, now) >= 14) {
            newness = false;
        } else {
            newness = true;
        }
    }
}
