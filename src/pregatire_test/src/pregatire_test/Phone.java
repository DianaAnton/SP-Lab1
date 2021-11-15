package pregatire_test;

public class Phone extends Product {
    private int battery;
    private OperatingSystem os;

    public Phone(String name, double price, int battery) {
        super(name, price);
        this.battery = battery;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public OperatingSystem getOs() {
        return os;
    }

    public void set_os(OperatingSystem os) {
        this.os = os;
    }

    @Override
    public void print() {
        System.out.println("Nume: " + this.getName() + "\n Pret: " + this.getPrice() + "\nBaterie: "
                + this.getBattery());
        if (this.os != null) {
            System.out.println("Mesajele vor incepe cu: " + this.os.print_message());
        }
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
