import java.util.Scanner;


public class NumberComplement {

	public static void main(String[] args) {
		int i=0,n;
		 int j=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		sc.nextLine();
		
        while(i<n)
        {
         i+=Math.pow(2,j);
         j++;
        }
        System.out.println("Complement of "+n+ "is "+ (i-n));
        sc.close();
	}

}
