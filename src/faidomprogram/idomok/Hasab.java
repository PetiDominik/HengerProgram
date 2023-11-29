
package faidomprogram.idomok;

public class Hasab extends FaIdom{
    private double a, b, magassag;
    
    public Hasab(double a, double b, double magassag) {
        this.setA(a);
        this.setB(b);
        this.setMagassag(magassag);
    }
    
    public double terfogat() {
        return this.a * this.b * this.magassag;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getMagassag() {
        return magassag;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setMagassag(double magassag) {
        this.magassag = magassag;
    }

    @Override
    public String toString() {
        return super.toString() + "<---Hasab{" + "a=" + a + ", b=" + b + ", magassag=" + magassag + '}';
    }
    
    
}
