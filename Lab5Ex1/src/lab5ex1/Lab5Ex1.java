/*
 * 
 */
package lab5ex1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mgrac
 */
public class Lab5Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int[] tab1  = new int[5];
         int[] tab2 = new int[5];
         int[] tabFusion =  new int[tab1.length + tab2.length];
         
         //Remplir les tableaux des valeurs entre 3 et 20 (inclusive)
         //creer un objet Random pour generer des valeus aleatoires
         Random rand = new Random();
         
         for (int i = 0; i < tab1.length; i++) {
            tab1[i] = rand.nextInt(18) + 3;
            tab2[i] = rand.nextInt(18) + 3;
        }
         
         System.out.println("Tableau 1: " + Arrays.toString(tab1));
         System.out.println("Tableau 2: " + Arrays.toString(tab2));
         
         
    }
    
}
