package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final ArrayList<Book> listBooks = new ArrayList<>();
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Hello, World!");
        System.out.println("Bookstore Application");
        System.out.println("------------------------");

        boolean running = true;
        while (running) {
            displayMenu();
            var choice = sc.nextInt();
            switch (choice) {
                case 1 -> addBook();
                case 2 -> editBook();
                case 3 -> deleteBook();
                case 4 -> listTheBooks();
                case 99 -> running = false;
            }
        }
    }
    private static void displayMenu() {
        System.out.println("Menu:");
        System.out.println("1. Add book");
        System.out.println("2. Edit book");
        System.out.println("3. Delete book");
        System.out.println("4. List books");
        System.out.println("99. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void addBook(){
        sc.nextLine();
        System.out.print("Enter book name: ");
        String name = sc.nextLine();
        System.out.print("Enter author name: ");
        String author = sc.nextLine();
        System.out.print("Enter ISBN: ");
        String isbn = sc.nextLine();
        System.out.print("Enter page count: ");
        int pageCount = sc.nextInt();

        Book newBook = new Book(name, author, isbn, pageCount);
        listBooks.add(newBook);
        System.out.println("Book added successfully!");
    }

    private static void listTheBooks() {
        if (listBooks.isEmpty()) {
            System.out.println("No books in library. ");
        } else {
            for (int i=0; i < listBooks.size(); i++) {
                System.out.println( i + ". " + listBooks.get(i).toString());
            }
        }
    }

    private static void editBook() {
        listTheBooks();
        System.out.println("Enter the index of the book to edit: ");
        int index = sc.nextInt();
        sc.nextLine();
        if (index >= 0 && index < listBooks.size()) {
            Book book = listBooks.get(index);
            System.out.print("Enter new name (" + book.getName() + "): ");
            book.setName(sc.nextLine());
            System.out.println("Enter new author (" + book.getAuthor() + "): ");
            book.setAuthor(sc.nextLine());
            System.out.println("Enter new ISBN (" + book.getIsbn() + "): ");
            book.setIsbn(sc.nextLine());
            System.out.println("Enter new page count (" + book.getPageCount() + "): ");
            book.setPageCount(sc.nextInt());
            System.out.println("Book updated!");
        } else {
            System.out.println("Invalid index.");
        }
    }

    private static void deleteBook() {
        listTheBooks();
        System.out.println("Enter the index of the book to delete: ");
        int index = sc.nextInt();
        if (index >= 0 && index < listBooks.size()) {
            listBooks.remove(index);
            System.out.println("Book deleted!");
        } else {
            System.out.println("Invalid index.");
        }
        listTheBooks();
    }
}