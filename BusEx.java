package Ex;

class BusBooking{
	private int bookingId;
	private String destination;
	private String tripPackage;
	private double totalAmount;
	public BusBooking(int bookingId, String destination, String tripPackage) {
	
		this.bookingId = bookingId;
		this.destination = destination;
		this.tripPackage = tripPackage;
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getTripPackage() {
		return tripPackage;
	}
	public void setTripPackage(String tripPackage) {
		this.tripPackage = tripPackage;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
boolean validateCouponCode(String couponCode, int numberOfMembers) throws InavlidCouponCodeException {
		if((couponCode.equals("BIGBUS") && numberOfMembers >=10) || (couponCode.equals("MAGICBUS") && numberOfMembers >=15) )
			return true;
		else
		throw new InavlidCouponCodeException("Invalid coupon");
		
	
}
String bookTrip(String couponCode, int numberOfMembers ) throws InvalidDestinationException, InvalidTripPackageException, InavlidCouponCodeException {
	if(!(destination.equalsIgnoreCase("washington DC") || destination.equalsIgnoreCase("philadelphia") || destination.equalsIgnoreCase("orlando")
				|| destination.equalsIgnoreCase("Boston") || destination.equalsIgnoreCase("Atlanta"))) {
		throw new InvalidDestinationException("Invalid destination");
		
	}
	if(!(tripPackage.equalsIgnoreCase("Regular")|| tripPackage.equalsIgnoreCase("Premimum") )) {
		throw new InvalidTripPackageException("Invalid package");
	}
	if((validateCouponCode(couponCode, numberOfMembers))) {
		if(tripPackage.equalsIgnoreCase("Regular")) {
			totalAmount = 500*numberOfMembers;
			return "Booking successful";
		}
		else if(tripPackage.equalsIgnoreCase("Premium")) {
			totalAmount = 800*numberOfMembers;
			return "Booking successful";
		}else
			throw new InvalidTripPackageException("Invalid Package");
	}
	
	return "Booking not successful";
		
	}
		
}

class InavlidCouponCodeException extends Exception{
	 InavlidCouponCodeException(String message){
	 super(message);
	 }
}
class InvalidDestinationException extends Exception{
	InvalidDestinationException(String message){
	super(message);
	}
}
class InvalidTripPackageException extends Exception{
	InvalidTripPackageException(String message) {
		super(message);
	}
}


public class BusEx {

	public static void main(String[] args) {
		
		try {
		BusBooking booking = new BusBooking(101,"Orlando", "regular");
		String result = booking.bookTrip("BIGBUS", 11);
		if(result.equals("Booking successful")){
		System.out.println(result);
		System.out.println("Total amount for the trip: " + booking.getTotalAmount());
		}
		else{
			
			System.out.println(result);
			System.out.println("Your booking was not successful, please try again!");
		
		}
		
	}catch (InavlidCouponCodeException|InvalidDestinationException|InvalidTripPackageException e) {
        System.out.println(e.getMessage());
    }
	}
}