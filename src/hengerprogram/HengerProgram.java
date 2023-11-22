
package hengerprogram;

import java.util.ArrayList;
import java.util.List;

public class HengerProgram {
    private List<Henger> hengerek;
    
    public static void main(String[] args) {
        new HengerProgram();
    }
    
    public HengerProgram() {
        this.hengerek = new ArrayList<Henger>();
    }
    
    public void run() {
        
    }
    
    public double atlagTerfogat() {
        return 0.0;
    }
    
    public double csovekSulya() {
        return 0.0;
    } 
    
    private List<Henger> lista() {
        return this.hengerek;
    }
    
}
