/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airline4;

import java.util.Scanner;

/**
 *This class allows the user to book tickets for economy class
 * @author SHIVANI B
 */
class Bookticketec {
    public void book(int ticket){
        
        String name;
        String flight;
        String time;
        int price;
        
        /**
         * Asks the user desired flight details
         */
        System.out.println("Enter your name:");
        Scanner input = new Scanner(System.in);
        name = input.nextLine();
        
        System.out.println("Enter name of flight: JetAirways or Indigo");
        flight = input.nextLine();
        
        System.out.println("Enter time: 11am or 3pm");
        time = input.nextLine();
        
        TotalCost c = new TotalCost();
        price = c.costec(ticket);
        
        /**
         * Displays the boarding pass of the user
         */
        System.out.println("Your boarding pass:");
        System.out.println(" Name: " +name+ " No. of tickets: " +ticket+ " Class:Economy Flight: " +flight+ " Time: " +time+ " Total cost:" +price);
        System.out.println("Thank you. Have a safe flight!");
        
    }
    
}
