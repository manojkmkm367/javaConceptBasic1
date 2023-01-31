package org.looping;

public class LoopPyramidTask {
	private static void topPyramid(int pyramidSize) {		
		int space=pyramidSize-2;
			for(int i=1;i<=pyramidSize;i++)	{
					for (int j=1;j<=i;j++) {		
							for(int k =space;k>=0;k--) 
							{                    
									if(j==1) { System.out.print("\t"); }
							}
					System.out.print("X"+"\t\t");
												}
				System.out.println(); space--; 
			}
			}
	private static void downPyramid(int pyramidSize) {		
			for(int i=2;i<=pyramidSize;i++)	{
				for (int j=pyramidSize;j>=i;j--) {					
					if(j==pyramidSize) {                     
					for(int k =i;k>1;k--)	{ 
							System.out.print("\t");
							}								        	}		
					System.out.print("X" + "\t\t");								
				}
				System.out.println();
			}
		}
	private static void pyramidSize(int size) {
		topPyramid(size);   
		downPyramid(size);
					}	
		public static void main(String[] args) {
			pyramidSize(4);  // Enter Size of Pyramid
		}

}
