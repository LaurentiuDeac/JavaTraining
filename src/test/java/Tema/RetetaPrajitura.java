
package Tema;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RetetaPrajitura {
    @Test
    public void PrajiturFanta(){
        // https://jamilacuisine.ro/prajitura-fanta-reteta-video/

        HashMap<Integer,String> Blatprajitura=new HashMap<>();
        Blatprajitura.put(6,"oua");
        Blatprajitura.put(200,"g zahar");
        Blatprajitura.put(150,"g faina");
        Blatprajitura.put(2,"lingurite de esenta de portocale");
        Blatprajitura.put(100,"ml ulei");
        Blatprajitura.put(10,"g praf de copt");
        Blatprajitura.put(1,"lingura sare");

        System.out.println("Ingrediente pentru blat:");
        for (Integer key:Blatprajitura.keySet()){
            System.out.println("  "+ key+" "+Blatprajitura.get(key));
        }
        System.out.println();

        HashMap<Integer,String>Crema=new HashMap<>();
        Crema.put(250,"g mascarpone");
        Crema.put(500,"branza de vaci (20% grasime) ");
        Crema.put(200,"g de unt moale");
        Crema.put(150,"g de zahar pudra");
        Crema.put(50,"g zahar vanilat");
        Crema.put(1,"lingura de esenta de vanilie");

        System.out.println("Ingrediente pentru crema:");
        for (Integer key:Crema.keySet()){
            System.out.println("  "+key+" "+Crema.get(key));
        }
        System.out.println();

        HashMap<Integer,String>PentruJeleu=new HashMap<>();
        PentruJeleu.put(800,"ml suc proaspat de portocale");
        PentruJeleu.put(2,"plicuri budinca de vanilie");
        PentruJeleu.put(110,"g zahar");

        System.out.println("Ingrediente pentru jeleu:");
        for (Integer key: PentruJeleu.keySet()){
            System.out.println("  "+key+" "+PentruJeleu.get(key));
        }
        System.out.println();
        System.out.println("Mod de preparare:");
        System.out.println("  Blat:  Separam galbenusurile de albusuri. Mixam galbenusurile cu zaharul 1-2 minute " +
                "\n cat sa se omogenizeze, apoi adaugam uleiul in fir subtire si mixam in continuare. Adaugam faina " +
                "\n amestecata cu cacaua si praful de copt, toate cernute. Batem albusurile spuma cu un praf de sare" +
                " \n si le incorporam in compozitia de galbenusuri. Amestecam usor, cu miscari lente, de jos in sus." +
                "\n Turnam compozitia intr-o tava (25x35 cm) tapetata cu hartie de copt. Coacem in cuptorul incalzit " +
                "\n la 180 de grade pentru cca 25 de minute. Facem testul cu scobitoarea. Lasam blatul la racit" +
                "\n" +
                "\n  Crema: Mixam untul moale cu zaharul pudra pana devine spuma apoi adaugam branza si esenta" +
                " \n de vanilie si mixam in continuare. Intindem crema peste blatul racit si dam tava la frigider" +
                "\n pentru cca 2 ore." +
                "\n" +
                "\n  Glazura: O preparam dupa indicatiile de pe plicul de budinca, doar ca in loc de lapte folosim " +
                "\n cei 800 ml Fanta (in cazul meu Santal de portocale). Cand este putin calduta o turnam peste stratul" +
                "\n de crema. Dupa doua ore de stat la frigider prajitura se poate portiona si servi. Pofta buna!" +
                "\n" +
                " ");
    }


// https://jamilacuisine.ro/chec-padurea-neagra-reteta-video/

    @Test
    public void ChecPadureaNeagra(){
        List<String>Blat=new ArrayList<>();
        Blat.add("300 g lapte batut");
        Blat.add("200 g faina");
        Blat.add("100 g unt");
        Blat.add("100 g zahar brun");
        Blat.add("100 g zahar tos");
        Blat.add("50 g cacao");
        Blat.add("5 g bicarbonat");
        Blat.add("5 g praf de copt");
        Blat.add("2 oua");
        Blat.add("putina sare");

        List<String>Jeleu=new ArrayList<>();
        Jeleu.add("400 g visine congelate");
        Jeleu.add("100 g zahar tos");
        Jeleu.add("30 g amidon porumb");

        List<String>Crema=new ArrayList<>();
        Crema.add("250 ml smantana pentru gatit cu 30% grasime");
        Crema.add("200 g de ciocolata amaruie");

        HashMap<String,List<String>>Prajitura=new HashMap<>();
        Prajitura.put("blat",Blat);
        Prajitura.put("jeleu",Jeleu);
        Prajitura.put("crema",Crema);
        for (String key:Prajitura.keySet()){
            System.out.println("Ingrediente pentru "+key);
            //Se iau valorile corespunzatoare key( blat,jeleu,crema)
            for (String value:Prajitura.get(key)){
                System.out.println(value);
            }
            System.out.println();
        }
        System.out.println("Mod de preparare:");
        System.out.println(" Reteta de chec Padurea Neagra este una simpla, insa spectaculoasa si foarte gustoasa. " +
                " \n Pentru inceput am facut checul dintr-o compozitie usor umeda si aromata. Este o compozitie simplu " +
                " \n de realizat pe care o puteti folosi si la alte deserturi. Este foarte important sa lasati checul sa" +
                " \n se raceasca complet. Trebuie apoi sa taiati partea superioara si sa scobiti interiorul." +
                " \n Firimiturile ramase le puteti folosi la decor sau le puteti manca pur si simplu. Le puteti folosi" +
                " \n peste inghetata sau la cake pops. Le amestecati cu dulceata sau crema preferata si faceti sfere pe" +
                " \n care le glazurati cu ciocolata. Veti obtine un desert simplu si de efect, foarte potrivit pentru" +
                " \n petrecerile copiilor.");

    }











}
