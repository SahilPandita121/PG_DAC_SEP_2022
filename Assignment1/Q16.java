import java.util.Scanner;
    class Q16{
	 public static void main(String args[]){
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter Number a = ");
	     int a=sc.nextInt();
	     System.out.println("Enter Number b = ");
	     int b=sc.nextInt();
		 int lcm=1;
		 int i=1,common=1,c=1;
		 
		 if(a>b)
		 {
		     c=a;
		 }
		 else
		 {
		    c=b;
		 }
		 
		 for(i=2;i*i<=c;i++)
		    {
			    while(a % i == 0 && b % i == 0)
			    {
			        a=a/i;
			        b=b/i;
			        common=common*i;
			        c=c/i;
			    }
			}
			     lcm=common*a*b;
				 System.out.println("LCM of two numbers is equal to  "+lcm);
		}
}		

