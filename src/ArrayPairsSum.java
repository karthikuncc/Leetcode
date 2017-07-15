import java.util.Arrays;
import java.util.Scanner;


public class ArrayPairsSum {
	
	public static void main(String[] args) {
		int result=0;
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		sc.nextLine(); 
		int [] numbers = new int[size];
		
		for (int i = 0; i < size; i++) {
			
		    if (sc.hasNextInt()) {
		        numbers[i] = sc.nextInt();
		       }
			
			else {
		        System.out.println("You didn't provide enough numbers");
		        break;
			}	
		}
		
		Arrays.sort(numbers);
		
		for(int i=0;i<numbers.length;i+=2){
		 result+=numbers[i];	
		}
		System.out.println(result);
		sc.close();
		         

	}
	

}
