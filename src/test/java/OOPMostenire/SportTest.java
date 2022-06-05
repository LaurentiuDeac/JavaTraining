package OOPMostenire;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SportTest {

    @Test
    public void  mostenireTest(){
        //facem  primul obiect (copil) pt fotbal
        List<String> reguliFotbal=new ArrayList<>();
        reguliFotbal.add("nu ai voie sa atingi mingea cu mana");
        reguliFotbal.add("nu ai voie sa faci fault");
        reguliFotbal.add("nu ai voie sa dai tricoul jos");

        Fotbal fotbalSport = new Fotbal("fotbal", " sport echipa", true, 11,
                true,3,reguliFotbal);
        fotbalSport.InfoSport();
        fotbalSport.infoFotbal();
        fotbalSport.Reguli=null;
        fotbalSport.infoFotbal();
    }
    @Test

    public void mostenireVolei(){
        // facem copil pentru volei
        List<String>reguluiVolei = new ArrayList<>();
        reguluiVolei.add("Trebuie sa servesti din afara careului");
        System.out.println();
        reguluiVolei.add("Fiecare miscare trebuie sa inceapa cu un serviciu");
        System.out.println();
        reguluiVolei.add("Fiecare echipa are dreptul la maximum trei lovituri inainte de a lovi mingea peste plasa");
        System.out.println();

        Volei volesiSport = new Volei("volei", "sport echipa", true,6,
                true,2, reguluiVolei);
        volesiSport.InfoVolei();
        volesiSport.InfoVolei();
    }
}
