
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
        double sugar = this.getSugar();
        Henger belso = new Henger(sugar - this.falVastagsag, this.getMagassag());
        Henger.decreaseHengerDarab();
        
        return super.terfogat() - belso.terfogat();
    }  
    
    @Override
    public String toString() {
        String s = super.toString();
        return s + "\n\t\tCso{" + "falVastagsag=" + falVastagsag + '}';
    }
    
    
}
