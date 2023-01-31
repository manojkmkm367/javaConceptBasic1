package org.singleton;

public class SingletonMainClass {

	protected void empMobNo() {
		System.out.println("123456789976");

	}

	private SingletonMainClass() {
		// TODO Auto-generated constructor stub
	}
	public static SingletonMainClass variab;

	protected static SingletonMainClass singletonMethod() {

		if(variab==null)
		{
			variab = new SingletonMainClass();
		}
		return variab;

	}



}
