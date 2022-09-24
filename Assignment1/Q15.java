import java.util.*;
class Q15
{
public static void main(String args[])
{
Scanner sc =new Scanner(System.in);
System.out.println("Enter Number a = ");
int n=sc.nextInt();
System.out.println("Enter Number b = ");
int m=sc.nextInt();
int gcd=1;
for(int i=2;i<n&&i<m;i++)
{
	if(n%i==0&&m%i==0)
	{
		gcd=i;
	}
}
int lcm=0;
lcm=(n*m)/gcd;
System.out.println("Lcm is = "+lcm);
}
}