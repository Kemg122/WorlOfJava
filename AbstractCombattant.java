package JDR;

abstract class AbstractCombattant {
    public String nom;
    public int pointDeVie;
    public int degats;
    /**
     * fonction qui retourne la valeur de point de vie du personnage
     * @return int
     */

    public int getPointDeVie() {

        return this.pointDeVie;
    }
    /**
     * fonction qui retourne la valeur des dégats du personnage
     * @return int
     */

    public int getDegat() {
        return this.degats;
    }
    /**
     * fonction qui retourne le nom du personnage
     * @return String
     */

    public String getNom() {
        return this.nom;
    }

    /**
     * Fonction qui permet de donner la valeur des points de vie du personnage
     * @param pointDeVie : int
     */

    private void setPointDeVie(int pointDeVie) {
        if (pointDeVie<0){
            throw new IllegalArgumentException("Point de vie doit être positif !");
        }
        this.pointDeVie = pointDeVie;
    }
    /**
     * Fonction qui permet de donner la valeur des degats du personnage
     * @param degat : int
     */

    private void setDegat(int degat) {
        this.degats = degat;
    }
    /**
     * Fonction qui permet de donner la valeur des degats du personnage
     * @param nom : String
     */

    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * fonction qui permet de créér un combattant qui a plusieurs caractéristiques
     * @param nom : String
     * @param pointDeVie : int
     * @param degats : int
     */

    public AbstractCombattant(String nom, int pointDeVie, int degats) {
        this.setNom(nom);
        this.setPointDeVie(pointDeVie);
        this.setDegat(degats);
    }

    /**
     * fonction qui renvoie les caractéristique d'un combattant
     * @return String
     */

    public String toString(){
        return ("Nom: %s pdv: %i degats: %i"+nom+pointDeVie+degats);
    }
}
