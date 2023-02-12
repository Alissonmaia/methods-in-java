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
        // Dado uma quantia de saldo 
        int amount = 559;
        // array de valores notas 100,50,20,10,5,2,1
        int [] billvalues = {100,50,20,10,5,2,1};
        
        //Chamada do método pelo array que guardar distribuição de notas 
        int [] numberofbills = getbilldistribution (amount, billvalues);
        
        //chamada do metodo de impressão saída 
        printSaida (amount, billvalues, numberofbills);
        }
    // metodo de imprissão quantia, 
    public static void printSaida (int amount, int [] billvalues, int [] numberofbills){
        
        //imprimir valores notas 100, 50, 20, 10, 5, 2, 1 
        System.out.println("Divindido R$" + amount + " em notas de 100, "
        + "R$ 50, R$ 20, R$ 10, R$ 5, R$ 2 e R$ 1");
        
        //loop do vetor que analisar tamanho do vetor e comunica com método distribuição de notas
        //enquanto o i for menor do que tamano do vetor imprimar
        for (int i = 0; i < numberofbills.length; i ++) { 
             System.out.println("Notas de R$" + billvalues[i] +
                     ":" + numberofbills [i]); 
          }
        
    
    
     }
    //método que retornar valores distribuição de notas 
    public static int []getbilldistribution (int amount, int [] billvalues) {
        
        //Array que guardar novos valores das posição de cada notas nova instância 
        int [] numberofbills = new int [billvalues.length];
        
        //loop que comparar o tamanho do vetor com i 
        for (int i = 0; i < numberofbills.length; i++) { 
            
            //Definição de array que guardar o calculo valor dado pelo indices do array de notas e atualizar valor quantia 
             
             numberofbills [i] = amount/billvalues [i];
             amount %= billvalues[i];
          }
             
        // retornar método array com novos valores de distribuição de notas
        return numberofbills;     
     }

}
