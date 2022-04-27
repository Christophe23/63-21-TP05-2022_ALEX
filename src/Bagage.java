package src;

public class Bagage {
    private int id;
    private double poids;
    private String nomProprietaire;
    private String prenomProprietaire;

    public Bagage(int id, double poids, String nomProprietaire, String prenomProprietaire) {
        this.id = id;
        this.poids = poids;
        this.nomProprietaire = nomProprietaire;
        this.prenomProprietaire = prenomProprietaire;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public String getNomProprietaire() {
        return nomProprietaire;
    }

    public void setNomProprietaire(String nomProprietaire) {
        this.nomProprietaire = nomProprietaire;
    }

    public String getPrenomProprietaire() {
        return prenomProprietaire;
    }

    public void setPrenomProprietaire(String prenomProprietaire) {
        this.prenomProprietaire = prenomProprietaire;
    }

    @Override
    public String toString() {
        return " - ID du bagage : " + id + ", Poids : " + poids + ", Propriétaire : " + nomProprietaire + " " + prenomProprietaire;
    }
}
