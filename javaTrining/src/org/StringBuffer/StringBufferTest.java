package org.StringBuffer;

public class StringBufferTest {

	public static void main(String[] args) {
		
		
		
		
		String name = "Manoj";
		name.concat("kumar");
		System.out.println(name);
		System.out.println(name.replaceAll("M", ""));
		
		
		StringBuffer bf= new StringBuffer("MANOJ");
		bf.append("KUMAR");
		System.out.println(bf);
		

	}

}
