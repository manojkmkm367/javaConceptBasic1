package org.looping;

public class LoopingTask5 {
	private static void Task5() {
	int space=2;
	
	
		for(int i=1;i<=4;i++)	{
			for (int j=1;j<=i;j++) {		
				for(int k =space;k>=0;k--) {                     //BeforeSpace
						if(j==1) { System.out.print("\t"); }
								        	}
				System.out.print(1);	
				
						for(int k =1;k>=0;k--)					//AfterSpace
						{	
							System.out.print("\t");  	
						}					
			}
			System.out.println(); space--; 
		}
	}
	public static void main(String[] args) {
		Task5();	
	}
	
}
