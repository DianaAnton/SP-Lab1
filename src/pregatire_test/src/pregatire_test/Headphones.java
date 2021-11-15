package pregatire_test;

public class Headphones extends Product {
    private String type;

    public Headphones(String name, double price, String type) {
        super(name, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void print() {
        System.out.println("Nume: " + this.getName() + "\nPret: " + this.getPrice() + "\nTip: " + this.getType());
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
