package org.looping;

public class LoopingTask4 {
	private static void Task4() {
		
		for(int i=4;i>0;i--)	{
			for (int j=1;j<=i;j++) {				
				System.out.print(j  +"\t");			
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Task4();	
	}
	
}
