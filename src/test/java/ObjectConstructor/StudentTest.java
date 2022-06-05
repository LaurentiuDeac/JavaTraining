package ObjectConstructor;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {

    //obiect=instanta unei clase
    //obiectul este stric legat de constructor
    //dintr o clasa putem declara "n" obiecte
    //obiectele se diferenteaza pe baza numelui
    //structura obiect : nume clasa  + nume obiect =new nume clasa (valori parametri)
    //recunoastem un biect dupa cuvantul "new"

    @Test
    public void MetodaTest(){
        // primul obiect
        List<Integer>noteRomanaLaurentiu= new ArrayList<>();
        noteRomanaLaurentiu.add(8);
        noteRomanaLaurentiu.add(10);
        noteRomanaLaurentiu.add(9);
        noteRomanaLaurentiu.add(7);
        List<Integer>noteMatematicaLaurentiu= new ArrayList<>();
        noteMatematicaLaurentiu.add(9);
        noteMatematicaLaurentiu.add(4);
        noteMatematicaLaurentiu.add(5);

        Student Laurentiu=new Student("Deac","Laurentiu",  31, 1.76,  'M' ,
        true,noteMatematicaLaurentiu, noteRomanaLaurentiu);


        Laurentiu.infoStudent();
        Laurentiu.infoNote("romana");
        Laurentiu.infoNote("matematica");
        System.out.println();
        Laurentiu.Prenume="Vasile";
        Laurentiu.infoStudent();
        System.out.println();




        List<Integer>noteRomanaAlex= new ArrayList<>();
        noteRomanaAlex.add(6);
        noteRomanaAlex.add(6);
        noteRomanaAlex.add(4);
        noteRomanaAlex.add(3);
        List<Integer>noteMatematicaAlex= new ArrayList<>();
        noteMatematicaAlex.add(6);
        noteMatematicaAlex.add(8);
        noteMatematicaAlex.add(9);

        Student Dorha=new Student("Dorha","Alex",  27, 1.80,  'M' ,
                true,noteMatematicaAlex, noteRomanaAlex);
        Dorha.infoStudent();
        Dorha.infoNote("romana");
        Dorha.infoNote("matematica");

        //declaram un  pt un al doile constructor

        List<Integer>noteMatematicaClaudiu= new ArrayList<>();
        noteMatematicaAlex.add(6);
        noteMatematicaAlex.add(6);
        noteMatematicaAlex.add(9);

        Student Pop=new Student("Pop","Claudiu",  26, 1.75,  'M' ,
                true,noteMatematicaClaudiu);
        Pop.infoStudent();
        Pop.infoNote("matematica");

        List<Integer>noteRomanaPop= new ArrayList<>();
        noteRomanaPop.add(6);
        noteRomanaPop.add(6);
        noteRomanaPop.add(4);
        noteRomanaPop.add(3);
        List<Integer>noteMatematicaPop= new ArrayList<>();
        noteMatematicaPop.add(6);
        noteMatematicaPop.add(8);
        noteMatematicaPop.add(9);
        List<Integer>noteMaghiaraPop= new ArrayList<>();
        noteMaghiaraPop.add(6);
        noteMaghiaraPop.add(6);
        noteMaghiaraPop.add(3);

        Student PopC=new Student("Pop","Claudiu",  26, 1.75,  'M' ,
                true,noteMatematicaPop, noteRomanaPop, noteMaghiaraPop);

        PopC.infoStudent();
        PopC.infoNote("Maghiara");
        PopC.calculMedie("matematica");

    }


}
