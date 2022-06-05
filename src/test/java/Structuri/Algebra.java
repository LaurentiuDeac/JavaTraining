package Structuri;

import org.junit.Test;

public class Algebra {


    @Test
    public void AlgebraTest() {
        PrinteazaNumere();
        PrinteazaWhile();
        PrinteazaPar( 100);
    }

        //printam 50 de  numere for
    public void PrinteazaNumere(){
            for(Integer index=0; index<51; index++){
                System.out.println(index);
            }
        }


        // While
    public  void PrinteazaWhile(){
        Integer index=0;
        while (index<51);
        System.out.println((index));
        index++;

    }

    // Printeaza numerele pare de la 0 pana la un numar

    public void PrinteazaPar(Integer capat){
        for(Integer index=0; index<capat; index++ ){
            if(index%2==0){
                System.out.println(index);
            }
        }

    }


}
