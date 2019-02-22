
package metodos;
import java.util.Scanner;
/**
 * @author Gustavo
 */
public class secondMethod {
    Scanner enter =  new Scanner(System.in);
    public int basemayor;
    public int altura;
    public int basemenor;
    public float area;
    
    public void mensaje(){
        System.out.println("AREA DEL TRAPECIO ");
    }
    public void insertarDatos(){
        System.out.println("inserta la base mayor: ");
        basemayor = enter.nextInt();
        System.out.println("Inserte la base menor: ");
        basemenor = enter.nextInt();
        System.out.println("inserte la altura: ");
        altura = enter.nextInt();
    }
    public void obtenerArea(){
        area = ((basemayor - basemenor) / altura)*2;
    }
    public void mostrarResultado(){
        System.out.println("Area = "  + area);
    }
}
