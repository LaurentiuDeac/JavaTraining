package Structuri;

import org.junit.Test;

public class Matematica {

    // structuri= Alternative si Repetitive
    // Structuri alternative= If.. THEN.. ELSE.. si SWITCH....CASE

@Test
public void Matematicatest(){
    numarMaiMareCa20();
    numarpar();
    numarMaiMareCaUnNumar(68,18);
    numarMaiMareCaUnNumar(5,10);
    VerificParitateNumar(21);
    VerificParitateNumar(22);
    VerificNumarImparDivizivil(5);
    VerificNumarImparDivizivil(10);
    VerificNumarImparDivizivil(14);
    VerificNumarImparDivizivil(9);
    PrinteazaZi( "Duminica");

}

   // "/"  este folosit in programare pt a prezenta  impartirea
    // "%" se foloseste pt rest

    //Verificam daca un numar ii mai mare 20
    public void numarMaiMareCa20(){

        if (38>20){
            System.out.println("numarul 38 este mai mare ca 20");
        }
        else {
            System.out.println("numarul 38 este mai mic ca 20");
        }
    }


    public void numarMaiMareCaUnNumar(Integer Numar,Integer Comparatie){

        if (Numar>Comparatie){
            System.out.println("numarul " + Numar + " este mai mare ca " + Comparatie);
        }
        else {
            System.out.println("numarul " + Numar + " este mai mic ca " + Comparatie);
        }
    }

// verificam daca un numar este par
    public void numarpar(){
    if (8%2==0){
        System.out.println("numarul este  impar ");
        }
    else
        System.out.println("numarul este par");

    }
    public void VerificParitateNumar(Integer Number){
        if (Number%2==0){
            System.out.println(Number + " este  par ");
        }
        else
            System.out.println(Number + "  este impar");
    }
    // verific daca un numar este impar si divizibil cu 5
    public void VerificNumarImparDivizivil(Integer numar){
        if (numar % 2 == 1) {
            if (numar % 5 == 0) {
                System.out.println(numar + " este impar si divizibul cu 5 ");
            } else {
                System.out.println(numar + " este impar dar nu este divizibil cu 5 ");
            }
        }
        else {
            if (numar%5==0){
                System.out.println(numar + " este par si divizibul cu 5 ");
            }
            else {
                System.out.println(numar + " este par dar nu este divizibil cu 5 ");
            }
        }

    }
    // switch case pe zilele saptamani
    public void PrinteazaZi(String ZiCurenta){
    switch (ZiCurenta){
        case "Duminica":
           System.out.println("Astazi este Duminica");
           break;
        case "Luni":
             System.out.println("Astazi este Luni");
             break;
        case "Marti":
            System.out.println("Astazi este Marti");
            break;

    }
    }







}
