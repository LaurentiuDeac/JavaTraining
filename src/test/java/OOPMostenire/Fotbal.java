package OOPMostenire;

import java.util.List;

public class Fotbal extends Sport {


    public boolean Capitan;
    public  Integer NrEchipamente;
    public List<String> Reguli;

    public Fotbal(String nume, String denumire, Boolean esteEchipa, Integer nrMembri,
                  boolean Capitan, Integer NrEchipamente ,List<String> Reguli) {
        super(nume, denumire, esteEchipa, nrMembri);
        this.Capitan= Capitan;
        this.NrEchipamente= NrEchipamente;
        this.Reguli= Reguli;

    }
    public void infoFotbal(){
        System.out.println("informatiile despre fotbal sunt: ");
        InfoSport();
        System.out.println(Capitan);
        System.out.println(NrEchipamente);
        System.out.println(Reguli);

    }
}
