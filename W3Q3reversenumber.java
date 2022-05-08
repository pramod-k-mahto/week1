package nothing;
import java.util.*;
public class W3Q3reversenumber {

	public static void main(String[] args) {
	
    Scanner sc=new Scanner(System.in);
    System.out.println(" Enter the number  ");
    int num=sc.nextInt();
   
    int reverse=0;
    int reminder=0;
    while(num>0) {
    	reminder=num%10;	
    		reverse=reverse*10+reminder;
    	num=num/10;
    		   	 
    }
    System.out.println("Reverse number is "+reverse);
   
    
	}

}
