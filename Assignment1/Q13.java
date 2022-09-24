import java.util.Scanner;
class Q13{
public static void main(String args[])
{
	int n,a=0;
	Scanner sc =new Scanner(System.in);
	System.out.print("Enter number= ");
	n=sc.nextInt();
	while(n>0)
	{
		a=n%10;
		n=n/10;
		System.out.print(a);
	}
	
}
}