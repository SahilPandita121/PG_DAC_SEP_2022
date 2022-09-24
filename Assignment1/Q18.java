import java.util.Scanner;
class Q18{
public static void main(String args[])
{
	int i,s=0,n,fact=0;
	Scanner sc =new Scanner(System.in);
	System.out.print("Enter number = ");
	n=sc.nextInt();
	System.out.print("Prime Factors of "+n+" are = ");
	for(i=1;i<=n;i++)//50
	{
		if(n%i==0)
		{
			fact=i;//2 5 10 25
			for(int l=1;l<=fact;l++)
			{
					if(fact%l==0)
					s++;	
				
			}
				if(s==2)
				{
					System.out.print(fact+" ");
					s++;
				}
				s=0;
		}
	}
}
}