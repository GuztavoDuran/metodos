
package metodos;
import java.util.Scanner;
/**
 * @author Gustavo
 */
public class firstMethod {
    Scanner enter = new Scanner(System.in);
    //Atributos
    public int suma;
    public int resta;
    public int multiplicacion;
    public int numero1;
    public int numero2; 
    //Metodos   
    
    public void leerDatos(){
        System.out.print("Inserte el primer numero: ");
        numero1 = enter.nextInt();
        System.out.print("Inserte el segundo numero: ");
        numero2 =  enter.nextInt();
    }
        
    public void suma(){
        suma = numero1 + numero2;
    }
    
    public void resta(){
        resta = numero1 - numero2;
    }
    
    public void multiplicacion(){
        multiplicacion = numero1 * numero2;
    }
    public void mostrarResultados(){
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: "+ multiplicacion);
    }
}
