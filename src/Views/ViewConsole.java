package Views;

import Models.Persona;

public class ViewConsole {

    public void printArray(Persona[] personas){
        System.out.println("El arreglo es: ");
        for (Persona p:personas){
            System.out.println(p);
        }
    }
    
}
