package ProtectedControl;

import AccessControl.AccessControl;

public class Banca extends AccessControl {

    public void zzz(){

        // poate sa apeleze metoda PROTECTED chiar daca e in alt pachet/folder deoarece mosteneste clasa
        metodaProtected();
        metodaPublica();
    }

}
