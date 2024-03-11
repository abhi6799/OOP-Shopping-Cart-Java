package edu.neu.csye6200;

import java.text.SimpleDateFormat;  
import java.util.Date;  


public class Item {
	public static final String REVISION = "1.0";
	private double unitPrice;
	private String name;
	private double qty;
	
	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getQty() {
		return qty;
	}

	public void setQty(double qty) {
		this.qty = qty;
	}

	public String toString() {
		return "Name:" + this.name + "\t" + "UnitPrice:$" + this.unitPrice + "\t" + "Quantity:" + this.qty + "\t"  + "TotalPrice:$" + this.qty*this.unitPrice;		
	}
	
	public Item(String name,double unitPrice,double qty) {
		this.name = name;
		this.unitPrice = unitPrice;
		this.qty =  qty;
	}
	public static void demo(Item[] items,double cash) {
		double shoppingBill=0;
		for(int i = 0; i< items.length;i++) {
			shoppingBill=shoppingBill + items[i].qty*items[i].unitPrice;
			System.out.println(items[i].toString());
		}
		System.out.println("Bill Amount: $" + shoppingBill);
		System.out.println("Change: $" + (cash - shoppingBill));
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date = new Date();  
	    System.out.println("Date of Receipt: " + formatter.format(date));
		
		
	}
}