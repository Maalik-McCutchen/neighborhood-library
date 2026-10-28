package com.pluralsight;

import java.util.Scanner;
public class NeighborhoodLibrary {

    public static void showAvailableBooks(Scanner myScanner){
        System.out.println("Available Books: ");

        for (int i = 0; i < books.length; i++) {

            if (!books[i].isCheckedOut()) {

                System.out.println("ID: " + books[i].getId());
                System.out.println("ISBN: " + books[i].getIsbn());
                System.out.println("Title: " + books[i].getTitle());
            }
        }

        System.out.println("Enter the book ID to check out, or 0 to go back home: ");
        int bookId = myScanner.nextInt();
        myScanner.nextLine();
        if (bookId == 0) {
            return;
        }

        for (int i = 0; i < books.length; i++) {
            if (bookId == books[i].getId()) {
                System.out.println("Enter your name: ");
                String name = myScanner.nextLine();
                books[i].checkOut(name);

            }
        }
    }

    public static void showCheckedOutBooks(){

        for (int i = 0; i < books.length; i++) {
            if (books[i].isCheckedOut()) {
                System.out.println("ID: " + books[i].getId());
                System.out.println("ISBN: " + books[i].getIsbn());
                System.out.println("Title: " + books[i].getTitle());
                System.out.println("Checked-out to: " + books[i].getCheckedOutTo());
            }

        }

    }


    private static Book[] books = new Book[20];

    public static void main(String[] args) {

        books[0] = new Book(1, "978-1-23456-789-0", "The Journey of Xmanic");
        books[1] = new Book(2, "978-1-23456-789-1", "Starlight Protocol");
        books[2] = new Book(3, "978-1-23456-789-2", "The Name of the Wind");
        books[3] = new Book(4, "978-1-23456-789-3", "The Final Empire");
        books[4] = new Book(5, "978-1-23456-789-4", "A Wizard of Earthsea");
        books[5] = new Book(6, "978-1-23456-789-5", "The Obsidian Throne");
        books[6] = new Book(7, "978-1-23456-789-6", "Whispers in the Glass Forest");
        books[7] = new Book(8, "978-1-23456-789-7", "Echoes of the Void");
        books[8] = new Book(9, "978-1-23456-789-8", "The Quantum Horizon");
        books[9] = new Book(10, "978-1-23456-789-9", "Neon Drift");
        books[10] = new Book(11, "978-1-23456-790-0", "Circuit of Stars");
        books[11] = new Book(12, "978-1-23456-790-1", "The Crimson Shadow");
        books[12] = new Book(13, "978-1-23456-790-2", "Secrets of the Sunken Pier");
        books[13] = new Book(14, "978-1-23456-790-3", "The Midnight Ledger");
        books[14] = new Book(15, "978-1-23456-790-4", "Silence Before Dawn");
        books[15] = new Book(16, "978-1-23456-790-5", "Locked Room Theory");
        books[16] = new Book(17, "978-1-23456-790-6", "Beneath the Autumn Sky");
        books[17] = new Book(18, "978-1-23456-790-7", "Letters to Verona");
        books[18] = new Book(19, "978-1-23456-790-8", "Second Chance Symphony");
        books[19] = new Book(20, "978-1-23456-790-9", "The Coffee Shop Agreement");

        Scanner myScanner = new Scanner(System.in);


        boolean done = false;
        while(!done){

            System.out.println("Welcome! enter your choice of books: ");
            System.out.println("1 - Show Available Books: ");
            System.out.println("2 - Show Checked Out Books: ");
            System.out.println("3 - Exit");


        int enterANumber = myScanner.nextInt();
        myScanner.nextLine();



        switch (enterANumber) {
            case 1:
            showAvailableBooks(myScanner);
                break;
            case 2:
                showCheckedOutBooks();
                break;
            case 3:
                System.out.println("Goodbye");
                done = true;
                break;
            default:
                System.out.println("command not found.");
        }


    }
}
}
