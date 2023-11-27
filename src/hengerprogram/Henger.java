
package hengerprogram;

public class Henger {
    private static int hengerDarab;
    private double sugar, magassag;
    
    public Henger(double sugar, double magassag) {
        this.sugar =  sugar;
        this.magassag = magassag;
    }

    public static int getHengerDarab() {
        return hengerDarab;
    }

    public double getSugar() {
        return sugar;
    }

    public double getMagassag() {
        return magassag;
    }
    
    public double terfogat() {
        return (Math.PI * (this.sugar * this.sugar)) * this.magassag;
    }

    @Override
    public String toString() {
        return "Henger{" + "sugar=" + sugar + ", magassag=" + magassag + '}';
    }
    
}
