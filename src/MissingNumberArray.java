import java.util.Scanner;


public class MissingNumberArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		sc.nextLine(); 
		int [] nums = new int[size];
		int i;
		
		for ( i = 0; i < size; i++) {
		    	nums[i] = sc.nextInt();
		       }
		
		System.out.println(missingNumber(nums));
		sc.close();  
	}

	
	public static int missingNumber(int[] nums) {
		            
	    int i,sum=0;
		int nsum=0;
		nsum=(nums.length)*(nums.length+1)/2;
		
		for( i=0;i<nums.length;i++){
		   sum+= nums[i];
		 }
     return nsum-sum;
	}
}		        