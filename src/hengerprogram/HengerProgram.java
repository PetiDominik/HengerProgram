
package hengerprogram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HengerProgram {
    private List<Henger> hengerek;
    
    public static void main(String[] args) {
        new HengerProgram();
    }
    
    public HengerProgram() {
        this.hengerek = this.lista();
        this.run();
    }
    
    public void run() {
        System.out.println("A programban szereplő hengerek adatai:");
        for (Henger henger : this.hengerek) {
            System.out.println(henger);
        }
        
        
        String szoveg = "A program futása közben létrejött hengerek száma: %d\n" + 
                        "A hengerek átlag térfogata: %.2f\n" + 
                        "A csövek összsúlya: %.2f\n";
       szoveg = szoveg.formatted(Henger.getHengerDarab(), this.atlagTerfogat(), this.csovekSulya());
        System.out.println(szoveg);
    }
    
    public double atlagTerfogat() {
        double osszeg = 0.0;
        
        for (Henger henger : this.hengerek) {
            osszeg += henger.terfogat();
        }
        
        return osszeg / this.hengerek.size();
    }
    
    public double csovekSulya() {
        double osszSuly = 0.0;
        
        for (Henger henger : this.hengerek) {
            if (henger instanceof Cso) {
                osszSuly += ((Cso) henger).suly();
            }
        }
        
        return osszSuly;
    } 
    
    private List<Henger> lista() {
        List<Henger> hengerek = new ArrayList<Henger>();
        hengerek.add(new Henger(1, 1));
        hengerek.add(new TomorHenger(1, 1));
        hengerek.add(new Cso(1, 1, 0.5));
        hengerek.add(new Cso(1, 1, 0.1));
        
        return Collections.unmodifiableList(hengerek);
    }
    
}
