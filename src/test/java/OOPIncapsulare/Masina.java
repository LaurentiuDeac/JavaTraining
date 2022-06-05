package OOPIncapsulare;

public class Masina {

    //incapsulare = coneptul prin care tinem deparet de exterior valoreile variabilelor
    //private = access control care blocheaza valorile variabilelor sa fie vazute inafara clasei in care ai declarat o
    //CA SA VEDEM / MODIFCAM VALORILE FOLOSIM CONCEPTUL DE GET SI SET


   private  String brand;
   private  String model;
   private  Integer pret;

    // polimorfism = static si dinamic
    // polimorfism dinamic=  intro ierarhie de clase obtinute prin mostenire o metoda
    // poate avea implementarii diferite
    // plomorfismul static =mai multe metode cu acelai nume se poate diferi
    // prin nr de parametri si tipul de parametri
    // poli  dinamic=ovveride
    // polimorfismul  static= overload
    // polimorfismul static nu se poate aplica la metodele cu return





     public Masina(String brand, String model, Integer pret) {
        this.brand = brand;
        this.model = model;
        this.pret = pret;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Integer getPret() {
        return pret;
    }

    public void setModel(String model) {
        this.model = model;
    }

    //definim o metoda pe care o vom suprascrie

    public void cumparaMasina(){
        System.out.println("vreau sa cumpar o masina");


    }

}
