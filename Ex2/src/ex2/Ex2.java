/*
 * Permettre à l’utilisateur d’entrer la longueur et la largeur d’un 
 * rectangle, affichez par la suite le périmètre et la surface de ce
 * rectangle. Assurez-vous que l’utilisateur ne rentre pas des valeurs 
 * négatives. 
 */
package ex2;

import java.util.Scanner;
import java.util.Formatter;

/**
 *
 * @author mgrac
 */
public class Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double longueur;
        double largeur;
        double perimetre = 0;
        double surface = 0;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Entrez la longueur d'un rectangle: ");
        longueur = input.nextDouble();
        
        System.out.print("Entrez la largeur d'un rectangle: ");
        largeur = input.nextDouble();
        
        if((longueur <= 0)||(largeur <= 0)){
            System.out.println("Error, longueur ou largeur doivent plus que zero ");
        }
        else{
            perimetre = 2 * (longueur + largeur);
            surface= longueur * largeur;
            System.out.printf("%s%.2f\n", "Le perimetere est ", perimetre);
            System.out.printf("%s%.2f\n", "Le surface d'un rectangle est ", surface);  
        }
        
    }
            
}
 
