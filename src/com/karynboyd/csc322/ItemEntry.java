package com.karynboyd.csc322;

import java.util.ArrayList;
import java.io.FileWriter;
import java.io.PrintWriter;

public class ItemEntry {
    private Item item;
    private int quantity;

    ItemEntry() {}
    ItemEntry(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public Item getItem() { return item; }
    public void setItem(Item itemn) { this.item = item; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
}
