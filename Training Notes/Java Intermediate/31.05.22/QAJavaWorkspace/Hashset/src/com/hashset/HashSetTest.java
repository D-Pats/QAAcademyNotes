package com.hashset;

import java.util.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {

		Set<String> hashSet = new HashSet<>();

		hashSet.add("B");
		hashSet.add("C");
		hashSet.add("A");
		hashSet.add("E");
		hashSet.add("D");
		hashSet.add("F");
		hashSet.add("F"); // this will overwrite the previous "F", as duplicate values are not permitted
		System.out.println(hashSet);
//		System.out.println(hashSet.isEmpty());
//		if (hashSet.size() == 0) {
//			System.out.println("HashSet is empty");
//		} else {
//			System.out.println(hashSet.size());
//		}
//		hashSet.remove("A");
//		System.out.println(hashSet);

//		Iterator<String> iteratorTest = hashSet.iterator();
//		while (iteratorTest.hasNext()){
//		    String obj = iteratorTest.next();
//		    iteratorTest.remove();
//		}
//		System.out.println(hashSet);

//		hashSet.clear();
//		System.out.println(hashSet);
		
		System.out.println(hashSet.contains("B"));
	}
}
