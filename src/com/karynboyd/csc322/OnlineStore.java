package com.karynboyd.csc322;

public class OnlineStore {
    private ItemInventory inventory;

    public OnlineStore() {}
    public OnlineStore(ItemInventory inventory) {
        this.inventory = inventory;
    }

    public ItemInventory getInventory() { return inventory; }
    public void setInventory(ItemInventory inventory) { this.inventory = inventory; }

    public void start() {

    }
}
