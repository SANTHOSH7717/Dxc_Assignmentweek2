package Ex;


interface Testable{
	boolean testCompatibility();
}

class Mobile{
	private String name;
	private String brand;
	private String operatingSystem;
	private String operatingSystemVersion;

	public Mobile(String name, String brand, String operatingSystem, String operatingSystemVersion) {
	
		this.name = name;
		this.brand = brand;
		this.operatingSystem = operatingSystem;
		this.operatingSystemVersion = operatingSystemVersion;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public String getOperatingSystemVersion() {
		return operatingSystemVersion;
	}

	public void setOperatingSystemVersion(String operatingSystemVersion) {
		this.operatingSystemVersion = operatingSystemVersion;
	}
	
	
}

class SmartPhone extends Mobile implements Testable {

	private String networkGeneration;

	public SmartPhone(String name, String brand, String operatingSystem, String operatingSystemVersion,
			String networkGeneration) {
		super(name, brand, operatingSystem, operatingSystemVersion);
		this.networkGeneration = networkGeneration;
	}

	public String getNetworkGeneration() {
		return networkGeneration;
	}

	public void setNetworkGeneration(String networkGeneration) {
		this.networkGeneration = networkGeneration;
	}

	@Override
	public boolean testCompatibility() {
		if (getOperatingSystem() == "Saturn") {
			if (getNetworkGeneration() == "3G") {
				if (super.getOperatingSystemVersion().equals("1.1") || super.getOperatingSystemVersion().equals("1.2")
						|| super.getOperatingSystemVersion().equals("1.3")) {
					return true;
				}
			} else if (getNetworkGeneration() == "4G") {
				if (super.getOperatingSystemVersion().equals("1.2") || super.getOperatingSystemVersion().equals("1.3"))
					return true;

			} else if (getNetworkGeneration() == "5G") {
				if (super.getOperatingSystemVersion().equals("1.3")) {
					return true;
				}
			} else {
				return false;
			}
		} else {
			if (getOperatingSystem() == "Garun") {
				if (getNetworkGeneration() == "3G") {
					if (super.getOperatingSystemVersion().equals("EXRT.1")
							|| super.getOperatingSystemVersion().equals("EXRT.2")
							|| super.getOperatingSystemVersion().equals("EXRU.1")) {
						return true;
					}
				} else if (getNetworkGeneration() == "4G") {
					if (super.getOperatingSystemVersion().equals("EXRT.2")
							|| super.getOperatingSystemVersion().equals("EXRU.1"))
						return true;
				} else if (getNetworkGeneration() == "5G") {
					if (super.getOperatingSystemVersion().equals("EXRU.1")) {
						return true;
					}
				}
			}

		}

		return false;

	}
}
	 class mobileInterface {

		public static void main(String[] args) {
			SmartPhone smartPhone = new SmartPhone("KrillinM20", "Nebula", "Saturn", "1.3", "5G");
			if (smartPhone.testCompatibility())
				System.out.println("The mobile OS is compatible with the network generation!");
			else
				System.out.println("The mobile OS is not compatible with the network generation!");
		}
	}
