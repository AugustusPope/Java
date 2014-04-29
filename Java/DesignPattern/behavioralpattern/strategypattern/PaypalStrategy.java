package behavioralpattern.strategypattern;

public class PaypalStrategy implements PaymentStrategy {
	
	private String emailId;
	private String password;
	
	 public PaypalStrategy(String email, String pwd){
		 this.emailId=email;
		 this.password=pwd;
	 }
	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		System.out.println(amount + " paid using Paypal.");

	}

}
