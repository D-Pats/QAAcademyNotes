package Hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> testHashSet = new HashSet<>();

		testHashSet.add("First Item");
		testHashSet.add("Second Item");
		testHashSet.add("Third Item");

		System.out.println("Created size is: " + testHashSet.size());

		testHashSet.remove("Second Item");

		System.out.println("Removed Second Item size is: " + testHashSet.size());
		System.out.println(testHashSet);

		Iterator<String> hashSetIter = testHashSet.iterator();

		while (hashSetIter.hasNext()) {
			System.out.println(hashSetIter.next());
		}

	}

}
