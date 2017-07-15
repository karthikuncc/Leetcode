import java.util.Scanner;


public class HammingDistance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x,y,count=0;
		
		 x = sc.nextInt();
		 y = sc.nextInt();
		 int xor = x^y;
		 
		 for(int i=0;i<32;i++){
			 count+=(xor>>i)&1;
		 }
		 System.out.println(count);
	     
		 sc.close();
		

	}

}
