
package faidomprogram.idomok;

public abstract class FaIdom {
    private static final double FAJ_SULY = 0.8;
    
    public FaIdom() {
        
    }
    
    public abstract double terfogat();
    
    public double suly() {
        return this.terfogat() * FaIdom.FAJ_SULY;
    }    

    @Override
    public String toString() {
        return "FaIdom";
    }
    
}
