import java.io.*;
import java.util.Scanner;
public class Palindrome
{
	public  static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value");
		int n=sc.nextInt();
		int reverse=0;
		int i=n;
		while(n>0)
		{
			reverse=(reverse*10)+(n%10);
			n=n/10;
		}
		if(reverse==i)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}
}
			
