package pregatire_test;

public class Charger extends Product {
    private int voltaj;

    public Charger(String name, double price, int voltaj) {
        super(name, price);
        this.voltaj = voltaj;
    }

    public int getVoltaj() {
        return voltaj;
    }

    public void setVoltaj(int voltaj) {
        this.voltaj = voltaj;
    }

    @Override
    public void print() {
        System.out.println("Nume: " + this.getName() + "\nPret: " + getPrice() + "\nVoltaj: " + this.getVoltaj());
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
