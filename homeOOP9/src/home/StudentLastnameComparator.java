package home;

import java.util.Comparator;

public class StudentLastnameComparator implements Comparator<Student>{
	
		@Override
		public int compare(Student o1, Student o2) {
			Student student1 = o1;
			Student student2 = o2;
			
			String lastName1 = student1.getLastName();
			String lastName2 = student2.getLastName();
			
			if(lastName1.compareTo(lastName2)>0) {
				return 1;
			}
			if(lastName1.compareTo(lastName2)<0) {
				return -1;
			}
			return 0;
		}

	}