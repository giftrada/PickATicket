/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import Login.Login;
import java.util.Scanner;

/**
 *
 * @author giftradakorn
 */
public class Ticket {

    Scanner scr = new Scanner(System.in);
    
    private int index;
    private int noTicket;
    private int choice;
    private String[] seat = new String[100];
    private int[] noSeat = new int[100];
    private String nameMusical;
    Login name = new Login();
    
    public Ticket(String nameMusical) {
        this.nameMusical = nameMusical;
    }
    public void Login(){
        System.out.print("PLEASE LOG IN");
        System.out.print("\n>>USERNAME : ");
        String inputUser = scr.nextLine();
        
        if (inputUser.equals(name.getUser())) {
            System.out.print(">>PASSWORD : ");
        } else {
            System.out.println("\nTRY AGAIN!");
            Login();
        }
        
        String inputPassword = scr.nextLine();
        if (inputPassword.equals(name.getPassword())) {
            System.out.println("\nLOG IN COMPLETE!\n");
            Menu();
        } else {
            System.out.println("\nTRY AGAIN!");
            Login();
        }
    }

    public void Menu() {
        System.out.println("         WELCOME TO PICK A TICKET         ");
        System.out.println("---------------------------------------------");
        System.out.println("   TODAY MUSICAL SHOW " + " " + nameMusical  );
        System.out.println("           (1)BOOKING   (2)EXIT         ");
    }

    public int Select(Scanner input) {
       

        while (true) {
            choice = scr.nextInt();
            switch (choice) {
                case 1:

                    System.out.println("---------------------------------------------");
                    System.out.println("             NUMBER OF TICKET                ");
                    noTicket = scr.nextInt();
                    System.out.println("---------------------------------------------");

                    layout();
                    System.out.println("\n\nSELECT YOUR SEAT : ");
                    for (int i = 0; i < noTicket; i++) {
                        noSeat[i] = scr.nextInt();
                        index=noSeat[i];
                        while (noSeat[i] > 99) {
                            System.out.println("NOT HAVE NUMBER OF SEAT , PLEASE SELECT AGAIN ");
                            noSeat[i] = scr.nextInt();
                        }
                        index = noSeat[i];
                    }
                   
                    
                    Receipt();
                    Menu();
                    break;

                case 2:
                    System.out.println("THANK YOU! AND HOPE TO SEE YOU AGAIN <3");
                    break;
            }
        }
    }

    public void Receipt() {
        System.out.println("---------------------------------------------");
        System.out.println("                  THEATRE                    ");
        System.out.println("                 " + nameMusical + "             ");
        System.out.println("                   "+ name.toString() + "          ");
        for (int i = 0; i < noTicket; i++) {
            System.out.println("                SEAT NO.:" + noSeat[i] + "       ");
        }
        System.out.println("              TOTAL AMOUNT:" + noTicket * 500 + "       ");
        System.out.println("---------------------------------------------");

    }

   

    public void layout() {
         for (int i = 0; i <= 99; i++) {
            seat[i] = "[" + i + "]";
        }
        for (int i = 0; i <= 99; i++) {
            if ((i == 10) || (i == 20) || (i == 30) || (i == 40) || (i == 50) || (i == 60) || (i == 70) || (i == 80) || (i == 90)) {
                System.out.println("\n");
            }
            System.out.print(seat[i]);
        }
    }

}
