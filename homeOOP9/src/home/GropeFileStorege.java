package home;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GropeFileStorege {

	private List <Student> st =new ArrayList<>();
	
	public void saveGroupToCSV(Group group) throws IOException {
		File file = new File(group.getGroupName() + ".csv");
		
		Iterator<Student> itr=group.getStudent().iterator();
	
		try (FileWriter fw = new FileWriter(file)) {
			for (; itr.hasNext();) {
				if (itr.next() != null) {
				
				fw.append(itr.next().toCSV() + System.lineSeparator());
				}
				}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
}

	public Group loadGroupFromCSV(File file) throws IOException {

		Group gr = new Group(file.getName().substring(0, file.getName().lastIndexOf(".")), st);
		
		Iterator<Student> itr=gr.getStudent().iterator();
		
		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
			
			
			
			for (; itr.hasNext();) {
				if (itr.next() != null) {
					String stud = reader.readLine();
					gr.addStudent(new Student().fromCSVtoStudent(stud));
		
				}
			}
		} catch (IOException e) {
			return null;
		}
		return gr;
	}

	public File findFileByGroupName(String groupName, File searchZone) {

		File[] arr = searchZone.listFiles();
		if (arr != null) {
			for (File f : arr) {
				if (f.isFile() && f.getName().equals(groupName + ".csv")) {
					return f;
				}
			}
		}
		return null;
	}
}