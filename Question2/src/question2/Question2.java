/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author mgrac
 */
public class Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int taille;
        String nom, prenom, codePermanent;

        String[] tabEtudiant;
        String reponse;
        Scanner input = new Scanner(System.in);
        System.out.println("Combien d'etudiant voulez vous entrer: ");
        taille = input.nextInt();

        tabEtudiant = new String[taille *4];
        int anneeDeNaissance;
        int k=0;
        int choix;
        do {
            do {
                System.out.println("1- Saisir l'information l'etudiant");
                System.out.println("2- Afficher l'information de l'etudiant");
                System.out.println("3- Quit");
                System.out.println("Entrez votre choix: ");
                choix = input.nextInt();
                switch (choix) {
                    case 1:
                        for (int i = 0; i < taille; i++) {
                            System.out.println("Entrez nom: ");
                            nom = input.next();
                            input.nextLine();
                            System.out.println("Entrez prenom: ");
                            prenom = input.next();
                            input.nextLine();
                        
                            int age;
                            do {
                                System.out.println("Entrez année de naissance: ");
                                anneeDeNaissance = Integer.parseInt(input.nextLine());
                                isAnneeValid(anneeDeNaissance);
                                age = LocalDate.now().getYear() - anneeDeNaissance;
                                if (age < 18 || age > 70) {
                                    System.out.println("L'âge doit être entre 18 et 70 ans.");
                                }
                            } while (age < 18 || age > 70);
                            
                            //System.out.println("Entrez code permanent: ");
                            codePermanent = nom.substring(0,3) + prenom.substring(0,2) + anneeDeNaissance;
                            //codePermanent = input.next();
                            System.out.println("Code Permanent: " + codePermanent);
                            //input.nextLine();
                            tabEtudiant[i * 4] = nom;
                            tabEtudiant[i * 4 +1] = prenom;
                            tabEtudiant[i * 4 + 2] = String.valueOf(age);
                            tabEtudiant[i *4 + 3] = genererCodePermanent(nom, prenom, anneeDeNaissance) ;
                           
                        }
                        break;
                    case 2:
                        for(String etudiant: tabEtudiant){
                            System.out.println(etudiant + " \n");
                        }
                        break;
                    case 3:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Choissisez sur l'option ci-dessus (1 ou 2)");
                }
            } while( choix != 1 || choix != 2);
          
            System.out.println("Voulez-vous ajouter un autre étudiant(e): ");
            reponse = input.next();
        } while (reponse.equals("oui"));

    }

    public static boolean isAnneeValid(int annee) {
        int currentYear = LocalDate.now().getYear();
        return annee >= 1900 && annee <= currentYear;
    }
    public static String genererCodePermanent(String nom, String prenom, int anneeDeNaissance){
        String codeP= nom.substring(0,3)+ (prenom.substring(0,2) + anneeDeNaissance);
        return codeP;
    }
}
