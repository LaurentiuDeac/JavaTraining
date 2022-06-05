package VariableMethod;

import org.junit.Test;

public class Cursant {


    //acesta este un comentariu
    /*acesta este un altfel de comentariu*/


    //CALSS=o colectie de variabile si metode
    //intr un fisier java putem avea mai multe clase
    //recunoastem o clasa dupa cuvantul cheie "class"
    //sutructura clasa= public class ii dam un  NUME  {  }
    //Orice structura invatam  ca trebuie scrisa in interiorul unei clase ( Java)
    //Variabile=atributul unei clase
    //o clasa poate avea N atribute / deloc
    //tipuri variabile=globala si locala
    //o variabila trebuie sa nu sa primeasca o valoare
    //structura variabila locala= public tip variabila Nume
    //da o valaore unei variabile cu =  (atribuire  este = )

    public String Nume;
    public  String Prenume;
    public Integer Varsta;
    public String Ocupatie;
    public Character Sex;
    public Double Inaltime;
    public Boolean esteAngajat;

    //metoda= actiunea unei clase
    //o clasa poate sa contina n metode
    //tipuri metode:void si return
    //Structura metoda void= public void nume () {}
    //metodele post sau nu sa contina parametri


    @Test
   public void AtribuireVariabile(){
       //dam valori pentru variabilele de mai sus

       Nume="Lauentiu";
       Prenume="Deac";
       Varsta=31;
       Ocupatie="tamplar";
       Sex='M';
       Inaltime=1.75;
       esteAngajat=true;

       //Printam o valoare in consola

        System.out.print(Nume);
        System.out.print(' ');
        System.out.print(Prenume);
        System.out.print(' ');
        System.out.print(Varsta);
        System.out.print(' ');
        System.out.print(Sex);
        System.out.print(' ');
        System.out.print(Inaltime);
        System.out.print(' ');
        System.out.println(esteAngajat);
        //Print vs prinln
        //print= printeaza si ramane pe randul curent
        //println= printeaza si sare la randul urmator
        printeazaNota();
        promovareCurs();

        System.out.println(getSalarV1());
        System.out.println(getSalarV2());

// de facut acasa restul
   }

   //12.05.2022
   // variabila locala= tip variabila + nume

    public void printeazaNota (){

        Integer NotaManual = 10;
        Integer Notaautomation = 9;
        System.out.println("Cursantul Laurentiu a luat notele:" + NotaManual + "," + Notaautomation);

    }
    public void promovareCurs (){
        Boolean promovare= true;
        System.out.println("A promovat cursantul: "+Nume+" "+Prenume+"?");
        System.out.println(promovare);

        //metoda RETURN= exprimra care contine "returneaza"
        //strutura metoda RETURN= public "tip de date" + "nume" (){}
        //exista o conventie in Java ca metodele cu return sa aiba in fata un "get"
        //returnam salarul dorit

    }

    public String getSalarV1() {
        Integer salariu = 10000;
        String s = String.valueOf(salariu) + " lei";
        return s;
    }
    public Integer getSalarV2(){
        Integer salar=5000;
        return salar;

    }

    //   19/05/2022

    //Srepetitive For si While






}
