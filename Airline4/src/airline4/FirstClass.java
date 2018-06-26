
package airline4;

import java.util.Scanner;

/**
 *This class allows the user to input the number of tickets for a first class seat
 * @author SOHA VANKUDRE
 */
class FirstClass {
    public void firstclass(){
        
        int[] FCseats = new int[5];
        int ticket;
        int choice;
        System.out.println("Welcome to first class reservation");
        
        System.out.println("How many tickets do you want to book?");
        Scanner input = new Scanner(System.in);
        ticket = input.nextInt();
        if(ticket<=FCseats.length)
        {
            Bookticketfc fc = new Bookticketfc();
            fc.book(ticket);
        }
        
        /**
         * If there are no seats available in the first class, it directs the user to check for economy seats
         */
        else
        {
            System.out.println("Not enough seats. Do you want to try economy class?");
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
    
    
    
    

