package dxc;

public interface Tax {
double calculateTax(double price);

}
class PurchaseDetails implements Tax{
	private String purchaseid;
	private String paymentType;
	private double taxPercentage;
	public PurchaseDetails(String purchaseid,String paymentType) {
		this.purchaseid=purchaseid;
		this.paymentType=paymentType;
	}
	public String getPurchaseid() {
		return purchaseid;
	}
	public void setPurchaseid(String purchaseid) {
		this.purchaseid = purchaseid;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public double getTaxPercentage() {
		return taxPercentage;
	}
	public void setTaxPercentage(double taxPercentage) {
		this.taxPercentage = taxPercentage;
	}
	public double calculateTax(double price) {
		if(this.paymentType.equals("debit Card"))this.taxPercentage=2;
		else if(this.paymentType.equals("Credit Card"))this.taxPercentage=3;
		else this.taxPercentage=4;
		return price+(price*this.taxPercentage/100);
			
	}
	
}
class Seller implements Tax{
	private String location;
	private double taxPercentage;
	public Seller(String location, double taxPercentage) {
		this.location = location;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public double getTaxPercentage() {
		return taxPercentage;
	}
	public void setTaxPercentage(double taxPercentage) {
		this.taxPercentage = taxPercentage;
	}
	public double calculateTax(double price) {
		if (this.location.equals("Canada"))this.taxPercentage=22;
		else if(this.location.equals("Middle Ease"))this.taxPercentage=15;
		else if(this.location.equals("Japan"))this.taxPercentage=12;
		else if(this.location.equals("Europe"))this.taxPercentage=25;
		return price+(price*this.taxPercentage/100);
		
	}
	
}

