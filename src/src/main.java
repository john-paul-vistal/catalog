/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.util.Scanner;

/**
 *
 * @author 1styrGroupC
 */
public class main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        App app = new App();
        while (true) {
            switch (app.choice()) {
                case "1"://Add Card Catalog
                    app.addCard();
                    break;
                case "2"://Edit Card Catalog
                    app.editCard();
                    break;
                case "3"://Remove Card Catalog
                    app.removeCard();
                    break;
                case "4"://Display Card Catalog
                    switch (app.displayOption()) {
                        case "1"://Search Card Catalog by ID
                            app.search();
                            break;
                        case "2"://Display All Card Catalog
                            app.displayAll();
                            break;
                        default:
                            System.out.println("\nInvalid Input\n");
                    }
                    break;
                default:
                    System.out.println("\nNot in the choices. Try again!\n");
            }
        }
    }
}
