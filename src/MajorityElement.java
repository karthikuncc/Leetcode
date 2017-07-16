import java.util.Scanner;


public class MajorityElement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		sc.nextLine(); 
		int [] nums = new int[size];
		int i;
		
		for ( i = 0; i < size; i++) {
		    	nums[i] = sc.nextInt();
		       }
		
		System.out.println(majority(nums));
		sc.close();  
	}
	public static int majority(int nums []){
		int major,count=1;
		major=nums[0];
		
		for(int i=0;i<nums.length;i++){
			
			if(nums[i]==major)
			{
				count++;
				
			}
			else if(count==0){
				major=nums[i];
				count=1;
			}
			else{
				count--;
			}
		}
		return major;
	}
}
