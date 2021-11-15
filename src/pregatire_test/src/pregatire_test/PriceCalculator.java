package pregatire_test;

import java.util.List;

public class PriceCalculator implements Visitor {
    private double phone_price;
    private double charger_price;
    private double headphones_price;
    @Override
    public void visit(Box box) {
        List<Element> contents = box.get_contents();
        for (Element elem : contents) {
            elem.accept(this);
        }
    }

    @Override
    public void visit(Phone phone) {
        phone_price += phone.getPrice();
    }

    @Override
    public void visit(Charger charger) {
        charger_price += charger.getPrice();
    }

    @Override
    public void visit(Headphones headphones) {
        headphones_price += headphones.getPrice();
    }

    public void display_prices() {
        System.out.println("Pretul telefoanelor este: " + phone_price);
        System.out.println("Pretul incarcatoarelor este: " + charger_price);
        System.out.println("Pretul castilor este: " + headphones_price);
    }
}
