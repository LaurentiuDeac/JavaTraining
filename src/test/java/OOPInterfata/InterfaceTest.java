package OOPInterfata;

import org.junit.Test;

public class InterfaceTest {

    @Test
    public void metodaInterfata(){

        //Persoana angajat
        PersoanaAngajat persoanaAngajat = new PersoanaAngajat("nume 1","prenume 1","angajat");
        persoanaAngajat.Munceste();
        persoanaAngajat.PrimesteSalar();

        //Persoana student
        PersoanaStudent persoanaStudent = new PersoanaStudent("nume 2","prenume 2","student");
        persoanaStudent.Invata();
        persoanaStudent.PrimesteBursa();
        persoanaStudent.setNume("Laurentiu");
        persoanaStudent.setPrenume("Deac");
        persoanaStudent.Invata();

        // Persoana  student  angajat
        PersoanaStudentAngajat persoanaStudentAngajat = new PersoanaStudentAngajat("Nume 3", "Prenume 3", " invata si munceste");
        persoanaStudentAngajat.Invata();
        persoanaStudentAngajat.Munceste();
        persoanaStudentAngajat.PrimesteBursa();
        persoanaStudentAngajat.PrimesteSalar();
        persoanaStudentAngajat.setMeserie("munceste si uneori mai si invata da rar");
        persoanaStudentAngajat.Munceste();

        PersoanaStudentAngajatSomer persoanaStudentAngajatSomer = new PersoanaStudentAngajatSomer("nume 4","prenume 4","invata si munceste  dar uneori si someaza");
        persoanaStudentAngajatSomer.Invata();
        persoanaStudentAngajatSomer.PrimesteBursa();
        persoanaStudentAngajatSomer.Munceste();
        persoanaStudentAngajatSomer.PrimesteSalar();
        persoanaStudentAngajatSomer.Someaza();
        persoanaStudentAngajatSomer.PrimesteAjutor();


        PersoanaStudentSomer persoanaStudentSomer = new PersoanaStudentSomer("nume 5 ", "prenume 5 "," Invata si uneori someaza");
        persoanaStudentSomer.Invata();
        persoanaStudentSomer.PrimesteBursa();
        persoanaStudentSomer.Someaza();
        persoanaStudentSomer.PrimesteAjutor();


    }
}
