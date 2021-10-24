package in.sudharshanit.bean;

import java.util.ArrayList;
import java.util.List;

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
	public static String displayStudents(List<Student> listStudents){
		//System.out.println(listStudents);
		listStudents.forEach(s->System.out.println(s));
		return "Student Details Displayed Here Successufully";
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", collegeName=" + collegeName
				+ ", branchName=" + branchName + ", address=" + address + "]";
	}
	
	
	
}
