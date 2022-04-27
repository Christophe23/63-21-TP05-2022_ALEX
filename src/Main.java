package src;

import java.util.ArrayList;

public class Main {
    private static ArrayList<Avion> listeAvions = new ArrayList<>();
    private static int NB_AVIONS = 10;
    private static int NB_BAGAGES = 15;
    private static double poidsMaximum = 250.00;

    public static void main(String[] args) {
        chargerDonnees();
        System.out.println();
        affichageAvions();
        System.out.println();
        avionEnSurpoids();
        System.out.println();
        changementDestination(1, "Genève");
    }

    private static void chargerDonnees() {
        for (int i = 0; i < NB_AVIONS; i++) {
            ArrayList<Bagage> listeBagages = new ArrayList<>();

            for (int j = 0; j < NB_BAGAGES; j++) {
                Bagage b = Bdd.generateBagageData();
                listeBagages.add(b);
            }
            Avion a = Bdd.generateAvionData(listeBagages);
            listeAvions.add(a);
        }
    }

    private static void affichageAvions() {
        for (Avion a : listeAvions) {
            System.out.println(a);
        }
    }

    private static void avionEnSurpoids() {
        for (Avion a : listeAvions) {
            if (a.calculPoids() > poidsMaximum) {
                System.out.println("L'avion " + a.getIdAvion() + " est en surpoids ! Décollage STOP ! (" + a.calculPoids() + " > " + poidsMaximum + ")");
            }
        }
    }

    private static void changementDestination(int idAvion, String nouvelleDestination) {
        for (Avion a : listeAvions) {
            if (idAvion == a.getIdAvion()) {
                a.setDestination(nouvelleDestination);
                System.out.println("Mise à jour des informations du vol suivant : \n" + a);
            }
        }

    }
}
