package Tema;

import org.junit.Test;

import javax.swing.plaf.synth.SynthButtonUI;

public class TemaStructures {

    @Test
    public void Tema(){

        Sum2(2, 3, 4);
        Sum2(2, 3, 7);
        Yes5Times();
        Yes6Times();
        Verific5NumeredivizibileCu3();
        Verific3NumeredivizibileCu5();
        Verific4NumerePozitiveSiPare();
        SumaCelor10();
        ProdusulPrimelor5();


    }

    public void Sum2(Integer a,Integer b,Integer c){
        Integer adunare=a+b;
        if (adunare>c){
            System.out.println(adunare>c);
            System.out.println("suma "+adunare+" este mai mare decat "+ c);
        }
        else {
            System.out.println("suma "+adunare+" este mai mica decat "+ c);
        }
    }
    public void Yes5Times(){
        String word="Da";
        System.out.println(word+" " + word+" " +word+" " + word+" " + word);
    }
    public void Yes6Times(){
        Integer i;
        for(i=1;i<=6;i=i+1){
            System.out.print("DA"+" ");
        }
        System.out.println();
    }
    public  void Verific5NumeredivizibileCu3(){
        Integer nr=0;
        Integer gasit=0;
        while (gasit<5){
            if (nr % 3 == 0 ){
                gasit=gasit+1;
                System.out.println("numar divizibil cu 3 " +nr);
                nr=nr+1;
            }
            else {
                nr=nr+1;
            }
        }
    }
    public  void Verific3NumeredivizibileCu5(){
        Integer nr=0;
        Integer gasit=0;
        while (gasit<3){
            if (nr % 5 == 0 ){
                gasit=gasit+1;
                System.out.println("numar divizibil cu 5 " +nr);
                nr=nr+1;
            }
            else {
                nr=nr+1;
            }
        }
    }

    public  void Verific4NumerePozitiveSiPare(){
        Integer nr=0;
        Integer gasit=0;
        while (gasit<4){
            if (nr > 0 && nr % 2 == 0 ){
                gasit=gasit+1;
                System.out.println(nr);
                nr=nr+1;
            }
            else {
                nr=nr+1;
            }
        }
    }

    public void SumaCelor10(){
        Integer sum=0;
        Integer i;
        for (i=1; i<=10;i=i+1){
            sum=sum+i;
        }
        System.out.println("Suma celor 10 este: "+sum );

    }

    public void ProdusulPrimelor5(){
        Integer produs=1;
        Integer i;
        for (i=1; i<=5;i=i+1){
            produs=produs*i;
        }
        System.out.println("Produsul primelor 5 este: "+produs );

    }

}
