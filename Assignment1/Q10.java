import java.util.Scanner;
class Q10{
public static void main(String args[])
{
	int sum=0,digit,number;
	Scanner sc =new Scanner(System.in);
	System.out.print("Enter number= ");
	number=sc.nextInt();
	
while(number > 0)  //AS WE DONT THE HOW MUCH DIGITS OF NUMBER WILL BE THAT IS NUMBER OF ITERATIONS HENCE WE USE WHILE
{  
  
digit = number % 10;  

sum = sum + digit;  

number = number / 10;  
}  

System.out.println("Sum of Digits: "+sum);  
}  
}
