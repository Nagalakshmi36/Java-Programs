public class EmpPresentAbsent
{
	public static void main(String args[])
	{
		double randomVar=Math.floor(Math.random()+10)%2;
		System.out.println(randomVar);
		int check = (int) randomVar;
		 System.out.println(check);
		if(check==0)
		{
			System.out.println(" Employee is Absent");
		}
		else if(check==1)
		{
			System.out.println("Employee is Present");
		} 
	}
}
