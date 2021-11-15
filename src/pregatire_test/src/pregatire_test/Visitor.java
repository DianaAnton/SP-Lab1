package pregatire_test;

public interface Visitor {
    void visit(Box box);
    void visit(Phone phone);
    void visit(Charger charger);
    void visit(Headphones headphones);
}
