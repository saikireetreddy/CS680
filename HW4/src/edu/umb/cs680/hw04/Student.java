package edu.umb.cs680.hw04;

public class Student {
	private float fee;
	private int admission;
	private int yearsInState;
	private String state;
	private String foreignAddress;
	private String name;
	private String usAddress;

	
	private Student(String name, String usAddress, int yearsInState, String state, int admission, String foreignAddress,
			StudentFactory status) {
		this.name = name;
		this.admission = admission;
		this.usAddress = usAddress;
		this.yearsInState = yearsInState;
		this.state = state;
		this.foreignAddress = foreignAddress;
		if (status.equals(StudentFactory.INSTATE))
			this.fee = 98000;
		else if (status.equals(StudentFactory.OUTSTATE))
			this.fee = 58000;
		else
			this.fee = 42000;
		
	}
	
	public float getfee() {
		return fee;
	}

	public String getName() {
		return name;
	}

	public int getadmission() {
		return admission;
	}

	public String getUsAddress() {
		return usAddress;
	}

	public int getYearsInState() {
		return yearsInState;
	}

	public String getState() {
		return state;
	}

	public String getForeignAddress() {
		return foreignAddress;
	}

	public static Student createInStateStudent(String name, String usAddress) {
		return new Student(name, usAddress, 0, null, 0, null, StudentFactory.INSTATE);
	}

	public static Student createOutStateStudent(String name, String usAddress, int yearsInState,String state) {
		return new Student(name, usAddress, yearsInState, state, 0, null, StudentFactory.OUTSTATE);
	}

	public static Student createIntlStudent(String name, String usAddress, int admission, String foreignAddress) {
		return new Student(name, usAddress, 0, null, admission, foreignAddress, StudentFactory.INTL);
	}



public static void main(String[] args) {
	
	Student outStudent = createOutStateStudent("kireet", "Boston", 12,"MA");
	System.out.println("Student fee Fee is: "
			+ outStudent.getfee());
	System.out.println("Student US Address is: "
			+ outStudent.getUsAddress());
	System.out.println("Student admission Number is: "
			+ outStudent.getadmission());
	System.out.println("Student state is: "
			+ outStudent.getState());
	System.out.println("Student class has been implemented successfully");
}


}
