package Test1;
import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {

		String str = new String();
		String rev ="";
Scanner s=new Scanner(System.in);
System.out.println("Enter any String");
str= s.nextLine();
for(int i=str.length()-1;i>=0;i--)
{rev =rev+str.charAt(i);}
if(str.equals(rev)) {System.out.print("Palindrome String");}
else {System.out.print(" Not Palindrome String");}
	}
	}
