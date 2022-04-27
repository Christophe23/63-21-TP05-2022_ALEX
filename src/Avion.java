package src;

import java.util.ArrayList;

public class Avion {
    private int idAvion;
    private String destination;
    private String heureDecollage;
    private ArrayList<Bagage> bagages;

    public Avion(int idAvion, String destination, String heureDecollage, ArrayList<Bagage> bagages) {
        this.idAvion = idAvion;
        this.destination = destination;
        this.heureDecollage = heureDecollage;
        this.bagages = bagages;
    }

    public int getIdAvion() {
        return idAvion;
    }

    public void setIdAvion(int idAvion) {
        this.idAvion = idAvion;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getHeureDecollage() {
        return heureDecollage;
    }

    public void setHeureDecollage(String heureDecollage) {
        this.heureDecollage = heureDecollage;
    }

    public ArrayList<Bagage> getBagages() {
        return bagages;
    }

    public void setBagages(ArrayList<Bagage> bagages) {
        this.bagages = bagages;
    }

    public double calculPoids(){
        double poids = 0;
        for (Bagage b : bagages){
            poids += b.getPoids();
        }
        return poids;
    }

    @Override
    public String toString() {
        String affichageBagages = "";
        for (Bagage b: bagages) {
            affichageBagages = affichageBagages + "\n" + b;

        }
        return "Avion (" + idAvion + ") à destination de " + destination + " à " + heureDecollage + "." + affichageBagages;
    }
}
