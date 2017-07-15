import java.util.Scanner;

public class ReverseWords {

	
		public static void main(String[] args) {
			
			String str;
			char xyz[];
			Scanner sc=new Scanner(System.in);
			str=sc.nextLine();
			xyz=str.toCharArray();
			System.out.println(reverseWords(xyz));
			
		}
			
		
		public static String reverseWords(char[] s) {
			    int i=0;
			    for(int j=0; j<s.length; j++){
			        if(s[j]==' '){
			           reverse(s, i, j-1);        
			            i=j+1;
			        }
			    }
			    
			   reverse(s, i, s.length - 1);
			   return new String(s);
			
		}
	
			 
		public static void reverse(char[] s, int i, int j){
			    while(i<j){
			        char temp = s[i];
			        s[i]=s[j];
			        s[j]=temp;
			        i++;
			        j--;
			    }
		}
}
