package ObjectConstructor;

import java.util.List;

public class Student {


    public String Nume;
    public  String Prenume;
    public Integer Varsta;
    public Double Inaltime;
    public Character Sex;
    public Boolean areBursa;
    public List<Integer> noteMatematica;
    public List<Integer> noteRomana;
    public List<Integer>noteMaghiara;

    //obiect= instanta unei clase
    //constructor= are ca si rol sa initializeze variabilele unei clase
    // nu poti sa ai un obiect fara constructor sau invers
    //tipuri contructor= cu parametri si fara parametri
    //by default= avem un constructor fara parametri in orice clasa
    //           =intr o clasa putem avea "n" constructori
    //Structura constructor: public numele clasei(are sau nu parametri)
    //nu exista constructori fara "return"


    public Student(String Nume, String Prenume, Integer Varsta, Double Inaltime,
                   Character Sex, Boolean areBursa, List<Integer>noteMatematica,
                   List<Integer>noteRomana){
        this.Nume=Nume;
        this.Prenume=Prenume;
        this.Varsta=Varsta;
        this.Inaltime=Inaltime;
        this.Sex=Sex;
        this.areBursa=areBursa;
        this.noteMatematica=noteMatematica;
        this.noteRomana=noteRomana;


    }


    //facem un alt constructor doar cu note Matematica


    public Student(String nume, String prenume, Integer varsta, Double inaltime, Character sex, Boolean areBursa, List<Integer> noteMatematica) {
        Nume = nume;
        Prenume = prenume;
        Varsta = varsta;
        Inaltime = inaltime;
        Sex = sex;
        this.areBursa = areBursa;
        this.noteMatematica = noteMatematica;
    }

    public Student(String nume, String prenume, Integer varsta, Double inaltime, Character sex, Boolean areBursa, List<Integer> noteMatematica, List<Integer> noteRomana, List<Integer> noteMaghiara) {
        Nume = nume;
        Prenume = prenume;
        Varsta = varsta;
        Inaltime = inaltime;
        Sex = sex;
        this.areBursa = areBursa;
        this.noteMatematica = noteMatematica;
        this.noteRomana = noteRomana;
        this.noteMaghiara = noteMaghiara;
    }

    public void infoStudent(){
        System.out.println("numele studentului este "+Nume);
        System.out.println("prenume studentului este "+Prenume);
        System.out.println("varsta  studentului este "+Varsta);
        System.out.println("Inaltimea  studentului este "+String.format("%.2f",Inaltime));
        //System.out.printf("Inaltimea studentului este: %.2f%n",Inaltime);
        System.out.println("sexul  studentului este "+Sex);

        System.out.println("are studentul bursa? "+areBursa);


    }

    public void infoNote(String Materie){
        if (Materie.equals("romana") || Materie.equals("Romana")){
            System.out.println("notele studentului la romana sunt urmatoarele");
            PrintNoteLista(noteRomana);
        }
        if (Materie.equals("matematica") || Materie.equals("Matematica")){
            System.out.println("notele studentului la matematica sunt urmatoarele");
            PrintNoteLista(noteMatematica);
        }
        if (Materie.equals("maghiara") || Materie.equals("Maghiara")){
            System.out.println("notele studentului la mmaghiara sunt urmatoarele");
            PrintNoteLista(noteMaghiara);
        }
    }

    public void PrintNoteLista(List<Integer>note){
        for(Integer index=0; index<note.size();index++){
            System.out.println(note.get(index));
        }

    }

    public void calculMedie(String Materie){
        if (Materie.equals("matematica") || Materie.equals("Matematica")){
            System.out.println("media studentului la matematica este ");
            PrintCalculMedie(noteMatematica);
        }
        if (Materie.equals("romana") || Materie.equals("Romana")) {
            System.out.println("media studentului la romana este ");
            PrintCalculMedie(noteRomana);
        }
        if (Materie.equals("maghiara") || Materie.equals("Maghiara")) {
            System.out.println("media studentului la maghiara este ");
            PrintCalculMedie(noteMaghiara);
        }

    }

    public void PrintCalculMedie(List<Integer> note){
        float suma = 0;
        Integer nrElement = note.size();
        for (int index=0;index<nrElement;index++){
            suma = suma + note.get(index);
        }
        float medie = suma/nrElement;
        System.out.println(medie);
    }

}



