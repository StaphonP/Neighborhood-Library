package com.pluralsight;

import java.util.Scanner;

public class Library {

    public static void main(String[] args) {

        Book[] books = new Book[20];
        books[0] = new Book(1, 14521, "Fairy Tale", false, "");
        books[1] = new Book(2, 14522, "Coding is hard", false, "");
        books[2] = new Book(3, 14523, "Coding for dummies", true, "Staphon Peterson");
        books[3] = new Book(4, 14524, "Never give up!", false, "");
        books[4] = new Book(5, 14525, "Forever Young ", false, "");
        books[5] = new Book(6, 14526, "Money makes Money", false, "");
        books[6] = new Book(7, 14527, "You are enough", false, "");
        books[7] = new Book(8, 14528, "No Pain No Gain", false, "");
        books[8] = new Book(9, 14529, "Life of Lebron James", true, "Sanii Erwin");
        books[9] = new Book(10, 145210, "Life of the Party", false, "");
        books[10] = new Book(11, 145211, "Best Cook Book", false, "");
        books[11] = new Book(12, 145212, "Final Story", false, "");
        books[12] = new Book(13, 145213, "Harry Potter V1", false, "");
        books[13] = new Book(14, 145214, "Go to mars", false, "");
        books[14] = new Book(15, 145215, "I can help you", false, "");
        books[15] = new Book(16, 145216, "What about me?", false, "");
        books[16] = new Book(17, 145217, "How to make money for dummies", false, "");
        books[17] = new Book(18, 145218, "Best music of 2000's", false, "");
        books[18] = new Book(19, 145219, "Rod Wave Documentary", false, "");
        books[19] = new Book(20, 145220, "Real is Rare", false, "");
        Scanner input = new Scanner(System.in);
        System.out.println("Show Available Books - (1)");
        System.out.println("View Checked Out Books - (2)");
        System.out.println("Exit - (3)");
        System.out.println("Enter command:\n ");
        int command = input.nextInt();
        if (command == 1) {
            System.out.println("Available Books: \n");
            for(Book book : books){
                if(!book.getIsCheckedOut()){
                    System.out.println( book.getTitle()+",  Id:"+book.getId()+",  ISBN:  "+book.getIsbn());
                }
            }
            System.out.println("Would you like to check out a book? (Y) (N) ");
            System.out.println("Enter command: \n");
            String command2 = input.next();
            if(command2 == "Y"){
                System.out.println("Enter Name: ");
                String name =input.nextLine();
                System.out.println("What Book would you like? ");
                String bookChooser = input.next();
                public void checkOut() {
                }
            }
                        

            }
        if(command == 2){
            System.out.println("Checked out Books:\n ");
            for (Book book : books){
                if(book.getIsCheckedOut()){
                    System.out.println(book.getTitle() +",  Id: "+book.getId()+" ISBN: " +book.getIsbn() +" to "+ book.getCheckedOutTo());

                }
            }
        }
        if(command ==3){
            return;
        }


        }

    }
