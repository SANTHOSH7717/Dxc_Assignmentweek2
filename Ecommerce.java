package Ex;
abstract class Payment{
	private int customerId;
	private String paymentId;
	private double serviceTaxPercentage;
	
	public Payment(int customerId) {
		
		this.customerId = customerId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getPaymentId() {
		return "D";
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

	public double getServiceTaxPercentage() {
		return serviceTaxPercentage;
	}

	public void setServiceTaxPercentage(double serviceTaxPercentage) {
		this.serviceTaxPercentage = serviceTaxPercentage;
	}
	abstract double payBill(double amount);
	
}
class DebitCardPayment extends Payment{
	
	static int counter;
	private double discountPercentage;
	
	public DebitCardPayment(int customerId) {
		super(customerId);
		// TODO Auto-generated constructor stub
	}

	public int getCounter() {
		return ++counter;
	}
//	static {
//		++counter;
//	}
	public void setCounter(int counter) {
		DebitCardPayment.counter = counter;
	}

	public double getDiscountPercentage() {
		
		
		return discountPercentage;
	}

	public void setDiscountPercentage(double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}

	@Override
	double payBill(double amount) {
		// TODO Auto-generated method stub
		if(amount <=500) {
			this.discountPercentage=1;
			this.setServiceTaxPercentage(2.5);
			return amount+(amount*2.5)/100-(amount*discountPercentage)/100;
		}
		if(amount>500 && amount<=1000) {
			this.discountPercentage=2;
			this.setServiceTaxPercentage(4);
			return amount+(amount*4)/100-(amount*discountPercentage)/100;
		}
		this.discountPercentage=3;
		this.setServiceTaxPercentage(5);
		return amount+(amount*5)/100-(amount*discountPercentage)/100;
		
	}
}

class CreditCardPayment extends Payment{
	private static int counter;

	public CreditCardPayment(int customerId) {
		super(customerId);
		// TODO Auto-generated constructor stub
	}
	
	public int getCounter() {
		return ++counter;
	}

	public void setCounter(int counter) {
		CreditCardPayment.counter = counter;
	}

	@Override
	double payBill(double amount) {
		// TODO Auto-generated method stub
		if(amount <=500) {
			super.setServiceTaxPercentage(3.0);
			return amount+(amount*getServiceTaxPercentage())/100;
		}
		else if(amount>500 && amount<=1000) {
			super.setServiceTaxPercentage(5.0);
			return amount+(amount*getServiceTaxPercentage())/100;
		}else if(amount>1000 ) {
			super.setServiceTaxPercentage(6.0);
		return amount+(amount*getServiceTaxPercentage())/100;
		}
		return amount;
		
	}
	
	
}
public class Ecommerce {

	public static void main(String[] args) {
		
		DebitCardPayment dc = new DebitCardPayment(101);
		dc.setCounter(1000);
		double billAmount = dc.payBill(500);
		System.out.println("Customer Id: "+dc.getCustomerId());
		System.out.println("Payment Id: "+ dc.getPaymentId()+dc.getCounter());
		System.out.println("Service tax percentage: "+dc.getServiceTaxPercentage());
		System.out.println("Discount percentage: "+dc.getDiscountPercentage());
		System.out.println("Total bill amount: "+billAmount);
		System.out.println();
		
		CreditCardPayment cc = new CreditCardPayment(102);
		
		cc.setCounter(1000);
		cc.setPaymentId("C");
		System.out.println("Customer Id: "+cc.getCustomerId());
		System.out.println("Payment Id: "+cc.getPaymentId()+cc.getCounter());
		System.out.println("Service tax percentage: "+cc.getServiceTaxPercentage());
		System.out.println("Total bill amount: "+cc.payBill(1000));
		

	}

}