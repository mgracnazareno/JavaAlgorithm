/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1_3;

import java.util.Scanner;

/**
 *
 * @author mgrac
 */
public class Exercise1_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1;
        int num2;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Entrez un numéro: ");
        num1 = input.nextInt();
        
        System.out.print("Entrez un autre numéro: ");
        num2 = input.nextInt();
        
        if (num1 > num2) 
            System.out.println(num1 + " est plus grande que " + num2);
        else if( num1 < num2)
             System.out.println(num2 + " est plus petit que " + num1);
        else
            System.out.println("Les deux sont egaux.");
        
       
    }
    
}
