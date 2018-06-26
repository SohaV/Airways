/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airline4;

import java.util.Scanner;

/**
 *This class allows the user to book a seat in the first class
 * @author SOHA VANKUDRE
 */
class Bookticketfc {
    public void book(int ticket){
        
        String name;
        String flight;
        String time;
        double price;
        
        /**
         * It asks the user the desired flight details
         */
        System.out.println("Enter your name:");
        Scanner input = new Scanner(System.in);
        name = input.nextLine();
        
        System.out.println("Enter name of flight: JetAirways or Indigo");
        flight = input.nextLine();
        
        System.out.println("Enter time: 11am or 3pm");
        time = input.nextLine();
        
        
        TotalCost c = new TotalCost();
        price = c.costfc(ticket);
        
        /**
         * Displays the boarding pass of the user
         */
        System.out.println("Your boarding pass:");
        System.out.println(" Name: " +name+ " No. of tickets: " +ticket+ " Class: First class Flight: " +flight+ " Time: " +time+ " Total cost: " +price);
        System.out.println("Thank you. Have a safe flight!");
        
    }
    
}
