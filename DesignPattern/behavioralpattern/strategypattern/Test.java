package behavioralpattern.strategypattern;

public class Test {
	public static void main(String[] args){
		behavioralpattern.strategypattern.ShoppingCart cart = new behavioralpattern.strategypattern.ShoppingCart();
		behavioralpattern.strategypattern.AmazonItem item1 = new behavioralpattern.strategypattern.AmazonItem ("1234",10);
		behavioralpattern.strategypattern.AmazonItem  item2 = new behavioralpattern.strategypattern.AmazonItem("5678",40);
		cart.addItem(item1);
		cart.addItem(item2);
		//pay by paypal
		cart.pay(new behavioralpattern.strategypattern.PaypalStrategy("myemail@example.com", "mypwd"));
		//pay by credit card
		cart.pay(new behavioralpattern.strategypattern.CreditCardStrategy("FirstName, LastName", "1234567890123456", "786", "12/15"));

	}

}
