/*
Soit un tableau a une dimension contenant des entiers, la taille du tableau est définie par l’utilisateur, 
le tableau doit être remplie avec des valeurs aléatoires entières positives et négatives entre -200 et 200
Réalisez le programme en java, permettant de réaliser les tâches suivantes :
Calculer le nombre des entiers positifs (>=0)
Calculer le nombre des entiers négatifs (<0)
Calculer le nombre de nombres paires
Calculer le nombre de nombres impaires
 */

package lab5ex2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mgrac
 */
public class Lab5Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
        
        int taille;
        int positif = 0;
        int negatif = 0;
        int paire = 0;
        int impaire = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Combien de nombres voulez vous entrez: ");
        taille = sc.nextInt();
        
        int[] arr = new int[taille];
        
        // Remplir le tableau avec des valeurs aléatoires entre -200 et 200
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(401) -200;
            //arr[i]= Math.random(200) * -200;
        }
        
        //Afficher les elements
        for(int arrRand: arr){
            System.out.println(arrRand + " ");
        }
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]> 0) {
                positif++;
            }else{
                negatif++;
            }
            
            if (arr[i] % 2== 0) {
                paire++;
            }else{
                impaire++;
            }
        }
        System.out.println("Total de Positif: " + positif);
        System.out.println("Total de Negatif: " + negatif);
        System.out.println("Total de Paire: " + paire);
        System.out.println("Total d'Impaire: " + impaire);
        System.out.println("");
    }
    
}
