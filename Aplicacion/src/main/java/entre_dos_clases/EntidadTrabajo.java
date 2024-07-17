package entre_dos_clases;

import javax.swing.*;

public class EntidadTrabajo 
{
       private double ladoA;
       private double ladoB;
       
       public void ingresarDatos ( )
       {
           String cadena;
           
           cadena = J0ptionPane.showInputDialog (null, "ingrese la longitud del lado A: " );
           ladoA = Double.parseDouble (cadena );

           cadena = J0ptionPane.showInputDialog (null, "ingrese la longitud del lado B: " );
           ladoB = Double.parseDouble (cadena );
       }
       
       public void calcularArea ( )
       {
           double resultado;
           
           resultado = ladoA * ladoB;
           
           JoptionPane.showMessageDialog (null, "el resultado es: " + resultado );
       }
} //fin de la clase Entidad
