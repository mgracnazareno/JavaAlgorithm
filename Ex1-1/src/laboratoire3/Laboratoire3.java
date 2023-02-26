/*
Modifier l’algorithme de la calculatrice simple afin qu’elle puisse effectuer en 
plus des additions et des soustractions, des opérations de multiplications et de 
divisions. Assurez-vous que l’on ne puisse diviser par zéro

*/

package laboratoire3;

import java.util.Scanner;

/**
 * Exercise 1 - 1
 * @author mgrac
 */
public class Laboratoire3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1;
        int num2;
        int result = 0;     
  
        
        Scanner input = new Scanner(System.in);
        System.out.println("Entrez le premier numéro: ");
        num1 = input.nextInt();
        
        System.out.println("Entrez le deuxième numéro: ");
        num2 = input.nextInt();
        
       
        System.out.println("Choisiriez votre operation");
        char op = input.next().charAt(0);
 
        switch(op){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("On ne puisse pas diviser par zero, essayer a  nouveau:");
                }
                else{
                    result = num1 /num2;
                }      
            default:
                System.out.println("Error");
                break;
        }
        System.out.println("Vous avez entré " + num1 + " " +  op + " " + num2 );
        System.out.println("Le resultat est " + result);
    }
    
}
