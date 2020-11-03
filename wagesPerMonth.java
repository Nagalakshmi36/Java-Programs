import java.util.Scanner;
public class wagesPerMonth
{
	public static void main(String args[])		
	{
		Scanner sc=new Scanner(System.in);
		int  num_working_days=20;
		int max_weeks_month=4;
		int totalemphrs=0,emphrs;
		int totalworkingdays=0;			
		int emprateperhr=20;
		System.out.println("enter choice for emphrs ");
		int  empcheck=sc.nextInt();
	
		switch(empcheck)
		{
			case 1:
				emphrs=4;	
				break;

			case 2:
				emphrs=8;
				break;
			default:
				emphrs=0;
				break;
		}
		while(totalemphrs<max_weeks_month&&totalworkingdays<num_working_days)
		{
			totalworkingdays++;
			totalemphrs=totalemphrs+emphrs;
			int dailywage=emphrs*emprateperhr;
		};
		int totalsalary=totalemphrs*emprateperhr;
		System.out.println("total salary per month is "+totalsalary);
	}
}
