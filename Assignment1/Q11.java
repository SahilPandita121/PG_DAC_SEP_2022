import java.util.Scanner;
class Q11{
public static void main(String args[])
{
	int a,b,c;
	Scanner sc =new Scanner(System.in);
	System.out.print("Enter 1st number= ");
	a=sc.nextInt();
	System.out.print("Enter 2nd number= ");
	b=sc.nextInt();
	System.out.print("Enter 3rd number= ");
	c=sc.nextInt();
	if(a<b&&a<c)
	{
		 
		System.out.println("1st number is Smallest");
		
		 }
		
	
	else if(b<a&&b<c)
	{
	   	 
		System.out.println("2nd number is Smallest");
		
		 }
		 
	else
	{
	System.out.println("3rd number is Smallest");
	
	}
	
}
}