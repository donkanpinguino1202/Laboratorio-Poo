package una_clase_con_metodos;

import javax.swing.*;

public class AplicacionClaseMetodos 
{
    public static void main(String args[]) 
    {
       double ladoA;
       double ladoB;
       
       ladoA = ingresarDatos ( "ingrese la longitud del lado A: " );
       ladoB = ingresarDatos ( "ingrese la longitud del lado B: " );
       
       calcularArea ( ladoA, ladoB );
    }
    
    public static double ingresarDatos ( String mensaje )
    {
       String cadena;
       double valor;
    
       cadena = J0ptionPane.showInputDialog ( null, mensaje );
       valor  = Double.parseDouble (cadena );
       
       return valor;
    }
    
    public static void calcularArea (double a, double b)
    {
       double resultado;
       
       resultado = a * b;
       
       J0ptionPane.showMessageDialog (null, "el resultado es: " + resultado);
    }} // fin de la clase Aplicacion usando clase y metodos

