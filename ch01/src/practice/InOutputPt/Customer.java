package practice.InOutputPt;

import java.io.Serializable;

public class Customer implements Serializable{
	
	private static final long serialVersionUID = 1003L;
	
	private String name;
	private int price;
	
	public Customer(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return name + ", " + price;
	}
}
