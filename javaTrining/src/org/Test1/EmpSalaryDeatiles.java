package org.Test1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.swing.text.html.parser.Entity;

public class EmpSalaryDeatiles {

	public static void main(String[] args) {
		UserDefindClass l1= new UserDefindClass();
		l1.setempName("manoj");
		l1.setempSalary(20000);

		UserDefindClass l2= new UserDefindClass();
		l2.setempName("Raj");
		l2.setempSalary(40000);

		UserDefindClass l3= new UserDefindClass();
		l3.setempName("Tiru");
		l3.setempSalary(60000);

		UserDefindClass l4= new UserDefindClass();
		l4.setempName("Kumar");
		l4.setempSalary(80000);
		

		///////////////////////////////////////////////////////////////////////////////////////
		System.out.println("User Defind List");
		List<UserDefindClass> list = new ArrayList<>();
		list.add(l1);		list.add(l2);
		list.add(l3);		list.add(l4);	

		for (UserDefindClass userDefindList : list) {
			String name = userDefindList.getempName();
			int sal = userDefindList.getempSalary();
			System.out.println("Name : "+name +" && Salary : "+ sal);
		}

		///////////////////////////////////////////////////////////////////////////////////////
		System.out.println("\nUser Defind Set");
		Set<UserDefindClass> s = new LinkedHashSet<>();
		s.add(l1);	s.add(l2);
		s.add(l3);  s.add(l4); 

		for (UserDefindClass userDefindset : s) {
			String name = userDefindset.getempName();
			int salary = userDefindset.getempSalary();
			System.out.println("Name : "+name + " && Salary : " + salary);

		}
		///////////////////////////////////////////////////////////////////////////////////////
		System.out.println("\nUser Defind Map");

		Map<String , UserDefindClass> m = new HashMap<String, UserDefindClass>();
		m.put("Driver", l1);
		m.put("Emp", l2);
		m.put("AssistentManager", l3);
		m.put("Manager", l4);
		
		Set<Entry<String, UserDefindClass>> entrySet = m.entrySet();
		
		for (Entry<String, UserDefindClass> entry : entrySet) {
			String key = entry.getKey();
			UserDefindClass value = entry.getValue();
			System.out.println(key + "\nName : "+ value.getempName() +" && Salary : "+ value.getempSalary());
			
		}
		






	}

}
