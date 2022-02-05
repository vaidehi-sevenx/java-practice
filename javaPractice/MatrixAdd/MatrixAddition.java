package javaPractice;

public class MatrixAddition {
	public static void main(String args[]) {
		int a[][]={{1,3,4},{2,4,3},{5,2,2}};    
		int b[][]={{2,6,1},{1,1,1},{1,3,8}};    
		
		int c[][]=new int[3][3];
		
		for(int i=0;i<3;i++){    
		for(int j=0;j<3;j++){  
/*addition of matrices */
		c[i][j]=a[i][j]+b[i][j];    
		System.out.print(c[i][j]+" ");  
		
		}    
		System.out.println();//new line    
		}    
		}}  
