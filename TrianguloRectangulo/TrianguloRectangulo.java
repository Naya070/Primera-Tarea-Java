
/**
 * Este programa posee dos métodos con distintas funciones.
 * El primer método calcula el área de un triángulo rectángulo y el segundo su perímetro.
 * @author (Nayarith Jiménez 2017100188) 
 * @version (1.0 - 17 de junio de 2021)
 */
import java.util.Scanner;
public class TrianguloRectangulo
{
    // instance variables - replace the example below with your own
    public double cateto_a;
    public double cateto_b;
    
    // Dos variables de instancia, que son los catetos
    
    
    /**
     * Constructor for objects of class TrianguloRectangulo
     */
    public TrianguloRectangulo(double cateto_a, double cateto_b)
    {
        // initialise instance variables
         cateto_a = 0;
         cateto_b = 0;
         
         // Este constructor solicita el valor de los catetos
         
    }
    public void Datos() 
    {
        Scanner teclado = new Scanner(System.in);

        System.out.print ("introduzca el cateto a :");
        cateto_a = teclado.nextInt(); 
        
        
        System.out.print ("introduzca el cateto b :");
        cateto_b = teclado.nextInt();
        
        //Esto es para asignarle valores a los catetos
    }
    
    //A continuación los métodos para calcular área y perímetro del triángulo rectángulo.
    
    /**
     * Utilice éste método calcular el área de un triángulo rectángulo.
     * Puede utilizar números enteros y decimales.
     * Coloque el valor del cateto a.
     * Coloque el valor del cateto b.
     * Pulse aceptar.
     */
    public static double área(double cateto_a, double cateto_b)
    {
        // put your code here
        return (cateto_a * cateto_b) / 2 ;
    }
    
    /**
     * Utilice éste método calcular el perímetro de un triángulo rectángulo.
     * Puede usar números enteros y decimales.
     * Coloque el valor del cateto a.
     * Coloque el valor del cateto b.
     * Pulse aceptar.
     */ 
    public static double perímetro(double cateto_a, double cateto_b)
    {
        // put your code here
        
        return cateto_a + cateto_b + Math.sqrt( Math.pow ( cateto_a, 2) + Math.pow ( cateto_b, 2));
    }
}
