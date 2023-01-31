package org.looping;

public class LoopingTask2 {

	private static void Task2() {
		int k=1;
		for(int i=1;i<=4;i++)	{
			for (int j=1;j<=4;j++) {				
				System.out.print(k+"\t");	k++;			
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Task2();	
	}
}

	

