package pregatire_test;

/**
 * @author Diana Anton
 *
 */
/**
 *  Avem 2 tipuri de obiecte: box si product, o cutie poate contine alte cutii mai mici, dar si alte produse.
 *  Avem 3 tipuri de produse ce se pot gasi in cutii: phone, charger si headphones. Telefoanele pot avea ca sistem de
 *  operare Android, IOS sau Windows Phone, in functie de sistemul de operare al telefonului, acestea afisaza mesajele
 *  sub urmatoarea forma incepand cu numele sistemului de operare: @Android: mesaj, @IOS: mesaj, @WP: mesaj.
 *  Constructorul produselor primeste ca parametru pretul fiecarui produs precum si numele acestuia. Construiti
 *  structura necesara pentru a putea adauga boxes si products, dar si pentru a putea afisa in consola numele  si pretul
 *  (produselor). Setati sistemul de operare al fiecarui telefon si afisati mesajele in consola. Sistemul de operare va
 *  fi setat din main. Implementati asupra structurii un set de operatii care calculeaza pretul total al produselor din
 *  fiecare categorie. Operatia se  va face din main. Ex: 3 telefoane cu urmatoarele preturi: 100,150, 300 => pret total
 *  pe categoria telefoanelor 550, se va calcula la fel pentru charger si headphones.
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Box box1 = new Box();
		Box box2 = new Box();
		Phone phone1 = new Phone("samsung", 500, 2400);
		Phone phone2 = new Phone("nokia", 700, 3400);
		Phone phone3 = new Phone("iphone", 1500, 3400);
		phone1.set_os(new Android());
		phone2.set_os(new WindowsPhone());
		box2.add_element(new Headphones("skullcandy", 240, "wireless"));
		box1.add_element(box2);
		box1.add_element(phone1);
		box1.add_element(phone2);
		box1.add_element(phone3);
		box1.add_element(new Charger("apple", 60.42, 25));

		box1.print();

		System.out.println("-----------------------------------------------------------------------------------------");

		PriceCalculator priceCalculator = new PriceCalculator();
		box1.accept(priceCalculator);

		priceCalculator.display_prices();

	}

}
