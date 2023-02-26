/*
 * EXERCISE 1 - 2
 * Écrire un algorithme qui permet d’échanger le contenu de deux variables
 * 
 */
package ex1.pkg2;

import java.util.Scanner;

/**
 *
 * @author mgrac
 */
public class Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        int a;
        int b;
        //int temp;
        
        System.out.println("Entrez un numéro:");
        a = input.nextInt();
        
        System.out.println("Entrez un autre numéro: ");
        b = input.nextInt();
        
        SwapValue(a, b);
    }
    
    public static void SwapValue(int x, int y){
        int temp = x;
        x = y ;
        y= temp;
        System.out.println( x + " " + y);
    }         
}
