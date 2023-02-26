/*
 * Un peu à la manière des jeux vidéo, votre programme demande d’abord
 * à l’usager de lui fournir les coordonnées x et y d’un point, sa longueur et 
 * sa largeur, pour définir une zone rectangulaire. 

Cette zone ayant été définie, votre programme demande alors à l’usager 
* de lui fournir un autre point (une valeur de x et une valeur de y) et il doit indiquer si
le point est dans la zone définie précédemment ou non.  (on ne vous demande pas de dessiner)
 */
package exercice6;

import java.util.Scanner;

/**
 *
 * @author mgrac
 */
   import java.util.Scanner;
public class Exercice6 {

    /**
     * @param args the command line arguments
     */
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the coordinates of the rectangular area
        System.out.print("Entrez le x-coordinate d'un rectangle: ");
        double x = sc.nextDouble();
        System.out.print("Entrez le y-coordinate d'un rectangl: ");
        double y = sc.nextDouble();
        System.out.print("Entrez le longueur d'un rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Entrez le largeur d'un rectangle: ");
        double width = sc.nextDouble();

        // Get the point to test
        System.out.print("Entrez le x-coordinate de point: ");
        double pointX = sc.nextDouble();
        System.out.print("Entrez le y-coordinate de point: ");
        double pointY = sc.nextDouble();

        // Check if the point is inside the rectangular area
        if (pointX >= x && pointX <= x + length && pointY >= y && pointY <= y + width) {
            System.out.println("Les points sont à l'intèrieur du surface d'un rectangular.");
        } else {
            System.out.println("Le point ne sont pas à l'intèrieur du surface d'un rectangle.");
        }
    }
}

    
    
    

