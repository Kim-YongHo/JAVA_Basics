package ch05;

public class Student {

	public int studentNumber;
	public String studentName;
	public int grade;
	
	public Student() {} //deafult ������
	
	public Student(int studentNumber, String studentName, int grade) {
		
		this.studentNumber = studentNumber;
		this.studentName =studentName;
		this.grade = grade;
		
	}
	
	public String showStudentInfo() {
		
		return studentName + "�л��� ����" +
				studentNumber + "�̰�, " +
				grade + "�г� �Դϴ�.";
	}
}
