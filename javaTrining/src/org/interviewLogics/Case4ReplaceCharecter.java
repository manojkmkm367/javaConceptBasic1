package org.interviewLogics;

public class Case4ReplaceCharecter {

	public static void main(String[] args) {


		String txt ="Raja paid Rs 12,000 and Rs 20,000";


		String replaceTxt = txt.replaceAll("[,Rs]", "^");

		
		String replaceTxt1 = txt.replaceAll("[1234567890]", "\\$");


		System.out.println(replaceTxt +"\n"+replaceTxt1);


		char[] charArray = txt.toCharArray();

		for(int i =0;i<charArray.length;i++) {
			char t=charArray[i];

			if(t=='1' || t=='2' || t=='3' || t=='4' || t=='5' || t=='0' ) {
				charArray[i]='$';
			}

		}

		System.out.println(charArray);



	}

}
