
package hengerprogram;

public class TomorHenger extends Henger {
    private double fajSuly;
    
    public TomorHenger(double sugar, double magassag) {
        this(sugar, magassag, 1);
    }
    
    public TomorHenger(double sugar, double magassag, double fajSuly) {
        super(sugar, magassag);
        this.fajSuly = fajSuly;
    }

    public double getFajSuly() {
        return fajSuly;
    }
    
    public double suly() {
        return 0.0;
    }

    @Override
    public String toString() {
        String s = super.toString();
        return s + "\n\tTomorHenger{" + "fajSuly=" + fajSuly + '}';
    }
    
}
