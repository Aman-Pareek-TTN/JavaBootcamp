package com.company;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {

    String openTime;
    String closeTime;
    List<String> books;
    List<String> issuedBooks;


    Library (){
        books=new ArrayList<String>();
        books.add("Shiva");
        books.add("Photograph");
        books.add("Your Name");
        books.add("City");
        issuedBooks=new ArrayList<>();
    }

    public void addBook(String bName)
    {
        books.add(bName);
        System.out.println("Book Added");
    }

    public void issueBook(String bName)
    {

        if(books.contains(bName)){
            books.remove(bName);
            issuedBooks.add(bName);
            System.out.println("Book Issued");
        }
        else
        {
            System.out.println("Book not Available");
        }
    }

    public void returnBook(String bName){

        if(issuedBooks.contains(bName))
        {
            books.add(bName);
            issuedBooks.remove(bName);
            System.out.println("Book returned");
        }
        else
        {
            System.out.println("Book already in database");
        }

    }

    public void viewAvailableBooks(){

        if(books.isEmpty())
        {
            System.out.println("Library is Empty");
            return;
        }
        System.out.println("Available Books are:");
        for(String book : books)
        {
            System.out.println(book);
        }

        System.out.println();
        System.out.println();
    }

    public void viewIssuedBooks(){

        if(issuedBooks.isEmpty())
        {
            System.out.println("No issued books");
            return;
        }

        System.out.println("Issued Books are:");
        for(String book : issuedBooks)
        {
            System.out.println(book);
        }

        System.out.println();
        System.out.println();
    }

    public static void menu(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome");
        Library l=new Library();

        while(true){
            System.out.println("To see available books, Enter value 1");
            System.out.println("To issue a book, Enter value 2");
            System.out.println("To return a book, Enter value 3");
            System.out.println("To see issued books, Enter value 4");
            System.out.println("To add a book, Enter value 5");
            System.out.println("To exit, Enter value 9");

            System.out.println("Enter your choice::");
            int choice = scan.nextInt();

            switch(choice){
                case 1: l.viewAvailableBooks();
                    break;
                case 2: l.viewAvailableBooks();
                    System.out.println("Enter book Name");
                        String bname=scan.next();
                        l.issueBook(bname);
                    break;

                case 3:
                    System.out.println("Enter book Name");
                    String bName=scan.next();
                    l.returnBook(bName);
                    break;

                case 4:
                    l.viewIssuedBooks();
                    break;


                case 5:
                    System.out.println("Enter book Name");
                    String book=scan.next();
                    l.addBook(book);
                    break;


                case 9: System.out.println("Exiting the application");
                    System.exit(0);

                default: System.out.println("Incorrect input!!! Please re-enter choice from our menu");
            }
        }

    }

    public static void main(String[] args) {

        menu();

        System.out.println("Exiting... Bye Bye");

    }
}
