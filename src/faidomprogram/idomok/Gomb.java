
package faidomprogram.idomok;

public class Gomb extends FaIdom{
    private double sugar;
    
    public Gomb(double sugar) {
        this.setSugar(sugar);
    }
    
    public double terfogat() {
        return (4 * Math.pow(this.sugar, 3) * Math.PI) / 3;
    }

    public double getSugar() {
        return sugar;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

    @Override
    public String toString() {
        return super.toString() + "<---Gomb{" + "sugar=" + sugar + '}';
    }
}
