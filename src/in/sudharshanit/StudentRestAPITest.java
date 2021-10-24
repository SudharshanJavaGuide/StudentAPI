package in.sudharshanit;

import java.util.ArrayList;
import java.util.List;

import in.sudharshanit.bean.Address;
import in.sudharshanit.bean.Student;

public class StudentRestAPITest {
	
	public void displayStudentDetails() {
		System.out.println("Student Details Will Display here");
	}
	public static void main(String[] args) {
		System.out.println("***Welcome To Student RestAPI***");
		Student s1=new Student(1001,"Sudharshan","SriSaiRam","MPC",new Address("SP","Ch","Kdp"));
		Student s2=new Student(1002,"Indra","SriChaitanya","BIPC",new Address("KT","Rr","hyd"));
		List<Student> listStudents=new ArrayList<Student>();
		listStudents.add(s1);
		listStudents.add(s2);
		String resMsg = Student.displayStudents(listStudents);
		System.out.println(resMsg);
		}

}
