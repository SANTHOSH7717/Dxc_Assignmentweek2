package dxc;
class Employee{
	private int employeeId;
	private String employeeName;
	private double salary;
	public Employee(int employeeId, String employeeName) {
		
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}

class ContractEmployee extends Employee{
	private double wage;
	private float hoursWorked;
	public ContractEmployee(int employeeId, String employeeName, double wage, float hoursWorked) {
		super(employeeId, employeeName);
		this.hoursWorked = hoursWorked;
		this.wage = wage;
		// TODO Auto-generated constructor stub
	}
	public double calculateSalary() {
		return hoursWorked*wage; 
	}
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	public float getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(float hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
}

class PermanentEmployee extends Employee{
	
	private double basicPay;
	private double hra;
	private float experience;
	
	
	public PermanentEmployee(int employeeId, String employeeName, double basicPay, double hra, float experience) {
		super(employeeId, employeeName);
		this.basicPay = basicPay;
		this.hra = hra;
		this.experience = experience;
	}

	public double monthlySalary() {
		if (experience < 3) {
			return Math.round(basicPay + hra);
		} else if (experience >= 3 && experience < 5) {
			return Math.round(basicPay + hra + (5 * basicPay) / 100);
		} else if (experience >= 5 && experience < 10) {
			return Math.round(basicPay + hra + (7 * basicPay) / 100);
		} else {
			return Math.round(basicPay + hra + (12 * basicPay) / 100);
		}

	}
	public double getBasicPay() {
		return basicPay;
	}


	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}


	public double getHra() {
		return hra;
	}


	public void setHra(double hra) {
		this.hra = hra;
	}


	public float getExperience() {
		return experience;
	}


	public void setExperience(float experience) {
		this.experience = experience;
	}
	
}
public class employeeinheritance {

	public static void main(String[] args) {

		PermanentEmployee permanentEmployee = new PermanentEmployee(711211, "Rafael", 1855,
				115, 3.5f);
				
				 System.out.println("Hi "+permanentEmployee.getEmployeeName()+", your salary is $"+permanentEmployee.monthlySalary());

				 ContractEmployee contractEmployee = new ContractEmployee(102, "Jennifer", 16, 90);
				
				 System.out.println("Hi "+contractEmployee.getEmployeeName()+", your salary is $"+contractEmployee.calculateSalary());

				 

	}

}