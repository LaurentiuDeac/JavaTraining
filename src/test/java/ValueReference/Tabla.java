package ValueReference;

public class Tabla {

    public String denumire;
    public String material;

    public Tabla(String denumire, String material) {
        this.denumire = denumire;
        this.material = material;
    }

    public void  info(){
        System.out.println(denumire+" "+material);

    }

}
