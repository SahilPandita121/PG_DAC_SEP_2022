import java.util.Scanner;
class Q8{
public static void main(String args[])
{
	int z=0,rev=0,revdigit,Digits=0,number;
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter number = ");
	number=sc.nextInt();
	
while(number > 0)  //AS WE DONT THE HOW MUCH DIGITS OF NUMBER WILL BE THAT IS NUMBER OF ITERATIONS HENCE WE USE WHILE
{  
  
revdigit = number % 10;  

rev =(rev*10)+revdigit;

number = number / 10;  
}  
Digits=rev;
System.out.println("Digits are =");
while(Digits>0)
{
z=Digits%10;
System.out.println(z);
Digits=Digits/10;
}
}
}