public class Student  {

	public String firstName;
	private String lastName;
	private int age;
	private int rollNumber;
	private String department;
	private String address;
	private int EnrollmentYear;
	private String phoneNumber;
	private String emailAdress;

	int courseMarks = 100;
	int totalmarks = 500;
	private String courseName1;
	private String courseName2;
	private String courseName3;
	private String courseName4;
	private String courseName5;

	public Student(String fname, String lname, int Age, int rollno, String dept, String Address, int enrollYear,
			String number, String email, String course1, String course2, String course3, String course4, String course5) {

		firstName = fname;
		lastName = lname;
		age = Age;
		rollNumber = rollno;
		department = dept;
		address = Address;
		EnrollmentYear = enrollYear;
		phoneNumber = number;
		emailAdress = email;
		courseName1 = course1;
		courseName2 = course2;
		courseName3 = course3;
		courseName4 = course4;
		courseName5 = course5;

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getEnrollmentYear() {
		return EnrollmentYear;
	}

	public void setEnrollmentYear(int enrollmentYear) {
		EnrollmentYear = enrollmentYear;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailAdress() {
		return emailAdress;
	}

	public void setEmailAdress(String emailAdress) {
		this.emailAdress = emailAdress;
	}

	public String getCourseName1() {
		return courseName1;
	}

	public void setCourseName1(String courseName1) {
		this.courseName1 = courseName1;
	}

	public String getCourseName2() {
		return courseName2;
	}

	public void setCourseName2(String courseName2) {
		this.courseName2 = courseName2;
	}

	public String getCourseName3() {
		return courseName3;
	}

	public void setCourseName3(String courseName3) {
		this.courseName3 = courseName3;
	}

	public String getCourseName4() {
		return courseName4;
	}

	public void setCourseName4(String courseName4) {
		this.courseName4 = courseName4;
	}

	public String getCourseName5() {
		return courseName5;
	}

	public void setCourseName5(String courseName5) {
		this.courseName5 = courseName5;
	}

}
