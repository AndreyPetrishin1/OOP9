package home;


import java.util.Scanner;

public class EnterStudent{
	Student[] student = new Student[10];
	Scanner sc = new Scanner(System.in);
	
	public Student EnterStudent() {
		Student student = new Student();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������� ��� . . .");
		String setName = sc.nextLine();
		student.setName(setName);
		
		System.out.println("������� ������� . . .");
		String setLastName = sc.nextLine();
		student.setLastName(setLastName);
		
		System.out.println("������� ����� ������ . . .");
		String setGroupName = sc.nextLine();
		student.setGroupName(setGroupName);
		
		System.out.println("������� ��� . . .1-man, 2-woman");
		int gend = sc.nextInt();
		Gender gen = Gender.getTypeByOrdinal(gend);
		student.setGender(gen);
		
		
		System.out.println("������� id . . .");
		int id = sc.nextInt();
		student.setId(id);
		return student;
		}
	}
	
	
