
package faidomprogram.main;

import faidomprogram.idomok.FaIdom;
import faidomprogram.idomok.Gomb;
import faidomprogram.idomok.Hasab;
import java.util.ArrayList;
import java.util.List;

public class Faidomok {
    private List<FaIdom> idomok;
    
    public static void main(String[] args) {
        new Faidomok();
    }
    
    public Faidomok() {
        this.idomok = new ArrayList<FaIdom>();
        this.run();
    }
    
    public void run() {
        this.idomok.add(new Gomb(2));
        this.idomok.add(new Gomb(3));
        this.idomok.add(new Gomb(5.5));
        this.idomok.add(new Hasab(2, 3, 4));
        this.idomok.add(new Hasab(5, 5.5, 10));
        this.idomok.add(new Hasab(2.2, 1, 0.5));
        
        System.out.println("A programban létrejött fa idomok:");
        for (FaIdom faIdom : idomok) {
            System.out.println(faIdom);
        }
        
        System.out.printf("\nÖsszsúlyuk: %.2f\n", this.OsszSuly());
        
        System.out.printf("Gömbök összsúlya: %.2f\n", this.osszGombSuly());
        
        FaIdom min = this.minV();
        FaIdom max = this.maxV();
        System.out.printf("Legkisebb FaIdom: %s, típusa: %s\n", min, min.getClass().getSimpleName());
        System.out.printf("Legnagyobb FaIdom: %s, típusa: %s\n", max, max.getClass().getSimpleName());
    }
    
    public double OsszSuly() {
        double osszsuly = 0;
        
        for (FaIdom faIdom : idomok) {
            osszsuly += faIdom.suly();
        }
        
        return osszsuly;
    }
    
    public double osszGombSuly() {
        double osszsuly = 0;
        
        for (FaIdom faIdom : idomok) {
            if (faIdom instanceof Gomb) {
                osszsuly += faIdom.suly();
            }
        }
        
        return osszsuly;
    }
    
    public FaIdom minV() {
        FaIdom min = this.idomok.get(0);
        
        for (int i = 0; i < this.idomok.size(); i++) {
            FaIdom idom = this.idomok.get(i);
            
            if (min.terfogat() > idom.terfogat()) {
                min = idom;
            }
        }
        
        return min;
    }
    
    public FaIdom maxV() {
        FaIdom max = this.idomok.get(0);
        
        for (int i = 0; i < this.idomok.size(); i++) {
            FaIdom idom = this.idomok.get(i);
            
            if (max.terfogat() < idom.terfogat()) {
                max = idom;
            }
        }
        
        return max;
    }
    
}
