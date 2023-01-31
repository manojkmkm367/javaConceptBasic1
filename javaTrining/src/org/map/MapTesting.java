package org.map;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import javax.swing.text.html.parser.Entity;

public class MapTesting {

	public static void main(String[] args) {
// ARRAY
		int Emparray[] = new int[15];
		System.out.print("Array : ");
		for (int i = 14, j = 0; i >= 0; i--, j++) {
			Emparray[j] = (i * 10) % 100;
			System.out.print(Emparray[j] + ", ");
		}
System.out.print("\n---------------------------------------------------------------------");
// LIST	
		List<Integer> list = new LinkedList<Integer>();

		for (int temp : Emparray) {
			list.add(temp);

		}

		System.out.println("\nLinkedList : " + list);
		
System.out.println("\n---------------------------------------------------------------------");
// SET		HASHSET VS LINKEDHASHSET Passing IRREGULER ARGUMENTS FROM ARRAY
		Set<Integer> hashSet = new HashSet();
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>();
		hashSet.addAll(list);
		linkedHashSet.addAll(list);
		System.out.println("HashSet : " + hashSet);
		System.out.println("LinkedHashSet: " + linkedHashSet);
		
System.out.println("\n---------------------------------------------------------------------");
// MAP  LinkedHashMap Vs TreeMap Passing IRREGULER ARGUMENTS FROM HASHLIST
		LinkedHashMap linkedHashMap = new LinkedHashMap<Integer, String>();
		TreeMap<Integer, String> treeMap = new TreeMap<>();

		for (Integer integer : hashSet) {
			String temp = (integer.toString()) + "RS";
			linkedHashMap.put(integer, temp);
			treeMap.put(integer, temp);
		}
		System.out.println("LinkedHashMap: " + linkedHashMap);
		System.out.println("TreeMap  :   " + treeMap);
		Set<Entry<Integer, String>> entrySet = linkedHashMap.entrySet();
		System.out.print("linkedHashMap.entrySet: ");
		
		for (Entry<Integer, String> entry : entrySet) {
			System.out.print(entry + ", ");
		}
		Set<Entry<Integer, String>> treeEntryset = treeMap.entrySet();
		System.out.print("\nTreemap.entrySet: ");

		for (Entry<Integer, String> entry : treeEntryset) {
			System.out.print(entry + ", ");

		}

	}

}
