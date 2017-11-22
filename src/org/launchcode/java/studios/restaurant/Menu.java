package org.launchcode.java.studios.restaurant;

import java.util.ArrayList;

public class Menu {

    private ArrayList<MenuItem> menuItems;
    private XDate dateUpdated;

    public Menu(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
        this.dateUpdated = XDate.xNow();
    }

    public void updateMenu() {
        for (MenuItem menuItem : menuItems) {
            menuItem.setNewness();
        }
        this.dateUpdated = XDate.xNow();
    }

    public void addMenuItem(MenuItem newMenuItem) {
        menuItems.add(newMenuItem);
        this.updateMenu();
    }

    public void removeMenuItem(MenuItem oldAndBustedMenuItem) {
        menuItems.remove(oldAndBustedMenuItem);
        this.updateMenu();
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    private void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public XDate getDateUpdated() {
        return dateUpdated;
    }

    private void setDateUpdated(XDate dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuItems=" + menuItems +
                ", dateUpdated=" + dateUpdated +
                '}';
    }
}
