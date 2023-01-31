package org.interviewLogics;

public class Case1ReverseString {


	public static void usingStringBuffer() {
		String name="Manoj kumar";
		StringBuffer bf=new StringBuffer(name);
		bf.reverse();
		System.out.println(bf);
	}

	public static void usingCharArray() {
		String name="Ajith kumar";
		String res="";
		char[] charArray = name.toCharArray();
		for(int i=charArray.length-1; i>=0;i--) {
			res=res+charArray[i];
		}
		System.out.println(res);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		usingStringBuffer();
		usingCharArray();
	}

}
