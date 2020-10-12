/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author 1styrGroupC
 */
public class App {

    ArrayList<CatalogCard> catalog = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    public String choice() {
        System.out.println("--------------------------Library Catalog System--------------------------");
        System.out.println("Choose what do you want to do \n   "
                + " 1 - Create New Card Catalog\n    2 - Edit Card Catalog\n   "
                + " 3 - Remove a Card Catalog\n    4 - View All Cards");
        System.out.print("Enter your Choice: ");
        String choice = scan.nextLine();
        return choice;
    }

    //Add new item in catalog
    public void addCard() {
        CatalogCard card = new CatalogCard();
        System.out.println("\n-----CARD CATALOG INFORMATION-----");
        System.out.print("Card ID: ");
        card.setCardId(scan.nextLine());
        System.out.print("Book Title: ");
        card.setBookTitle(scan.nextLine());
        System.out.print("Book Author: ");
        card.setBookAuthor(scan.nextLine());
        System.out.print("Year Published: ");
        card.setYearPublished(scan.nextLine());
        System.out.print("Publisher: ");
        card.setPublisher(scan.nextLine());

        catalog.add(card);

        System.out.println("\nCard Added Successfully!\n");

    }

    //edit card 
    public void editCard() {
        if (!catalog.isEmpty()) {
            System.out.print("Enter the Card ID: ");
            String id = scan.nextLine();
            catalog.forEach((card) -> {
                if (card.getCardId().equals(id)) {
                    System.out.println("\n-----UPDATE CARD CATALOG INFORMATION-----");
                    System.out.print("Update Card ID: ");
                    card.setCardId(scan.nextLine());
                    System.out.print("Update Book Title: ");
                    card.setBookTitle(scan.nextLine());
                    System.out.print("Update Book Author: ");
                    card.setBookAuthor(scan.nextLine());
                    System.out.print("Update Year Published: ");
                    card.setYearPublished(scan.nextLine());
                    System.out.print("Update Publisher: ");
                    card.setPublisher(scan.nextLine());

                    catalog.set(catalog.indexOf(card), card);

                    System.out.println("\nCard Updated Successfully!\n");
                }
            });
        } else {
            System.out.println("\nCard Catalog is Empty!\n");
        }
    }

    //remove card from list
    public void removeCard() {
        if (!catalog.isEmpty()) {
            System.out.print("Enter the Card ID: ");
            String id = scan.nextLine();
            if (catalog.removeIf(card -> card.getCardId().equals(id))) {
                catalog.removeIf(card -> card.getCardId().equals(id));
                System.out.println("\nCard Removed Successfully!\n");
            } else {
                System.out.println("\nCard Not Found!\n");
            }
        } else {
            System.out.println("\nCard Catalog is Empty!\n");
        }
    }

    //Promt display option
    public String displayOption() {
        System.out.println("\n--------Display Option--------");
        System.out.println("    1 - Search a Card Catalog\n    2 - Display All");
        System.out.print("Display choice: ");
        String choice = scan.nextLine();
        return choice;

    }

    //Display one card search by Id
    public void search() {
        if (!catalog.isEmpty()) {
            System.out.print("Enter the Card ID: ");
            String id = scan.nextLine();
            catalog.forEach((card) -> {
                if (card.getCardId().equals(id)) {
                    System.out.println("");
                    System.out.println("Card ID: " + card.getCardId());
                    System.out.println("Book Title: " + card.getBookTitle());
                    System.out.println("Book Author: " + card.getBookAuthor());
                    System.out.println("Year Published: " + card.getYearPublished());
                    System.out.println("Publisher: " + card.getPublisher());
                    System.out.println("");
                }
            });

        } else {
            System.out.println("\nCard Catalog is Empty!\n");
        }

    }

//Display all card
    public void displayAll() {
        if (!catalog.isEmpty()) {
            Collections.sort(catalog);
            catalog.forEach((card) -> {
                System.out.println("");
                System.out.println("Card ID: " + card.getCardId());
                System.out.println("Book Title: " + card.getBookTitle());
                System.out.println("Book Author: " + card.getBookAuthor());
                System.out.println("Year Published: " + card.getYearPublished());
                System.out.println("Publisher: " + card.getPublisher());
            });
        } else {
            System.out.println("\nCard Catalog is Empty!\n");
        }
    }

}
