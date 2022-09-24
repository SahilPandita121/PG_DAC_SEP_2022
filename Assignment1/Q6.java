import java.util.Scanner;
class Q6{
public static void main(String args[])
{
	int n,a=0;
	Scanner sc =new Scanner(System.in);
	System.out.print("Enter Year= ");
	n=sc.nextInt();
	if(n%100==0)
	{
		if(n%400==0)
		{	
			if(n%4==0)
			System.out.println("Leap Year");
		}
		else
		System.out.println("Not a leap year");
	}
	
	if(n%100!=0)
	{
		if(n%4==0)
		System.out.println("Leap Year");
		else
		System.out.println("Not a leap year");
	}

}
}