package mypackage;

public class Employee {

	private String epmployeeID;
	private String epmployeeFN;
	private String epmployeeLN;
	private String employeeEmail;
	private String epmployeePosition;
	private String epmployeeLocation;
	private String employementStatus;
	
	public Employee(String id, String firstname, String lastname, String email,  String position, String location, String status) 
	{
		epmployeeID = id;
		epmployeeFN = firstname;
		epmployeeLN = lastname;
		employeeEmail = email;
		epmployeePosition = position;
		epmployeeLocation = location;
		employementStatus = status;
	}
	
	public String getEpmployeeID() {
		return epmployeeID;
	}

	public void setEpmployeeID(String epmployeeID) {
		this.epmployeeID = epmployeeID;
	}

	public String getEpmployeeFN() {
		return epmployeeFN;
	}

	public void setEpmployeeFN(String epmployeeFN) {
		this.epmployeeFN = epmployeeFN;
	}

	public String getEpmployeeLN() {
		return epmployeeLN;
	}

	public void setEpmployeeLN(String epmployeeLN) {
		this.epmployeeLN = epmployeeLN;
	}

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	public String getEpmployeePosition() {
		return epmployeePosition;
	}

	public void setEpmployeePosition(String epmployeePosition) {
		this.epmployeePosition = epmployeePosition;
	}

	public String getEpmployeeLocation() {
		return epmployeeLocation;
	}

	public void setEpmployeeLocation(String epmployeeLocation) {
		this.epmployeeLocation = epmployeeLocation;
	}

	public String getEmployementStatus() {
		return employementStatus;
	}

	public void setEmployementStatus(String employementStatus) {
		this.employementStatus = employementStatus;
	}

}

