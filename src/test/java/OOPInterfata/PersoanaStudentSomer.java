package OOPInterfata;

import OOPInterfata.PersoanaInterfata;
import OOPInterfata.Somer;
import OOPInterfata.Student;

public class PersoanaStudentSomer extends PersoanaInterfata implements Student, Somer {
    public PersoanaStudentSomer(String nume, String prenume, String meserie) {
        super(nume, prenume, meserie);
    }

    @Override
    public void Someaza() {
        System.out.println("Student/Somer "+getNume()+ " " + getPrenume()+ " someaza");

    }

    @Override
    public void PrimesteAjutor() {
        System.out.println("Student/Angajat "+getNume()+ " " + getPrenume()+ " primeste ajutor");

    }

    @Override
    public void Invata() {
        System.out.println("Student/Angajat "+getNume()+ " " + getPrenume()+ " invata");

    }

    @Override
    public void PrimesteBursa() {
        System.out.println("Student/Angajat "+getNume()+ " " + getPrenume()+ " primeste bursa");

    }
}
