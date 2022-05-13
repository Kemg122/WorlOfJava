package JDR;

public class Monstre extends AbstractCombattant{
    /**
     * fonction qui permet de créer un monstre de même type que personnage avec un nom ,des points de vie et des dégats
     *
     *  @param nom        : int
     * @param pointDeVie : int
     * @param degat      : int
     */
    public Monstre(String nom, int pointDeVie, int degat) {
        super(nom, pointDeVie, degat);
    }
}
