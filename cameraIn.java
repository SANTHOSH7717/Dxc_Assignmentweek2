package Ex;
class Camera{
	private String brand;
	private double cost;
	
	public Camera() {
	
		this.brand ="Nikon";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
}
class DigitalCamera extends Camera{
	private int memory;

	public DigitalCamera(String brand, double cost) {
		
		this.memory = 16;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}
	
	
}
public class cameraIn {

	public static void main(String[] args) {
		DigitalCamera dc = new DigitalCamera("Canon",100);
		
		System.out.println(dc.getBrand()+" "+ dc.getCost()+" "+dc.getMemory());

	}

}