/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergedtwodimensionarray;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mgrac
 */
public class MergedTwoDimensionArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int[][] arrInt1 = new int[3][4];
        int[][] arrInt2 = new int[3][4];
       
        System.out.println("Array 1");
        displayTwoDArray(arrInt1);

        System.out.println("Array 2");
        displayTwoDArray(arrInt2);

        System.out.println("\nMerged Array");
        mergeTwoDArray(arrInt1, arrInt2);
         
        
    }

    public static void displayTwoDArray(int[][] arrTab) {
        Random rand = new Random();
        for (int i = 0; i < arrTab.length; i++) {
            for (int j = 0; j < arrTab[i].length; j++) {
                arrTab[i][j] = rand.nextInt(25) + 1;
                System.out.printf("%4s", arrTab[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
    }

  
    public static void mergeTwoDArray(int[][] arrInt1, int[][] arrInt2){
       
        int[][] mergedArray = new int[arrInt1.length + arrInt2.length][arrInt1[0].length];
        for (int i = 0; i < arrInt1.length; i++) {
            for (int j = 0; j < arrInt1[i].length; j++) {
                mergedArray[i][j] = arrInt1[i][j];
                System.out.printf("%6s", mergedArray[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < arrInt2.length; i++) {
            for (int j = 0; j < arrInt2[i].length; j++) {
                mergedArray[i][j] = arrInt2[i][j];
                System.out.printf("%6s", mergedArray[i][j]);
            }
            System.out.println();
        }
    }
}
