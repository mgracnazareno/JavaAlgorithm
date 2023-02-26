/*
 * Permettre à l’utilisateur d’entrer le radius d’un cercle, et calculer 
 * sa surface et son périmètre, afficher le résultat dans le format de 
 * deux chiffres après la virgule. Assurez-vous que l’utilisateur ne 
 * rentre pas des valeurs négatives. 
 */
package exercice3;

import java.util.Scanner;
import java.util.Formatter;

/**
 *
 * @author mgrac
 */
public class Exercice3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double radius; 
        double surface =0;
        double perimetre = 0;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Entrez le radius d'un cercle: ");
        radius = input.nextDouble();
        
            if (radius <= 0) 
                System.out.println("Error, il ne faut pas zero"); 
            else{
                surface = calculSurfaceDeCercle(radius);
                perimetre = calculPerimetreDeCercle(radius);
                System.out.printf("%s%.2f\n", "Le surface d'un cercle est ", surface);
                System.out.printf("%s%.2f\n", "Le perimetre d'un cercle est ", perimetre);
                System.out.printf("%s%.2f%s%.2f\n", "Le perimetre est " , perimetre , ". Le surface: " , surface);
            }  
    }
    
    public static double calculSurfaceDeCercle(double r){
     double surface = r * r * Math.PI;
     return surface;
    }
    
    public static double calculPerimetreDeCercle(double r){
        return 2 * Math.PI *r;
    }
}
