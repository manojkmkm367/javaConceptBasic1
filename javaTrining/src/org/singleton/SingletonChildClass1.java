package org.singleton;

public class SingletonChildClass1 {

	
	public static void main(String[] args) {
	
		SingletonMainClass obj1 = SingletonMainClass.singletonMethod();
		obj1.empMobNo();
		System.out.println(obj1.hashCode());
		
		SingletonMainClass obj2 = SingletonMainClass.singletonMethod();
		System.out.println(obj2.hashCode());
		


	}

}
