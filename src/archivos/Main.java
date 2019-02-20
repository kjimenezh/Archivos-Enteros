
package archivos;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kjimenezh
 */
public class Main {//Divir las clase por carpetas. ORGANIZAR INFORMACION
    
    public static void main(String[] args) throws IOException{
        
        System.out.println("Gestion de Enteros");
        Scanner lectura = new Scanner(System.in);
        GUI gui = new GUI();
        DAO base = new DAO();
        GestionArchivo archivos = new GestionArchivo("enteros.txt");
        int opcion=0;
        int value = 0;
        while(true){
            opcion = gui.menu();
            switch(opcion){
                case 1:
                    System.out.println("Ingrese dato");
                    value = lectura.nextInt();
                    base.AddBd(value);
                    break;
                case 2:
                    System.out.println("Guardando...");
                    try{
                        archivos.guardar(base.getBd());
                    }catch(IOException e){
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE,null,e);
                    }
                        
                    break;
                case 3:
                    System.out.println("Cargando archivo...");
                    ArrayList<Integer> informacion = new ArrayList<>();
                    try{
                        informacion=archivos.cargar();
                    }catch(FileNotFoundException e){
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE,null,e);
                    }
                    base.setBd(informacion);
                    break;
                case 4:
                    System.out.println("Lista");
                    gui.listar(base.getBd());
                    break;
                case 5:
                    System.out.println("Ingrese posicion");
                    int pos = lectura.nextInt();
                    System.out.println("Ingrese valor");
                    int valor = lectura.nextInt();
                    
                    if(base.modificar(valor, pos)){
                        System.out.println("Proceso realizado");
                    }else{
                        System.out.println("Ocurrio un error");
                    }
                    break;
            }
        }
        
    } 
}
