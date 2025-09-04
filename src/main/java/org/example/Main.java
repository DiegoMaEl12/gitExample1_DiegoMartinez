package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Bookstore Application");
        System.out.println("------------------------");
        while (true) {
            var listBooks = new ArrayList<String>();
            System.out.println("1. Add Book");
            System.out.println("2. Edit Book");
            System.out.println("3. Delete Book");
            System.out.println("4. List Books");
            System.out.println("99. Exit");
            System.out.print("Choose an option: ");
            var sc = new Scanner(System.in);
            var choice = sc.nextInt();
            if (choice < 1 || (choice > 4 && choice != 99)) {
                System.out.println("Invalid option. Please try again.");
                continue;
            }
            else if (choice == 99) {
                System.out.println("Exiting the application. Goodbye!");
                break;
            }


            break;
        }

    }
}