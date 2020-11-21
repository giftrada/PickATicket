/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import java.util.Scanner;


/**
 *
 * @author giftradakorn
 */
public class Ticket {
    Scanner scr = new Scanner(System.in);    
    private int head;
    private int index;
    private int detect;
    private int noTicket;
    private int choice;
    private String[] seat = new String[100];
    private int[] noSeat = new int[100];
    private String nameMusical;
    
    public Ticket(String nameMusical) {
        this.nameMusical = nameMusical;
    }
    
    public void Menu(){
      System.out.println("Welcome to Pick a Ticket");
      System.out.println("---------------------------------------------");
      System.out.println("Today Musical show" + " " +nameMusical);
      System.out.println("         (1)Booking  (2)Exit       ");   
    }  
    
    public int Select(Scanner input){
        for (int i = 0; i <= 99; i++) {
            seat[i] = "[" + i + "]";
        }
        
        while (true) {
            choice = scr.nextInt();
            switch (choice) {
                case 1:
                    int index;
                    System.out.println("---------------------------------------------");
                    System.out.println("           Number Of Ticket");
                    noTicket = scr.nextInt();
                    System.out.println("---------------------------------------------");

                    layout();
                    System.out.println("\n\nSelect Your Seat");
                    for (int i = 0; i < noTicket; i++) {
                            noSeat[i] = scr.nextInt();
                             
                        while (noSeat[i]>99){
                            System.out.println("Not have Number of Seat , Please Select again. ");
                            noSeat[i] = scr.nextInt();
                        }
                            index = noSeat[i];
                    }
                        for (int i = 0; i < noTicket; i++) {    
                            Check();
                            index = noSeat[i];
                            if (detect == 0) {
                                noSeat[head++] = index;
                                System.out.println("Booking Successful");
                                Receipt();
                                break;
                            }
                        }
                    Menu();
                    break;
                      
                case 2:
                    System.out.println("Thankyou and Hope to see you again.");
                    break;
            }
        }
    }  
    public void Receipt(){
        System.out.println("---------------------------------------------");
        System.out.println("                  THEATRE                    ");
        System.out.println("              "+nameMusical+"                ");
                            
        for (int i = 0; i < noTicket; i++) {
            System.out.println("              SEAT NO.:" + noSeat[i] + "              ");
        }
        System.out.println("           TOTAL AMOUNT:" + noTicket * 500 + "           ");
        System.out.println("---------------------------------------------------------");
                              
    }
    
    public void Check() {
    
        detect = 0;
        for (int i = 0; i <= head; i++) {
            while(index == noSeat[i]){
                detect = 1;
                System.out.println("Booked");
                noSeat[i] = scr.nextInt();               
           }  index = noSeat[i];
        } Receipt();
    }
    
    public void layout(){
     for (int i = 0; i <= 99; i++) {
         if ((i == 10) || (i == 20) || (i == 30) || (i == 40) || (i == 50) || (i == 60) || (i == 70) || (i == 80) || (i == 90)) {
         System.out.println("\n");
          }
          System.out.print(seat[i]); 
          }   
    }

  
}
