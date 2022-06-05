package Multimi;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Obiect {

    @Test
    public  void Obiect(){

        PrintNumeArray();
        System.out.println();
        PrintNumeLista();
        System.out.println();
        PrintValoriHasmap();
        TariOrase();

    }
    // Array vector  ,  toate elementele sa fie de acelas tip
    // Lista
    // Hashmap

    //Printam toate valorile dintr un array
    public  void PrintNumeArray(){

        String[] sir=new String[4];
        sir[0]="Ana";
        sir[1]="Alex";
        sir[2]="Bogdan";
        sir[3]="Rares";

        for (Integer i=0; i<sir.length; i++){
            System.out.println(sir[i]);
        }
    }
    public void PrintNumeLista(){
        List<String> lista=new ArrayList<>();
        lista.add("Ana");
        lista.add("Maria");
        lista.add("Ion");
        lista.add("Alex");
        lista.add("Bogdan");
        for (Integer i=0; i<lista.size();i++){
            System.out.println(lista.get(i));
        }
    }
    // Se foloseste for each la hasmap
    //Printeazavalori diferite dintr o multime

    public void PrintValoriHasmap(){
        HashMap<String,String> HHBB=new HashMap<>();
        HHBB.put("fruct","mar");
        HHBB.put("haine","pantaloni");
        HHBB.put("leguma","cartof");
        for(String key: HHBB.keySet()){
            System.out.print("Cheia este " + key);
            System.out.println("Valoarea este " +HHBB.get(key));
        }
    }

    public void TariOrase() {
        List<String> OraseItalia = new ArrayList<>();
        OraseItalia.add("Roma");
        OraseItalia.add("Torino");

        List<String> OraseRomania =new ArrayList<>();
        OraseRomania.add("Cluj");
        OraseRomania.add("Dej");
        OraseRomania.add("Gherla");

        List<String> OraseSpania = new ArrayList<>();
        OraseSpania.add("Barcelona");
        OraseSpania.add("Valencia");
        OraseSpania.add("Madrid");
        OraseSpania.add("Malaga");

        HashMap<String, List<String>> Hmap = new HashMap<>();
        Hmap.put("Romania", OraseRomania);
        Hmap.put("Italia", OraseItalia);
        Hmap.put("Spania", OraseSpania);

        for (String key : Hmap.keySet()) {
            System.out.println("Tara este " + key);
            System.out.println("Orasele sunt " + Hmap.get(key));
        }
    }

}
