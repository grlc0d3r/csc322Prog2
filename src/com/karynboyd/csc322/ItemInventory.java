package com.karynboyd.csc322;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ItemInventory {
    private ArrayList<ItemEntry> entries = new ArrayList<ItemEntry>();

    public ItemInventory() {}
    public ItemInventory(ArrayList<ItemEntry> entries) {
        this.entries = entries;
    }

    public ArrayList<ItemEntry> getEntries() { return entries; }
    public void setEntries(ArrayList<ItemEntry> entries) { this.entries = entries; }


    public static ItemInventory load(String file) {

    }
}
