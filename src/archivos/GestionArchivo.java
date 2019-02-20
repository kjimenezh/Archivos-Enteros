
package archivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author kjimenezh
 */
public class GestionArchivo {
    private String ruta;

    public GestionArchivo(String ruta) {
        this.ruta = ruta;
    }
    
    
    public boolean guardar(ArrayList<Integer> bd) throws FileNotFoundException, IOException{
        //Para crearlo
        File archivo = new File(this.ruta);
        
        if(!archivo.exists()){
            archivo.createNewFile();
        }
            
        PrintStream salida = new PrintStream(archivo);
        
        for(Integer value : bd){
            salida.println(value);
            salida.print("");
        }
        salida.flush();
        salida.close();
        return true;
    }
    
    public ArrayList<Integer> cargar() throws FileNotFoundException{
        ArrayList<Integer> data = new ArrayList<>();
        Scanner lectura = new Scanner(new File(this.ruta));
        
        while(lectura.hasNextInt()){//El Scanner se salta los espacios
            data.add(lectura.nextInt());
        }
        lectura.close();
        return data;
    }
}
