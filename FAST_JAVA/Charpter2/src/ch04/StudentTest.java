package ch04;

public class StudentTest {

	public static void main(String[] args) {
	
		Student studentLee = new Student();
		
		studentLee.studentID = 12345;
		studentLee.setStudentName("Lee");
		studentLee.address = "����� ������";
		
		studentLee.showStudentInfo();
		
		
		Student studentBaek = new Student(); //������
		
		studentBaek.studentID = 54321;
		studentBaek.studentName = "Baek";
		studentBaek.address = "����� ������";
		
		studentBaek.showStudentInfo();
		
		//�ּҰ� Ȯ��
		System.out.println(studentLee);
		System.out.println(studentBaek);
		
	}

}
