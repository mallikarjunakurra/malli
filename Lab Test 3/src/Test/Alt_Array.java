package Test;
//Creating a class for Alternative array
public class Alt_Array {
	
	//Method to print addition of two arrays in a 3rd array
	static void addArray(int td1[][],int td2[][])
	{	
		//initializing 3rd variable to store addition of two arrays
		int td3[][]=new int[td1.length][td1[0].length];	
		
		//Using nested for loop to add alternate values in two arrays 
		for(int i=0;i<td1.length;i++)
		{
			for(int j=0;j<td1[i].length;j++)
			{
				td3[i][j]=td1[i][j]+td2[i][j];
				System.out.print(td3[i][j]+" ");
			}
			System.out.println();
		}
	}
	   //Main method for declaring objects of two arrays and printing alt variable
		public static void main(String args[]){  
			//creating two arrays  
			int a[][]={{1,3,4},{3,4,5}};  
			int b[][]={{1,3,4},{3,4,5}}; 
			
			//Calling method to print alt variable
			addArray(a,b);				  			
	}
}
