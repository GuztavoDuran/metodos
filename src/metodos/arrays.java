
package metodos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class arrays {
    Scanner inputSystem = new Scanner (System.in);
    public int total;

    public void inputData(){
        System.out.println("Inserta el total de datos del arreglo: ");
        total = inputSystem.nextInt();
    }
    public int [] arreglo = new int [total];

    public void createArray(){
        for(int i=0; i<total; i++){
            System.out.println("Insert number: ");
            arreglo [i] = inputSystem.nextInt();
        }
    }
    
    public void printArray(){
        for(int i=0; i<total; i++){
            System.out.println("["+arreglo[i]+"]");
        }
    }
}
