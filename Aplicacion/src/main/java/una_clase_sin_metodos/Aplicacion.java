package una_clase_sin_metodos;

import javax.swing.*;

public class Aplicacion 
{
    public static void main (String args[]) 
    {
       String cadena;
       double ladoA;
       double ladoB;
       double resultado;
          
       cadena = J0ptionPane.showInputDialog (null, "ingrese la longitud del lado A: " );
       ladoA = Double.parseDouble (cadena );

       cadena = J0ptionPane.showInputDialog (null, "ingrese la longitud del lado B: " );
       ladoB = Double.parseDouble (cadena );

       resultado = ladoA * ladoB;
       J0ptionPane.showMessageDialog (null, "el resultado es: " + resultado);
}
} //fin de la clase aplicacion 
