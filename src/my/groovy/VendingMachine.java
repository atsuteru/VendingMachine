package my.groovy;

import java.util.HashSet;
import java.util.Set;

public class VendingMachine {
	
	private int totalAmount;

	public int getTotalAmount() {
		return totalAmount;
	}
	
	public int insert(int amount) {
		if(! isInsertableMoney(amount)) {
			return amount;
		}
		totalAmount += amount;
		return 0;
	}

	protected boolean isInsertableMoney(int amount) {
		return getMoneySet().contains(amount);
	}
	
	Set<Integer> moneySet;
	protected Set<Integer> getMoneySet() {
		if (null == moneySet) {
			moneySet = new HashSet<Integer>();
			moneySet.add(10);
			moneySet.add(50);
			moneySet.add(100);
			moneySet.add(500);
			moneySet.add(1000);
		}
		return moneySet;
	}
	
	public int payBack() {
		int payBackAmount = totalAmount;
		totalAmount = 0;
		return payBackAmount;
	}
	
	

}
