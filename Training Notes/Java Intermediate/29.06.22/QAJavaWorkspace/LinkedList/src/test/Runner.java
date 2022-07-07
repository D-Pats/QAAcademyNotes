package test;

import java.util.Iterator;
import java.util.LinkedList;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var staffName = new LinkedList<String>();

		staffName.add("Devin");
		staffName.add("Erhan");
		staffName.add("Eylem");

		System.out.println(staffName);

		Iterator<String> iterStaffName = staffName.iterator();

		String first = iterStaffName.next();
		String second = iterStaffName.next();
		String third = iterStaffName.next();

		System.out.println(first);
		System.out.println(second);
		System.out.println(third);

//		------------------------------

		var staffLL = new LinkedList<Staff>();

		Staff devin = new Staff(1, "devin");
		Staff erhan = new Staff(2, "erhan");
		Staff eylem = new Staff(3, "eylem");

		staffLL.add(devin);
		staffLL.add(erhan);
		staffLL.add(eylem);

		Iterator<Staff> iterStaffLL = staffLL.iterator();

//		Staff staff1 = iterStaffLL.next();
//		Staff staff2 = iterStaffLL.next();
//		Staff staff3 = iterStaffLL.next();

//		System.out.println(staff1);
//		System.out.println(staff2);
//		System.out.println(staff3);

		for (int i = 0; iterStaffLL.hasNext(); i++) {
			System.out.println(iterStaffLL.next());
		}

	}

}
