/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casdetudes;

import java.util.Scanner;

/**
 *
 * @author mgrac
 */
public class CasDetudes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int choix = 0;
        int i = 0;
        String rep;
        String id, prenom, nom;
        int taille;

        Scanner input = new Scanner(System.in);
        System.out.println("Combien d'element voulez vous: ");
        while (!input.hasNextInt()) {
            System.out.println("Entrée invalide, essayez à nouveau: ");
            input.next();
        }
        taille = input.nextInt();
        String[][] tabClient = new String[taille][3];

        System.out.println("===========================================");
        System.out.println("Veuillez choisir une option de menu suivant:");

        do {
            do {
                System.out.println("1. Entrer un nouveau client dans la liste.");
                System.out.println("2. Afficher la liste complete des clients.");
                System.out.println("3. Chercher un(e) étudiant(e) par id");
                System.out.println("4. Quitter");
                System.out.print("Entrez votre choix: ");
                choix = input.nextInt();
                switch (choix) {
                    case 1:
                        for (int j = 0; j < taille; j++) {
                            System.out.println("Entrez votre id: ");
                            id = input.next();
                            System.out.println("Entrez votre prenom: ");
                            prenom = input.next();
                            input.nextLine();
                            System.out.println("Entrez votre nom: ");
                            nom = input.next();
                            input.nextLine();
                            tabClient[i][0] = id;
                            tabClient[i][1] = prenom;
                            tabClient[i][2] = nom;
                            i++;
                        }

                        break;

                    case 2:
                         System.out.printf("%-10s %-10s %-10s\n", "ID", "Nom", "Prenom");
                        for (int row = 0; row < tabClient.length; row++) {
                            for (int col = 0; col < tabClient[row].length; col++) {
                                System.out.printf("%-10s ", tabClient[row][col]);
                            }
                            System.out.println();
                        }
                        break;

                    case 3:
                        String element = "";
                        System.out.println("Entrez l'etudiant que vous cherchez: (par id)");
                        element = input.next();
                        boolean trouve = false;
                        for (int row = 0; row < tabClient.length; row++) {
                            if (tabClient[row][0].equals(element)) {
                                System.out.printf("%-10s %-10s %-10s\n", "ID", "Nom", "Prenom");
                                System.out.printf("%-10s %-10s %-10s\n", tabClient[row][0], tabClient[row][1], tabClient[row][2]);
                                trouve = true;
                                break;
                            }
                        }
                        System.out.println();
                        if (!trouve) {
                            System.out.println("Etudiant non trouve");
                        }
                        break;
                        
                    case 4:
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Error, essayez de nouveau!");
                        break;
                }
            } while (choix != 1 && choix != 2);

            //choix = input.nextInt();
            System.out.print("\033[H\033[2J");
            System.out.flush();

            System.out.println("Voulez vous faire un autre tache: (oui)");
            rep = input.next();
        } while (rep.equals("oui"));

        System.out.println("\n");
    }

}
