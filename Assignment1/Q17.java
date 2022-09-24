import java.util.Scanner;
class Q17{
public static void main(String args[])
{
	int n,z=0,sum=0,a=0;
	Scanner sc =new Scanner(System.in);
	System.out.print("Enter number= ");
	n=sc.nextInt();
	int temp=n;
	while(n>0)//121
	{
		a=n%10;//1 //2 //1
  		n=n/10;//12 //1 //
		sum=(sum*10)+a;//1 //121   
		
	}
	
	if(sum==temp)
	System.out.println("The number is palindrome");
	else
	System.out.println("The number is not palindrome");
}
}