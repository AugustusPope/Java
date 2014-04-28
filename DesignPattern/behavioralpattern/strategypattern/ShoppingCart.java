package behavioralpattern.strategypattern;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	
	//List of items
    List<AmazonItem> items;
    public ShoppingCart(){
    	this.items=new ArrayList<AmazonItem>();
    }
    public void addItem(AmazonItem item){
    	this.items.add(item);
    }
    public void removeItem(AmazonItem item){
    	this.items.remove(item);
    }
    public double calculateTotal(){
    	int sum = 0;
    	for(AmazonItem item : items){
    		sum += item.getPrice();
    	}
    	return sum;
    }
    public void pay(PaymentStrategy paymentMethod){
    	double amount = calculateTotal();
    	paymentMethod.pay(amount);
    }


}
