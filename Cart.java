package edu.neu.csye6200;

public class Cart {
	private int myCash;
	private int myTotal;
	private int myChange;

	public Cart(int myCash){
		this.myCash = myCash;
		this.myTotal = 0;
		this.myChange = myCash;
	}
	public int getMyCash() {
		return myCash;
	}
	public void setMyCash(int myCash) {
		this.myCash = myCash;
	}
	public int getMyTotal() {
		return myTotal;
	}
	public void setMyTotal(int myTotal) {
		this.myTotal = myTotal;
	}
	public int getMyChange() {
		return myChange;
	}
	public void setMyChange(int myChange) {
		this.myChange = myChange;
	}
	public double Checkout(Cart myCart, Item myItem) {
		double totalPrice	= myItem.getQty()*myItem.getUnitPrice();
		myCart.myTotal = myCart.myTotal + (int)totalPrice;
		myCart.myChange = myCart.myChange - (int)totalPrice;
		return myCart.myChange;
	}
	
	public static int sillyCheckout(double cash, double price, double total, double change) {
		Cart c = new Cart((int) cash);
		c.setMyTotal((int)total + (int)price);
		c.setMyChange((int)change - (int)price);
		System.out.println(c.toString());
		return c.getMyTotal();
	}
	
	public String toString() {
		return "Cash:" + this.myCash + "\t" + "Total:$" + this.myTotal + "\t" + "Change:" + this.myChange;
	}

}

 