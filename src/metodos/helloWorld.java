
package metodos;
import java.util.Scanner;
/**
 * @author Gustavo
 */
public class helloWorld {
    Scanner in = new Scanner(System.in);
    public String name;
    public void holaMundo(){
        System.out.print("Inserta tu nombre: ");
        name = in.nextLine();
        System.out.println("Bienvenido " +  name);
    }
    //metodo para introducir los datos
    
}
