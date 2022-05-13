package JDR;

public class Personnage extends AbstractCombattant {
//    private int pointDeVie;
//    private int degat;
//    private String nom;
//
//    /**
//     * fonction qui retourne la valeur de point de vie du personnage
//     * @return int
//     */
//
//    public int getPointDeVie() {
//
//        return this.pointDeVie;
//    }
//    /**
//     * fonction qui retourne la valeur des dégats du personnage
//     * @return int
//     */
//
//    public int getDegat() {
//        return this.degat;
//    }
//    /**
//     * fonction qui retourne le nom du personnage
//     * @return String
//     */
//
//    public String getNom() {
//        return this.nom;
//    }
//
//    /**
//     * Fonction qui permet de donner la valeur des points de vie du personnage
//     * @param pointDeVie : int
//     */
//
//    private void setPointDeVie(int pointDeVie) {
//        if (pointDeVie<0){
//            throw new IllegalArgumentException("Point de vie doit être positif !");
//        }
//        this.pointDeVie = pointDeVie;
//    }
//    /**
//     * Fonction qui permet de donner la valeur des degats du personnage
//     * @param degat : int
//     */
//
//    private void setDegat(int degat) {
//        this.degat = degat;
//    }
//    /**
//     * Fonction qui permet de donner la valeur des degats du personnage
//     * @param nom : String
//     */
//
//    public void setNom(String nom) {
//        this.nom = nom;
//    }

    /**
     * fonction qui permet de créer un personnage avec un nom ,des points de vie et des dégats
     * @param pointDeVie : int
     * @param degat : int
     * @param nom : int
     */
    public Personnage(String nom, int pointDeVie, int degat) {
        super(nom,pointDeVie,degat);
    }

//    @Override
//    public String toString() {
//        final StringBuilder sb = new StringBuilder("");
//        sb.append("Nom: ").append(this.nom);
//        sb.append(" PointDeVie= ").append(this.pointDeVie);
//        sb.append(" Dégats= ").append(this.degats).append("\n");
//        return sb.toString();
//    }
}
