package src;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Bdd {
    private static int idGenerateBagage = 0;
    private static int idGenerateAvion = 0;
    public static Bagage generateBagageData(){
        String[] nameList = {"Noah","Liam","Matteo","Leon","Luca","Elias","Gabriel","Ben","Louis","Aaron","Mia","Emma","Mila","Emilia","Lina","Sofia","Elena","Lea","Alina","Laura"};
        String[] surnameList = {"Bernasconi","Fontana","Crivelli","Galli","Cereghetti","Colombo","Rossi","Ferrari","Cavadini","Sante","Ravelli","Giovanni","Piero", "Martin","Bernard","Thomas","Petit","Robert","Richard","Durand","Dubois","Moreau","Laurent","Simon","Michel","Lefebvre","Leroy","Roux","David","Bertrand","Morel","Fournier","Girard","Bonnet","Dupont","Lambert","Fontaine","Rousseau","Vincent","Muller","Lefevre","Faure"};
        Random r = new Random();
        Bagage b = new Bagage(++idGenerateBagage,(double)Math.round(100*(1 + (30 - 1) * r.nextDouble()))/100,surnameList[r.nextInt(surnameList.length)],nameList[r.nextInt(nameList.length)]);;
        return b;
    }

    public static Avion generateAvionData(ArrayList<Bagage> bagages){
        String[] destination = {"Atlanta H.-Jackson","Pékin-Capitale","Los Angeles","Dubaï","Tokyo-Haneda","Chicago-O'Hare","Londres-Heathrow","Shanghai-Pudong","Paris-Charles de Gaulle","Dallas-Fort Worth","Canton-Baiyun","Amsterdam","Hong Kong","Séoul-Incheon","Francfort","Denver","Delhi-Indira Gandhi","Singapour-Changi","Bangkok-Suvarnabhumi","New York-John F. Kennedy"};
        String[] horaires = {"08:10","08:20","08:30","08:40","08:50","09:00","09:10","09:20","09:30","09:40","09:50","10:00","10:10","10:20","10:30","10:40","10:50","11:00","11:10","11:20","11:30","11:40","11:50","12:00","12:10","12:20","12:30","12:40","12:50","13:00","13:10","13:20","13:30","13:40","13:50","14:00","14:10","14:20","14:30","14:40","14:50","15:00","15:10","15:20","15:30","15:40","15:50","16:00","16:10","16:20","16:30","16:40","16:50","17:00","17:10","17:20","17:30","17:40","17:50","18:00","18:10","18:20","18:30","18:40","18:50","19:00","19:10","19:20","19:30","19:40","19:50","20:00","20:10","20:20","20:30","20:40","20:50","21:00","21:10","21:20","21:30","21:40","21:50","22:00","22:10","22:20","22:30","22:40","22:50","23:00","23:10","23:20","23:30","23:40","23:50"};
        Random r = new Random();
        Avion a = new Avion(++idGenerateAvion, destination[r.nextInt(destination.length)], horaires[r.nextInt(horaires.length)], bagages);
        return a;
    }
}
