package AccessControl;

public class AccessControl {

    // public - public pentru toata lumea
    // private - nu putem scoate informatii din clasa
    // protected - aproape public pentru toata lumea
    // Daca vorbim de mostenire protected e vizibil in acelasi pachet sau pachete diferite
    // Daca vorbim de obiect este vizibil doar in acelasi pachet

    public void metodaPublica(){

    }

    private void metodaPrivata(){

    }
    //poate fi apelata in cadrul pachetului/folderului
    //poate fi apelata in clasele copii indiferent unde se afla ele (chiar daca sunt in alt folder)
    protected void metodaProtected(){

    }
}
