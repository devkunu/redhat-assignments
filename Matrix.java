public class Matrix{  
 public static void main(String args[]){  
 //creating the first matrix 
 int matrix1[][]={{1,3,4},{2,4,3},{3,4,5}};
 System.out.println("The first matrix is: "); 
 for(int i=0;i<3;i++){    
 for(int j=0;j<3;j++){    
 System.out.print(matrix1[i][j]+" ");    
}  
 System.out.println();//new line    
} 	 
//creating the second matrix
 int matrix2[][]={{6,7,4},{2,5,9},{8,2,1}};
 System.out.println("The second matrix is: "); 
 for(int i=0;i<3;i++){    
 for(int j=0;j<3;j++){    
 System.out.print(matrix2[i][j]+" ");    
}  
 System.out.println();//new line    
} 	
//finding the transpose of the first matrix 
 int transpose1[][]=new int[3][3];
 System.out.println("The transpose of the first matrix is :"); 
 for(int i=0;i<3;i++){    
 for(int j=0;j<3;j++){    
 transpose1[i][j]=matrix1[j][i];     
 System.out.print(transpose1[i][j]+" ");    
}  
 System.out.println();//new line    
}
//finding the transpose of the second matrix
 int transpose2[][]=new int[3][3];
 System.out.println("The transpose of the second matrix is :"); 
 for(int i=0;i<3;i++){    
 for(int j=0;j<3;j++){    
 transpose2[i][j]=matrix2[j][i];     
 System.out.print(transpose2[i][j]+" ");    
}  
 System.out.println();//new line
}
//creating another matrix to store the multiplication of two transposed matrices
 int c [][]=new int[3][3];
 System.out.println("The multiplication of the two transposed matrices is:");
//multiplying and printing the multiplication of two transposed matrices
 for(int i=0;i<3;i++){
 for(int j=0;j<3;j++){
	c[i][j]=0;
	for(int k=0;k<3;k++){
		c[i][j]+=transpose1[i][k]*transpose2[k][j];
	}
	System.out.print(c[i][j]+" ");
      }
   System.out.println();//new line
      }
    }
}     

