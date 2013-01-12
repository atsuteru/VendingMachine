package my.groovy;

public class DrinkInfo {

	private int stock = 5;
	public int getStock() {
		return stock;
	}

	public String getName() {
		return "ÉRÅ[Éâ";
	}
	
	public int getPrice() {
		return 120;
	}
	
	public void decrementStock() {
		if (stock == 0) {
			throw new UnsupportedOperationException();
		}
		stock--;
	}
}
