/*Dans le contexte des mois, permettre à l’utilisateur d’entrer 
 *le mois en lettre et le système affiche si ce mois-là est composé 
 *de 30 jours, de 31 jours ou de 28 jours dans le cas du mois de février. 

 * 
 */
package exercice5;

import java.util.Scanner;

/**
 *
 * @author mgrac
 */
public class Exercice5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String mois;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Entrez le nom du mois: ");
        mois = input.nextLine();
        
       int jours = 0;
        switch (mois.toLowerCase()) {
            case "janvier":
            case "mars":
            case "mai":
            case "juillet":
            case "août":
            case "octobre":
            case "decembre":
                jours = 31;
                break;
            case "avril":
            case "juin":
            case "septembre":
            case "novembre":
                jours = 30;
                break;
            case "fevrier":
                jours = 28;
                break;
            default:
                System.out.println("Invalide saisie.");
                System.exit(0);
        }

        System.out.println(mois + " a " + jours + " jours.");
    }
    
}
