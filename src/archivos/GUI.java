
package archivos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author kjimenezh
 */
public class GUI {
    public int menu(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Opciones");
        System.out.println("1.Leer");
        System.out.println("2.Guardar");
        System.out.println("3.Cargar");
        System.out.println("4.Listar");
        System.out.println("5.Modificar");
        
        int opcion = teclado.nextInt();
        return opcion;
    }
    
    public void listar(ArrayList<Integer> data){
        System.out.println("------");
        for(Integer value : data){
            System.out.println(value);
        }
    }
}
