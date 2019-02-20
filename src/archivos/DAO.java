
package archivos;

import java.util.ArrayList;

/**
 *
 * @author kjimenezh
 */

public class DAO { //Base de datos - separado de la interfaz
    private ArrayList<Integer> bd;

    public DAO() {
        this.bd = new ArrayList<>();
    }
    
    public boolean modificar(int value, int pos){
        this.bd.set(pos, value);
        return true;
    }
    
    public ArrayList<Integer> getBd() {
        return bd;
    }
    
    public void AddBd(Integer data){
        this.bd.add(data);
    }

    public void setBd(ArrayList<Integer> bd) {
        this.bd = bd;
    }
 
}
