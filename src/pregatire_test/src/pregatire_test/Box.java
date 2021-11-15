package pregatire_test;

import java.util.ArrayList;
import java.util.List;

public class Box implements Element {
    private int number_of_elements;
    private List<Element> contents;

    public Box() {
        number_of_elements = 0;
        contents = new ArrayList<>();
    }
/*
    public Box(int number_of_objects, List<Element> contents) {
        this.number_of_elements = number_of_objects;
    }
*/
    public List<Element> get_contents() {
        return this.contents;
    }

    @Override
    public void print() {
        System.out.println("Cutia are " + number_of_elements + " elemente.");
        for (Element elem : contents) {
            elem.print();
        }
    }

    public void add_element(Element element) {
        number_of_elements++;
        this.contents.add(element);
    }

    public void remove_element(Element element) {
        number_of_elements--;
        this.contents.remove(element);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

