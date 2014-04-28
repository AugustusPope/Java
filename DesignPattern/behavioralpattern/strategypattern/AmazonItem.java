package behavioralpattern.strategypattern;

public class AmazonItem {
	private String upcCode;
	private double price;
	
	public AmazonItem(String upc, int cost){
		this.upcCode=upc;
		this.price=cost;
	}
	
	public String getUpcCode() {
		return upcCode;
	}
	public double getPrice() {
		return price;
	}


}
