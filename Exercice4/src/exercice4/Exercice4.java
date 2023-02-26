/* Permettre à l’utilisateur d’entrer son âge, si l’âge entré est >=18ans alors 
 * un message est affiché indiquant son âge ainsi que la décision s’il est majeur 
 * ou non. Faites les validations nécessaires. 
 * 
 */
package exercice4;

import java.util.Scanner;

/**
 *
 * @author mgrac
 */
public class Exercice4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int age;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Entrez votre age:  ");
        age = input.nextInt();
        
        if (age >=  18){
            System.out.println("Vous avez " + age + " ans et il indique que vous êtes majeur!");
        }
        else{
            System.out.println("Dommage, Vous n'êtes pas majeur");
        }
                
    }
    
}
