package ValueReference;

import org.junit.Test;

public class Telefon {
    //diferenta intre value type si reference type
    // primitive si nonprimitive

    public Integer variabila1;

    public int variabila2;



    @Test

    public void metodaTest(){
        variabila2 = 10;
        variabila1 = 10;
        adunare(variabila1);
        adunare(variabila2);
        System.out.println(variabila1);
        System.out.println(variabila2);

        //string este nonprimitiva
        String variabila3="este"; //nonprimitiva
        String variabila4= new String("este"); // primitiva

        // exemplu referinta
        Tabla tabla1= new Tabla("fier", "ceramica");
        tabla1.info();
        tabla1.denumire="plastic";
        tabla1.info();


    }

    public void adunare(int x){
        x = x+1;
        System.out.println(x);

    }


}
