/*
Réalisez un programme en Java qui permet de remplir un tableau d’entier de la part de l’utilisateur.
Une fois le tableau est rempli, demandez à l’utilisateur d’entrer un entier et le programme va parcourir 
le tableau afin de vérifier si ce nombre existe dans le tableau ou non.
Faites les validations de type des entrées de l’utilisateur.

 */
package lab5ex3;

import java.util.Scanner;

/**
 *
 * @author mgrac
 */
public class Lab5Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        int taille;
        do {
            System.out.print("Entrez la taille du tableau : ");
            while (!scanner.hasNextInt()) {
                System.out.print("Veuillez entrer un entier positif : ");
                scanner.next();
            }
            taille = scanner.nextInt();
        } while (taille <= 0);
        
        int[] tableau = new int[taille];
        for (int i = 0; i < taille; i++) {
            System.out.print("Entrez un entier pour la case " + i + " : ");
            while (!scanner.hasNextInt()) {
                System.out.print("Veuillez entrer un entier : ");
                scanner.next();
            }
            tableau[i] = scanner.nextInt();
        }
        
        System.out.print("Entrez un entier à rechercher dans le tableau : ");
        int recherche;
        while (!scanner.hasNextInt()) {
            System.out.print("Veuillez entrer un entier : ");
            scanner.next();
        }
        recherche = scanner.nextInt();
        
        boolean trouve = false;
        for (int i = 0; i < taille; i++) {
            if (tableau[i] == recherche) {
                trouve = true;
                break;
            }
        }
        
        if (trouve) 
            System.out.println("Le nombre " + recherche + " est présent dans le tableau.");
        else 
            System.out.println("Le nombre " + recherche + " n'est pas présent dans le tableau.");
        
        
        
        
        
        
        
        
        
        
    }
    
}
