package dxc;

class CabServiceProvider{
	private String cabServiceName;
	private int totalCab;
	public CabServiceProvider(String cabServiceName, int totalCab) {
		
		this.cabServiceName = cabServiceName;
		this.totalCab = totalCab;
	}
	public double calculateRewardsPrice(Driver driver) {
	
		if(driver.getAverageRating() >=4.5f && driver.getAverageRating<=5f) {
			return 10*driver.getAverageRating();
		}else if(driver.getAverageRating() >=4f && driver.getAverageRating()<4.5f) {
			return 5*driver.getAverageRating();
		}else
			return 0.0;
	}
	public String getCabServiceName() {
		return cabServiceName;
	}
	public void setCabServiceName(String cabServiceName) {
		this.cabServiceName = cabServiceName;
	}
	public int getTotalCab() {
		return totalCab;
	}
	public void setTotalCab(int totalCab) {
		this.totalCab = totalCab;
	}
	
}

