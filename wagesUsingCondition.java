import java.util.Scanner;
public class wagesUsingCondition
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no.of working days");
		int num_working_days=sc.nextInt();

		int emphrs=100,totalemphrs,totalworkingdays,salary;
		int emprateperhr=20,totalsalary=0;
		for(int day=1;day<=num_working_days;day++)
		{
			salary=emphrs*emprateperhr;
			totalsalary=totalsalary+salary;
		}
		System.out.println("total salary for 100hrs and 20 working days is:"+totalsalary);
	}
}
