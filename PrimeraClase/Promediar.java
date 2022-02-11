
/**
 * Esta pequeña programación sirve para promediar dos números.
 * 
 * @author (Nayarith Jiménez 2017100188) 
 * @version (1.0 - 17 de junio de 2021)
 */
import java.util.Scanner;
public class Promediar
{
    // instance variables - replace the example below with your own
     double x;
     double y;
     
     

    /**
     * Constructor for objects of class Promediar
     */
    public void Promediar( double x, double y, double suma, double promedio)
    {
        // initialise instance variables
        x=0;
        y= 0;
         
        
        //Constructor donde le asigno un valor a x diferente de cero.
        
    }

    public void Datos() 
    {
        Scanner teclado = new Scanner(System.in);

        System.out.print ("introduzca el primer número x :");
        x = teclado.nextInt();
        
        
        System.out.print ("introduzca el segundo número y :");
        y = teclado.nextInt();
    }
    
    // A continuación, el método que va a servir para calcular el promedio de dos variables. 
    
    /**
     * Utilice este programa para promediar dos números.
     * Puede utilizar números enteros y decimales.
     * Coloque el primer número en la variable x.
     * Coloque el segundo número en la variable y.
     * Presione aceptar.
     *
     */
     static double sampleMethod(double x, double y)
    {
        // put your code here
        
        return (x + y) / 2;
        

    }
}
