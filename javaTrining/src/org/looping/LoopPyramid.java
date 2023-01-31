package org.looping;

public class LoopPyramid {
	private static void Task5(int pyramidSize) {		
		int space=pyramidSize-2;
			for(int i=1;i<=pyramidSize;i++)	{
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
			// Kindly Enter pyramid Size
			Task5(3);	
		}
}
