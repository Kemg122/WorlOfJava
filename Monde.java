package JDR;

import java.util.Scanner;

public class Monde {

    /**
     * fonction qui permet de créer un personnage avec tous ses attributs.
     * Demande a l'utilisateur d'entrer le nom du personnage.
     * retour: une instance de la classe Personnage correctement instancié.
     **/
    public static Personnage personnageFactory(){

        // Demander a l'utilisateur un nom de personnage
        String nom=Tools.inputString("Entrez le nom du personnage : ");
        //j'utilise mon outil de génération de nombre aléatoire pour générer les dégats et les points de vie
        int pdv=Tools.randomInt(100);
        int deg=Tools.randomInt(20);
        // Creer un nouveau personnage en utilisant le constructeur avec tous ses params (dont le nom qui vient d'être choisi par l'utilisateur)
        Personnage joueur=new Personnage(nom,pdv,deg);
        // Retourner l'instance du personnage
        return joueur;
    }
    /**
     * fonction qui permet de créer un monstre avec tous ses attributs.
     * Demande a l'utilisateur d'entrer le nom du monstre.
     * retour: une instance de la classe monstre correctement instancié.
     **/

    public static Monstre monstreFactory(){
        String nom=Tools.inputString("Entrez le nom de votre monstre : ");
        int pdv=Tools.randomInt(100);
        int deg=Tools.randomInt(20);
        Monstre monstre=new Monstre(nom,pdv,deg);
        return monstre;
    }

    /**
     * fonction qui permet d'afficher le personnage créé
     */
    public static void afficherInformations(){
        System.out.println(Monde.personnageFactory());
    }


}
