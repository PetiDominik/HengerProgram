
package hengerprogram;

import java.util.ArrayList;
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
        for (Henger henger : this.hengerek) {
            System.out.println(henger);
        }
        
        
        String szoveg = "A program futása közben létrejött hengerek száma: %d\n" + 
                        "A hengerek átlag térfogata: %.2f\n" + 
                        "A csövek összsúlya: %.2f\n";
       szoveg = szoveg.formatted(this.lista().size(), this.atlagTerfogat(), this.csovekSulya());
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
        hengerek.add(new Henger(2.0, 1.5));
        hengerek.add(new Henger(3, 2));
        hengerek.add(new TomorHenger(2.0, 1.5));
        hengerek.add(new TomorHenger(2.0, 1, 2));
        hengerek.add(new TomorHenger(5.0, 2, 3));
        hengerek.add(new TomorHenger(4.0, 1));
        hengerek.add(new Cso(2.0, 2.5, 0.5));
        hengerek.add(new Cso(2.5, 1.5, 1.5));
        hengerek.add(new Cso(1.5, 3, 1, 2));
        hengerek.add(new Cso(2.5, 4, 0.2, 3));
        hengerek.add(new Cso(1.0, 2, 0.3));
        
        return hengerek;
    }
    
}
