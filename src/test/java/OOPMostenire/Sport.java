package OOPMostenire;

//mostenire polimofism , incapsulare si abstractizare

public class Sport {
    public String Nume;
    public String Denumire;
    public Boolean esteEchipa;
    public Integer NrMembri;

    public Sport(String nume, String denumire, Boolean esteEchipa, Integer nrMembri) {
        Nume = nume;
        Denumire = denumire;
        this.esteEchipa = esteEchipa;
        NrMembri = nrMembri;

    }

     //OOP mostenire= principiul pe baza caruia clasa parinte poate sa fie mostenita de N clase copii.
    //ex : Casa buniciloir cu nepotii( nepotii au acess la toate obiectele din casa si pot fqace ce vor cu ele )
    // in java putem mosteni o singura clasa
    //in momentulmin care clasa copil mosteneste clasa parinte trebuie sa apelam  constructorul din clasa parinte
    //

    public void InfoSport(){
        System.out.println(Nume);
        System.out.println(Denumire);
        System.out.println(esteEchipa);
        System.out.println(NrMembri);
    }
}
