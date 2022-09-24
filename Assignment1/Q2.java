import java.util.Scanner;
class Q2{
public static void main(String args[])
{
int i,a=1,n;
Scanner sc=new Scanner(System.in);
System.out.print("Enter Number = ");
n=sc.nextInt();
for(i=1;i<=n;i++)
{
a=a*i;

}
System.out.println("Factorial of "+n+" is " +a);
}
}