package com.karynboyd.csc322;

import java.util.Scanner;

public class Menu {
    Scanner input = new Scanner(System.in);
    int selection;
    while (input != 5) {
        System.out.println("Welcome to eMart");
        System.out.println("Make a selection from the menu below.");
        System.out.println("1) Show all items");
        System.out.println("2) Show only music CDs");
        System.out.println("3) Show only books");
        System.out.println("4) Show only software");
        System.out.println("5) Exit program");
        selection = input.nextInt();

        switch (selection) {
            case 1:
                System.out.println("You have selected 1");
                break;
            case 2:
                System.out.println("You have selected 2");
                break;
            case 3:
                System.out.println("You have selected 3");
                break;
            case 4:
                System.out.println("You have selected 4");
                break;
            case 5:
                System.out.println("Thank you for visiting eMart!");
                System.exit(0);
            default:
                System.out.println("Please make a valid selection.");
                break;
        }

    }
}
