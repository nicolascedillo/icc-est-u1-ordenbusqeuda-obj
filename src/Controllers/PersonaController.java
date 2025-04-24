package Controllers;

import Models.Persona;

public class PersonaController {

    public void sortByDireccionCodigo(Persona[] personas){
        int n = personas.length;
        for (int i = 0; i<n-1;i++){
            int indx = i;
            for (int j = i+1;j<n;j++){
                if(personas[j].equalsByCodigoDireccion(personas[indx])){
                    indx = j;
                }
            }
            if(indx != i){
                Persona temp = personas[indx];
                personas[indx] = personas[i];
                personas[i] = temp;
            }
        }
    }

    public Persona findByCodigo(Persona[] personas, int codigo){
        int bajo = 0;
        int alto = personas.length -1;
        while (bajo<=alto){
            int central = bajo +(alto - bajo)/2;
            int valorCentral = personas[central].getCodigoDireccion();
            if (valorCentral == codigo){
                return personas[central];
            }
            if(valorCentral > codigo){
                bajo = central +1;
            } else{
                alto = central -1;
            }
        }
        return null;
    }

    
}
