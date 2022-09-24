import java.util.Scanner;
class Q12{
public static void main(String args[])
{
	int c=0,m,i,n;
	Scanner sc =new Scanner(System.in);
	System.out.print("Enter first number = ");
	n=sc.nextInt();
	c=n;
	System.out.print("Enter second number = ");
	m=sc.nextInt();
	for(i=0;i<m;i++)
	{
	c++;
	}
	System.out.println("Addition of "+n+" and " +m+ " is "+c);
}
}