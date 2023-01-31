package org.ListAndSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class Employment {

	public static void main(String[] args) {
		
		int EmpArray[] = new int[10];
		int temp =10;
		System.out.println("Array Size : "+EmpArray.length);
		for (int i=0;i< 10 ;i++)
		{			EmpArray[i]=temp; temp=temp+10;
					System.out.print(EmpArray[i]+",");
		}
// Passing Duplicate values
		EmpArray[9]=10;
		EmpArray[8]=20;
//Passing array to set		
		Set<Integer> linkedSet = new LinkedHashSet<>();
		
		for (int i=0;i< 10 ;i++)
		{		linkedSet.add(EmpArray[i]);
		}
		System.out.println("\nSet Size : "+linkedSet.size());
	System.out.println(linkedSet);

	}

}
