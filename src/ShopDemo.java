
/*********************************************************************
 * Demoklasse für den Warenkorb.
 * 
 * @author Sven Böhrnsen
 *********************************************************************/
public class ShopDemo {

	public static void main(String[] args) {

		ShoppingCart shopping = new ShoppingCart(); // Erstellt einen neuen Warenkorb.

		// Einfügen von Produkten in einen Warernkorb.
		shopping.addToCart(101, "Apfel", 0.35, 4);
		shopping.addToCart(102, "Bananen", 0.32, 5);
		shopping.addToCart(103, "Milch", 0.95, 4);
		shopping.addToCart(104, "Brot", 1.49, 2);

		shopping.setDiscount(20); // Ein Rabatt von 20% festlegen.

		System.out.println(shopping.toString()); // Ausgabe des Warenkorbs in der Konsole.
	}
}
