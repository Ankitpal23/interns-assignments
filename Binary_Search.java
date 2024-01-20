package Test1;
import java.util.Scanner;
public class Binary_Search {
	public static void main(String[] args) {
		int y[]= {1,3,5,7,9,11,13,15,17,19};
		Scanner p=new Scanner(System.in);
		int s,f=0,l=y.length -1;
        System.out.println("Enter the value to be searched\n");
        s=p.nextInt();
while(f<=l) {
	int mid=f+l/2;
	if(y[mid]==s) {        System.out.print("Element" + " "+ s+" "+"is found at index"+" "+mid);
	break;
}
	else if(y[mid]<s) 
	{
		f=mid+1;
	}
	else
		l=mid-1;
}
	}

}
