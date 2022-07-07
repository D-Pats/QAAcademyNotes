package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> stringList = new ArrayList<>();
		
		stringList.add("string1");
		stringList.add("string2");
		stringList.add("string3");
		
		System.out.println(stringList);
		
		System.out.println("String at index 1 (should be string2)" + stringList.get(1));
		
		System.out.println("stringList size: " + stringList.size());
		
		stringList.remove(1);
		
		System.out.println("stringList with string2 removed (index 1):\n" + stringList);
		
		for (String i : stringList){
		    System.out.println(i);
		}
// 		------------------------------
		stringList.clear();
		
		stringList.add("string1");
		stringList.add("string2");
		stringList.add("string3");
		
		Iterator<String> iterStringList = stringList.iterator();

		String first = iterStringList.next();
		String second = iterStringList.next();
		String third = iterStringList.next();

		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
		
	}

}
