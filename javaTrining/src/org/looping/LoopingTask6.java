package org.looping;

public class LoopingTask6 {
	private static void down(int pyramidSize) {		
		//int space=pyramidSize-2;
			for(int i=1;i<=pyramidSize;i++)	{
				for (int j=pyramidSize;j>=i;j--) {
					
					for(int k =i;k>1;k--) {                     //BeforeSpace
					if(j==pyramidSize)	{ 
							System.out.print("\t"); }
								        	}
					

					System.out.print(1);
					
					for(int k =1;k>=0;k--)					//AfterSpace
					{	
						System.out.print("\t");  	
					}	
									
				}
				System.out.println();// space--; 
			}
		}
		public static void main(String[] args) {
			// Kindly Enter pyramid Size
			down(3);	
		}


}
