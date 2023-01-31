package org.ListAndSet;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Task2ArrayListSet {

	public static void main(String[] args) {
		int EmpArray[] = new int[10];
		int temp =10;
		System.out.print("Array Size : "+EmpArray.length +"  Array Elements : ");
		for (int i=0;i< 10 ;i++)
		{			EmpArray[i]=temp; temp=temp+10;
		}
// Passing Duplicate values
		EmpArray[9]=10; 		EmpArray[8]=20;
		
// Array
		
		for (int i : EmpArray) {
			System.out.print(i+", ");
		}
		
// List		
		List list  = new ArrayList();
		for (int i : EmpArray) {			
			list.add(i);			
		}
		System.out.print("\n"+"List Size : "+list.size()+"   List Elements : "+list);
	
// Set		
	TreeSet<Object>  treeSet = new TreeSet<>();	
	for (Object object : list) {
		treeSet.add(object);
	}
	System.out.println("\n"+"Set Size  : "+treeSet.size()+"    List Elements : "+treeSet);
	}

}
