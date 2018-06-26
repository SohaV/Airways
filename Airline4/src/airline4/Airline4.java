/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airline4;

import java.util.Scanner;
import airline4.FirstClass;
import airline4.EconomyClass;
/**
 *
 * @author SOHA VANKUDRE
 */
public class Airline4 {

    /**
     * 
     *This class allows the user to choose first class or economy class  
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Airways");
        
       
        int section;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter 1 for Firstclass and 2 for Economy: ");
        
        section = input.nextInt();
        
        if(section==1)
        {
            FirstClass f = new FirstClass();
          
             f.firstclass();
        }
        else
        {
            EconomyClass e =new EconomyClass();
            e.economyclass();
        }
        
    }
    
}
