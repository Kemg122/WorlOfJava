package JDR;

import java.util.Random;
import java.util.Scanner;

/**
 * Classe qui contient des outils basiques à utiliser pour simplifier le code
 */
public class Tools {
    /**
     * fonction qui permet de demander à l'utilisateur et de renvoyer sa réponse sous forme de chaine de caractère
     * @param message : String
     * @return String
     */
    public static String inputString(String message){
        System.out.println(message);
        Scanner scanner=new Scanner(System.in);
        message=scanner.next();
        return message;
    }

    /**
     * fonction qui permet de générer un nombre aléatoire compris entre 0 et la valeur donnée
     * @param N
     * @return
     */
    public static int randomInt(int N){
        if (N<=0){
            throw new IllegalArgumentException("La limite max de votre générateur aléatoire est invalide");
        }
        Random r=new Random();
        return r.nextInt(N)+1;
    }

//    public static String randomString(int N){
//        StringBuilder s= new StringBuilder();
//
//    }
}
