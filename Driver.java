package edu.neu.csye6200;

/**
 * 
 * @author Ruchika Sharma
 * 
 */

public class Driver {
	public static void main(String[] args) {
		System.out.println("============Main Execution Start===================\n\n");         
         Item[] items = new Item[3];
         items[0] = new Item("Milk",5,1);
         items[1] = new Item("Olives",7,1);
         items[2] = new Item("Onion",3,2);
		 //Item.demo(items,20);
		 
         Cart myCart = new Cart(20);
         myCart.Checkout(myCart,items[0]);
         System.out.println(myCart.toString());
         myCart.Checkout(myCart,items[1]);
         System.out.println(myCart.toString());
         myCart.Checkout(myCart,items[2]);
         System.out.println(myCart.toString());
         
         double cash = 20;
         double total = 0;
         total = Cart.sillyCheckout(cash, items[0].getUnitPrice()*items[0].getQty(), total, cash);
         total = Cart.sillyCheckout(cash, items[1].getUnitPrice()*items[1].getQty(), total, cash-total);
         total = Cart.sillyCheckout(cash, items[2].getUnitPrice()*items[2].getQty(), total, cash-total);
		 
		//System.out.println("\n\n============Main Execution End===================");
	}

}
