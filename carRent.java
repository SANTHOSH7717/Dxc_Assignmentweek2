package dxc;

public class carRent {

	public static void main(String[] args) {
		
		CabServiceProvider cab = new CabServiceProvider("Halo", 50);
		Driver driver1 = new Driver("Luke", 4.8f);
		Driver driver2 = new Driver("Mark", 4.2f);
		Driver driver3 = new Driver("David", 3.9f);
		
		Driver[] drivers= {driver1,driver2,driver3};
		for(Driver driverss : drivers) {
			System.out.println("Driver Name: "+driverss.getDriverName());	
			double Bonus = cab.calculateRewardsPrice(driverss);
			{
				if(Bonus>0)
					System.out.println("Bonus: "+"$"+Bonus+"\n");
				else {
					System.out.println("sorry,bonus is not available!");
				}
			}
		}
		
		
	}

}