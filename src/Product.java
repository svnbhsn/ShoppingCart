
/*********************************************************************
 * Definiert die Eigenschaften von einem Produkt.
 * 
 * @author Sven Böhrnsen
 *********************************************************************/
public class Product {

	private int id;
	private String name;
	private double price;
	private int quantity;

	/*********************************************************************
	 * Konstruktor, um ein neues Produkt zu erstellen.
	 * 
	 * @param id       ID eines Produktes
	 * @param name     Name eines Produktes
	 * @param price    Preis eines Produktes
	 * @param quantity Menge eines Produktes
	 *********************************************************************/
	public Product(int id, String name, double price, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	/*********************************************************************
	 * @return Die ID eines Produktes
	 *********************************************************************/
	public int getId() {
		return id;
	}

	/*********************************************************************
	 * @return Den Namen eines Produktes
	 *********************************************************************/
	public String getName() {
		return name;
	}

	/*********************************************************************
	 * @return Den Preis eines Produktes
	 *********************************************************************/
	public double getPrice() {
		return price;
	}

	/*********************************************************************
	 * @return Die Menge eines Produktes
	 *********************************************************************/
	public int getQuantity() {
		return quantity;
	}

	public String toString() {

		return quantity + "x \t" + name + "\t\t" + price + "€ \t";
	}

}
