package Ex;
public class passwordAss {
	public static void main(String[] args) {
		String password = "P@sswor$d";
		System.out.println("The password of the customer is "+password);
		if(isValidPassword(password)) 
			System.out.println("The password is valid!");
			else
				System.out.println("The password is valid!");

		

	}

	private static boolean isValidPassword(String password) {
		String regex = "[a-z]{1,}[A-Z]{1,}[0-9]{1,}[!@#$%&*_]{1,}.{7,19}$";
		if(password.matches(regex)) 
			return true;
		
		return false;
	}
	}