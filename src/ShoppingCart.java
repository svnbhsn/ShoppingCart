import java.text.DecimalFormat;

/*********************************************************************
 * Die Warenkorbklasse. Basierend auf Array Ebene, um einen
 * 
 * @author Sven Böhrnsen
 *********************************************************************/
public class ShoppingCart {

	private double totalPrice; // Die Entsumme
	private int itemCount; // Die Menge aller Produkte im Korb
	private int maxAmount; // Max. Anzahl von unterschiedlichen Produkte im Warenkorb
	private int discount; // Rabattwert
	private Product[] cart; // Erstellt ein neuen Array für die Produkte

	/*********************************************************************
	 * Konstruktor, um ein neuen Warenkorb zu erstellen.
	 *********************************************************************/
	public ShoppingCart() {
		totalPrice = 0.0;
		itemCount = 0;
		maxAmount = 10;
		discount = 0;
		cart = new Product[maxAmount];
	}

	/*********************************************************************
	 * Fügt ein Produkt in den Warenkorb hinzu.
	 *
	 * @param ItemID       Interne ID eines Produktes
	 * @param itemName     Name des Produktes
	 * @param itemPrice    Preis eines Produktes
	 * @param itemQuantity Gewünschte Menge von einem Produkt
	 *********************************************************************/
	public void addToCart(int ItemID, String itemName, double itemPrice, int itemQuantity) {

		// Überprüft, ob die maximale Anzahl an Produkten im Warenkorb erreicht worden
		// ist.
		if (itemCount < maxAmount) {
			// Fügt ein neues Produkt in das Array hinzu.
			cart[itemCount] = new Product(ItemID, itemName, itemPrice, itemQuantity);
			// Erhöht die Enstumme um den Preis des neuen Produktes.
			totalPrice += (itemPrice * itemQuantity);

			itemCount++; // Erhöht den die Menge der Produkte im Warenkorb
		} else {
			System.out.println("Maximale Anzahl an unterschiedlichen Produkten von " + maxAmount + " erreicht!");
		}

	}

	/*********************************************************************
	 * setzt einen prozentualen Preisnachlass fest.
	 *
	 * @param Prozentwert
	 *********************************************************************/
	public void setDiscount(int discountValue) {
		this.discount = discountValue;
	}

	/*********************************************************************
	 * Gibt die Entsumme eines Warenkorbs ohne Rabatt aus.
	 *
	 * @return die Entsumme
	 *********************************************************************/
	public double getTotalPrice() {
		return totalPrice;
	}

	/*********************************************************************
	 * Formatiert Double Variablen auf eine zweistellige Ziffer nach dem Komma.
	 *
	 * @param i Der übergebende Double Wert
	 * @return Double Variablen mit zwei Stellen nach dem Komma.
	 *********************************************************************/
	public static String format(double i) {
		DecimalFormat f = new DecimalFormat("#0.00");
		double toFormat = ((double) Math.round(i * 100)) / 100;
		return f.format(toFormat);
	}

	public String toString() {
		String output = "------------------------------------------------------- \n";
		output += "Menge \t" + "Produkt \t" + "Einzelpreis \t\n";

		try {
			for (int i = 0; i < cart.length; i++) {
				output += cart[i].toString();
				output += "\n";
			}
		} catch (Exception e) {
			System.out.println(
					"Hinweis: Der Warenkorb ist auf maximal " + maxAmount + " unterschiedlichen Produkten begrenzt!");
		}
		output += "------------------------------------------------------- \n";
		output += "Zwischensumme: " + format(totalPrice) + "€ \n";
		output += "Rabatt: " + discount + "% \n";
		// Berechnung der Endsumme mit einem prozentualen Rabatt
		output += "Endsumme: " + format(totalPrice * (100 - discount) / 100) + "€ \n";
		return output;
	}
}
