package OOPMostenire;

import org.checkerframework.common.initializedfields.qual.EnsuresInitializedFields;

import java.util.List;

public class Volei extends Sport {
    public boolean Capitan;
    public Integer NrEchipamente;
    public List<String>Reguli;

    public Volei(String nume, String denumire,boolean esteEchipa,Integer nrMembri,
                 boolean Capitan, Integer nrEchipamente ,List<String>Reguli){
        super(nume, denumire, esteEchipa, nrMembri);
        this.Capitan= Capitan;
        this.NrEchipamente= nrEchipamente;
        this.Reguli= Reguli;
    }
        public void InfoVolei(){
                System.out.println("informatiile despr Volei sunt: ");
                InfoSport();
                System.out.println(Capitan);
                System.out.println(NrEchipamente);
                System.out.println(Reguli);
        }


}
