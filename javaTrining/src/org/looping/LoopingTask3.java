package org.looping;

public class LoopingTask3 {
	private static void Task3() {
		
		for(int i=1;i<=4;i++)	{
			for (int j=1;j<=i;j++) {				
				System.out.print(j+"\t");				
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Task3();	
	}
	
}
