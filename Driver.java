package dxc;

class Driver{
	public int getAverageRating;
	private String driverName;
	private float averageRating;
	public Driver(String driverName, float averageRating) {
	
		this.driverName = driverName;
		this.averageRating = averageRating;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public float getAverageRating() {
		return averageRating;
	}
	public void setAverageRating(float averageRating) {
		this.averageRating = averageRating;
	}	
}