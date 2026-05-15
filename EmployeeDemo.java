class Employee {
	private int id;
	private String name;
	private String email;
	private long phoneNumber;
	private String location;
	private String designation;
	private int yearsOfExperience;

	public Employee() {
		super();
	}

	public Employee(int id, String name, String email, long phoneNumber, String location, String designation,
			int yearsOfExperience) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.location = location;
		this.designation = designation;
		this.yearsOfExperience = yearsOfExperience;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

	@Override
	public String toString() {
		return ("Id =" + id + "\n Name=" + name + "\n Email=" + email + "\n PhoneNumber=" + phoneNumber
				+ "\n Location=" + location + "\n Designation=" + designation + "\n YearsOfExperience=" + yearsOfExperience)
				;
	}

public class EmployeeDemo {

	public static void main(String[] args) {
		Employee employee1=new Employee(1,"Reena","abc@xyz",22334455L,"Pipeline","Developer",5);
		System.out.println(employee1);
		Employee employee2=new Employee(2,"Meena","bc@yz",122340955L,"KK cross","HR",2);
		System.out.println(employee2);
		Employee employee3=new Employee(2,"Meena","bc@yz",122340955L,"KK cross","HR",2);
		System.out.println(employee3);
		Employee employee4=new Employee(3,"Tina","da@vc",5673247815L,"RR nagar","Accountant",4);
		System.out.println(employee4);
		employee1.equals(employee2);
		System.out.println(employee1.equals(employee2));
		employee2.equals(employee3);
		System.out.println(employee2.equals(employee3));
		employee3.equals(employee4);
		System.out.println(employee3.equals(employee4));
	}
}
}			