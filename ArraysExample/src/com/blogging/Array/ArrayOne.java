package com.blogging.Array;

public class ArrayOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a[];
	      a = new int[5];
	      System.out.println("By default all the elements inside the array are 0 until initialized by us or the user");
	      for(int i =0; i<5;i++){
	    	  System.out.println( +a[i]);//By default all the elements in the array are 0.
	      }
	      System.out.println("after assigning some values");
	      a[0] = 1;
	      a[1] = 2;
	      for(int i =0; i<5;i++){
	      System.out.println(a[i]);//By default all other elements in the array are 0.
	      }
	      //This is one of the way in which we can initialize and print the array.
	      System.out.println("After the array is assigned completely");
	      a[0]=1;
	      a[1]=2;
	      a[2]=3;
	      a[3]=5;
	      a[4]=7;
	      
	      System.out.println(a[0]);
	      System.out.println(a[1]);
	      System.out.println(a[2]);
	      System.out.println(a[3]);
	      System.out.println(a[4]);
	      
	      System.out.println("An array created without a new keyword");
	      int b[] = {1,2};//Creating an array without new keyword
	      System.out.println(b[0]+"\n"+b[1]);
	      
	      System.out.println("Array declared,initialized and created at once");
	      int c[] = new int[]{1,2,3,4,5};
	      for(int i =0; i<5;i++){
	      System.out.println(c[i]);//By default all the elements in the array are 0.
	      }
	      
	      System.out.println("Using length to get the length of the array");
	      for(int i =0; i<c.length;i++){
		      System.out.println(c[i]);
		      }
		      System.out.println("The length of array c is "+c.length);
		     
	      
	      System.out.println("An array of String type");
	      String[] languages = {"Java","Python"};
	      
	      for(int i =0; i<2;i++){
	      System.out.println(languages[i]);//By default all the elements in the array are will be "null" as the array is of string type until initialized.
	      }
	      
	      System.out.println("An array of double type");
	      double d[] = new double[4] ;
	      d[0] = 78.98;
	      d[1] = 67.89;
	      for(int i =0; i<4;i++){
		      System.out.println(d[i]);//By default all the elements in the array are will be 0.0 as the array is of double type 
		      }
	      
	      System.out.println("A 2-D array");
	      int[][] TwoDArray = new int[3][2];
	      for(int i =0;i<3;i++){
	          for(int j=0;j<2;j++){
	               System.out.println(TwoDArray[i][j]);
	          }
	      }

	      System.out.println("A 2-D array initialized");
	      
	      TwoDArray[0][0] = 67;
	      TwoDArray[0][1] = 89;
	      TwoDArray[1][0] = 76;
	      TwoDArray[1][1] = 43;
	      TwoDArray[2][0] = 34;
	      TwoDArray[2][1] = 43;
	      
	      System.out.println("Using index technique to print specific values");
	      System.out.println(TwoDArray[0][0]+"\n"+
	      TwoDArray[0][1]+"\n"+
	      TwoDArray[1][0]);
	      
	      System.out.println("Using for loop");
	      
	      for(int i =0;i<3;i++){
	          for(int j=0;j<2;j++){
	               System.out.println(TwoDArray[i][j]);
	          }
	      }
	     
	      System.out.println("Another way to initialize a 2-D array");
	    	
	    int[][] Two = {{1,2},{2,3,},{3,4}};//Observe how the values have been assigned. 1 and 2 belongs to the position a[0][0] and a[0][1] respectively
          //and 2 and 3 belongs to a[1][0] and a[1][1] respectively and 3,4 belongs to a[2][0] and a[2][1] respectively.

			for(int i =0;i<3;i++){
			for(int j=0;j<2;j++){
			System.out.println(Two[i][j]);
			}
			}


}
}
