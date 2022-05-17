package homeOOP91;

import java.util.ArrayList;
import java.util.List;

public class List1 {

	List<Integer> list = new ArrayList();

	List1() {
		super();
		// TODO Auto-generated constructor stub
	}


	List1(List<Integer> list) {
		super();
		this.list = list;
	}

	public void addList(Integer i) {
		list.add(i);
	}

	public void remainLast() {
		for (int i = 0; i <2; i++) {
			list.remove(list.size()-1);
		}
					
	}

	public void remainFirst() {
		for (int i = 0; i <2; i++) {
			list.remove(0);
		}
			
		
	}

	public List<Integer> getList() {
		return list;
	}

	public void setList(List<Integer> list) {
		this.list = list;
	}

	public void show() {
		for (Integer integer : list) {
			System.out.println(integer);
		}
		
	}
	
	@Override
	public String toString() {
		return "List1 [list=" + list + "]";
	}
}
