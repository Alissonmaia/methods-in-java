/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javaatm3;

/**
 *
 * @author Alisson
 */
public class JavaATM3 {

    public static void main(String[] args) {
        int amount = 11559;
        
        int [] billvalues = {100,50,20,10,5,2,1};
        
        
        int [] numberofbills = getbilldistribution (amount, billvalues);
        
        printSaida (amount, billvalues, numberofbills);
        }
    // metodo de imprissão 
    public static void printSaida (int amount, int [] billvalues, int [] numberofbills){
        System.out.println("Divindido R$" + amount + " em notas de 100, "
        + "R$ 50, R$ 20, R$ 10, R$ 5, R$ 2 e R$ 1");
        
        
        for (int i = 0; i < numberofbills.length; i ++) { 
             System.out.println("Notas de R$" + billvalues[i] +
                     ":" + numberofbills [i]); 
          }
        
    
    
     }
    
    public static int []getbilldistribution (int amount, int [] billvalues) {
        int [] numberofbills = new int [billvalues.length];
        
        for (int i = 0; i < numberofbills.length; i++) { 
            
             numberofbills [i] = amount/billvalues [i];
             amount %= billvalues[i];
          }
             
             
        return numberofbills;     
     }

}
