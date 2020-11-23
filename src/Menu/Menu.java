/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Ticket tic = new Ticket("CINDERELLA");
        Scanner scr = new Scanner(System.in);
        tic.Login();
        tic.Menu();
        tic.Select(scr);

    }
}
