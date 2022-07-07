package Hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> staffID = new HashMap<>();

		staffID.put(1, "Devin");
		staffID.put(2, "Erhan");
		staffID.put(3, "Eylem");

		System.out.println(staffID.get(2));
		System.out.println("Size of HashMap: " + staffID.size());

		for (int i : staffID.keySet()) {
			System.out.println(i);
		}

		for (String i : staffID.values()) {
			System.out.println(i);
		}
		
		for (Entry<Integer, String> i : staffID.entrySet()) {
			System.out.println(i);
		}
	}

}
