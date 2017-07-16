import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class DisappearedNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		sc.nextLine(); 
		int [] nums = new int[size];
		int i;
		
		for ( i = 0; i < size; i++) {
		    	nums[i] = sc.nextInt();
		}
		
		System.out.println(disappeared(nums));
		
	}
	
	public static List<Integer> disappeared(int []nums){
		
		List<Integer> ret=new ArrayList<Integer>();
		 int temp;
		for( int i=0;i<nums.length;i++){
		    temp=Math.abs(nums[i])-1;
			if(nums[temp] >0){
			nums[temp]=-nums[temp];	
			}
		}
		for( int i=0;i<nums.length;i++){
			if(nums[i]>0)
			{
			ret.add(i+1);	
			}
		    }
		
		return ret;
		
	}

}
