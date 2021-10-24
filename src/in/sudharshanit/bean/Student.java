package in.sudharshanit.bean;

public class Student {

	private Integer studentId;
	private String studentName;
	private String collegeName;
	private String branchName;
	private Address address;
	public Student(Integer studentId, String studentName, String collegeName, String branchName,Address address) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.collegeName = collegeName;
		this.branchName = branchName;
		this.address=address;
	}
	
	
	
}
