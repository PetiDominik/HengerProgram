
package hengerprogram;

public class Cso extends TomorHenger {
    private double falVastagsag;

    public Cso( double sugar, double magassag, double falVastagsag) {
        super(sugar, magassag);
        this.falVastagsag = falVastagsag;
    }

    public Cso(double sugar, double magassag, double fajSuly, double falVastagsag) {
        super(sugar, magassag, fajSuly);
        this.falVastagsag = falVastagsag;
    }

    public double getFalVastagsag() {
        return falVastagsag;
    }

    @Override
    public double terfogat() {
        return 1.0;
    }

    @Override
    public String toString() {
        String s = super.toString();
        return s + "\n\tCso{" + "falVastagsag=" + falVastagsag + '}';
    }
    
    
}
