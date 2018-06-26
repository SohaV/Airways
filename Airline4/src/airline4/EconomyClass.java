
package airline4;

import java.util.Scanner;

/**
 *This class allows the user to input the number of tickets for an economy class
 * @author SHIVANI B
 */
class EconomyClass {
    
    public void economyclass(){
        System.out.println("Welcome to Economy class reservation");
        
        int[] ECseats = new int[15];
        int ticket;
        int choice;
        
        
        System.out.println("How many tickets do you want to book?");
        Scanner input = new Scanner(System.in);
        ticket = input.nextInt();
        
        if(ticket<=ECseats.length)
        {
            Bookticketec ec = new Bookticketec();
            ec.book(ticket);
        }
        
        /**
         * If not enough seats, then it directs the user to check first class seats
         */
        else
        {
            System.out.println("Not enough seats. Do you want to try first class?");
            System.out.println("Enter 1 for Yes or 2 for No:");
            choice = input.nextInt();
            if(choice==1)
            {
                EconomyClass e = new EconomyClass();
                e.economyclass();
            }
            else
            {
                System.exit(0);
            }
        }
       
        
        
        
    }
    
}
