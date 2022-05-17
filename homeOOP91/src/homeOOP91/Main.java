package homeOOP91;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List1 list1 = new List1();
		List <Integer> list  = new ArrayList();

		
		list1.addList(1);
		list1.addList(2);
		list1.addList(3);
		list1.addList(4);
		list1.addList(5);
		list1.addList(6);
		list1.addList(7);
		list1.addList(8);
		list1.addList(9);
		list1.addList(10);
		
		list1.show();
		
		list1.remainFirst();
		list1.remainLast();
		System.out.println();
		list1.show();
	}

}
