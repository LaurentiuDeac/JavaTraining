package OOPIncapsulare;

import java.util.List;

public class Audi extends Masina {
    public List<String>dotariInterioare;
    public List<String >dotariExterioare;

    public Audi(String brand, String model, Integer pret) {
        super(brand, model, pret);
    }
    public void infoAudi(){
        System.out.println(getBrand());
        System.out.println(getModel());
        System.out.println(getPret());
    }
    //sprascriem o metoda din clasa parinte


    @Override
    public void cumparaMasina(){
        System.out.println("vreau sa cumpar Audi");
        super.cumparaMasina();

    }
    //polimorfism static

    public void fiseazaMasini(){
        System.out.println("nu avem masini");

    }
    public void fiseazaMasini(String brand){
        System.out.println("nu avem masini");

    }
    public void fiseazaMasini(Integer brand){
        System.out.println("nu avem masini");

    }

    //polimorfism static la metode cu return

    public String getNume(){
        return "Laurenti";
    }
    public String getNume(Integer parametru){
        return "Laurenti";
    }
    public String getNume(String parametru){
        return "Laurenti";
    }

    // polimorfism static se poate aplica doar la  metodele cu return care au parametri
    // nu are nici o importanta numarul parametrilor sau tipul parametrilor
}
