package Ex;

public class webVal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String webAddress = "http://www.company.in";
		 System.out.println("The web address is "+ (checkWebAddressValidity(webAddress) ? "valid!" :
				 "invalid!"));

	}

	public static boolean checkWebAddressValidity(String webAddress) {
		String regex = "(https?)://(www.)?.?(\\w+).(\\w+)/?(com|org|net)";
		if(webAddress.matches(regex))
			return true;
		return false;
	}
}
