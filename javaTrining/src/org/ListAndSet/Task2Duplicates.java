package org.ListAndSet;
import java.util.ArrayList;



public class Task2Duplicates {
	public static void main(String[] args) {
	 ArrayList list1 = new ArrayList();
	 for (int i=0;i< 10 ;i++)
		{			list1.add(i*10);
		}
	 list1.add(20);	list1.add(10);
	 System.out.println ("List Size  ;"+list1.size()+"\n"+ list1);
	 System.out.println("duplicates value in the List");
	 for (int i=0;i< 10 ;i++)
		{		
		 Object tempObject = list1.get(i);
		if( list1.lastIndexOf(tempObject)==i )
		{
		}
		else {
			System.out.println(tempObject );
		}		
		} 	 
	}
}
