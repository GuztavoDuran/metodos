
package metodos;
/**
 * @author Gustavo
 */
public class Metodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here       
        firstMethod objeto1 = new firstMethod();
        secondMethod objeto2 = new secondMethod();
        thirdMethod objeto3 = new thirdMethod();
        helloWorld objeto0 = new helloWorld();
        arrays objeto = new arrays();
        
        objeto0.holaMundo();
        
        objeto1.leerDatos();
        objeto1.suma();
        objeto1.resta();
        objeto1.multiplicacion();
        objeto1.mostrarResultados();
        
        objeto2.insertarDatos();
        objeto2.obtenerArea();
        objeto2.mostrarResultado();
        
        objeto3.message();
        objeto3.convertidor();
        
        objeto.inputData();
        objeto.createArray();
        objeto.printArray();
        

    }
    
}
