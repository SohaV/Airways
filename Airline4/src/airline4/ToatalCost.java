/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airline4;

/**
 *This class calculates the cost as per the class chosen
 * @author SOHA VANKUDRE
 */
class TotalCost {
    
    /**
     * 
     * Calculates cost for first class booking
     *  
     */
    public int costfc(int ticket){
        
        int totalprice=0;
        
        totalprice = ticket * 2000;
        
        return totalprice;
    }
    
    /**
     * 
     * Calculates cost for economy class booking
     * 
     */
    public int costec(int ticket)
    {
        int totalprice=0;
        
        totalprice = ticket * 4000;
        
        return totalprice;
    }
}
