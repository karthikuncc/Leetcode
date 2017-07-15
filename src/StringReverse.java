import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		
		String str;
		char xyz[];
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		xyz=str.toCharArray();
		
		int i=0,j;
		j=str.length()-1;
		
		while(i<j)
		{
		 char tmp;
		 tmp=xyz[i];
		 xyz[i]=xyz[j];
		 xyz[j]=tmp;
		 i++;
		 j--;
		}
		
		System.out.println(new String(xyz));
	}

}

