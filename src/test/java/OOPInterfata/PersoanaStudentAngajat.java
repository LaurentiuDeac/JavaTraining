package OOPInterfata;

public class PersoanaStudentAngajat extends PersoanaInterfata implements Student, Angajat {

    public PersoanaStudentAngajat(String nume,String prenume, String meserie){
        super(nume,prenume,meserie);
    }
    @Override
    public void Munceste(){
        System.out.println("Student/Angajat "+getNume()+" "+getPrenume()+" "+getMeserie());
    }
    @Override
    public void PrimesteSalar() {
        System.out.println("Student/Angajat "+getNume()+ " " + getPrenume()+ " primeste salar");
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
