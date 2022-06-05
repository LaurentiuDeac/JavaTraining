package Tema;

import org.junit.Test;

public class TemaVariables {

    public String Lume;
    public Integer Varsta;
    public String Nume;
    public String Prenume;
    public String Mesaj;
    public String Cuvant1;
    public String Cuvant2;


    @Test
    public void Tema(){
        Lume="Hello world";
        Nume="Deac";
        Prenume="Laurentiu";
        Varsta=31;
        Mesaj="Stiu ca am calculat bine !";
        Cuvant1="Salut";
        Cuvant2="Hello";

        System.out.println("Hello world");
        System.out.println(Nume);
        System.out.println(Prenume);
        System.out.println("Am"+" "+31+ " "+"de ani");
        System.out.println(Cuvant1+'M');
        System.out.println('M'+Cuvant2);
        System.out.println("");

        PrinteazaOra();
        Printeazadata();
        ZiuaM();
        ZiuaJ();
        Calcul(2, 3, 4);
        SumaTreiNumere(2.1, 3.2, 4.3);
        InmultireADouaNumere(2, 9);
        Propozitie();

    }
    public void PrinteazaOra (){
        Integer Ora=17;
        Integer Minute=20;
        System.out.println("Este ora: " +Ora+ ":" +Minute);
    }
    public  void Printeazadata(){
        Integer Zi=18;
        Integer Luna=05;
        Integer An=2022;
        System.out.println(Zi+ ":" +Luna+ ":" +An);
    }
    public void ZiuaM(){
        String day="Marti";
        System.out.println("Azi este"+" "+day+","+"si am avut tema de facut.");
    }
    public void ZiuaJ(){
            String day="Joi";
            System.out.println("Tema o am de prezentat"+" "+ day+" "+"la curs");
            System.out.println(" Poti pleca acasa dupa ce iti verific munca!");
    }
    public void Calcul(Integer a, Integer b, Integer c){
            Integer inmultire=b*c;
            Integer adunare=a+inmultire;
            Integer scadere=adunare-b;
            double impartire= scadere.doubleValue()/b;
            System.out.println("Rezultatul corect este:"+ impartire+ " Stiu ca am calculat bine !");
            System.out.println(" Poti pleca acasa dupa ce iti verific munca!");
    }
    public void SumaTreiNumere(double x, double y, double z){
        double adunare=x+y+z;
        System.out.println("Rezultatul este: " + adunare+ " " + Mesaj);
        System.out.println(" Poti pleca acasa dupa ce iti verific munca!");
    }
    public void InmultireADouaNumere(Integer a, Integer b) {
        Integer Inmultire = a * b;
        System.out.println("Rezultatul este: " + Inmultire + " " + Mesaj);
        System.out.println(" Poti pleca acasa dupa ce iti verific munca!");
    }
    public void Propozitie(){
        String a="Ana";
        String b="are";
        String c="mere";
        String d="pere";
        String e="prune";
        System.out.println(a+'Z'+" "+b+'Z'+" "+c+'Z'+","+d+'Z'+","+e+'Z'+".");
        System.out.println(" Poti pleca acasa dupa ce iti verific munca!");
    }

}



