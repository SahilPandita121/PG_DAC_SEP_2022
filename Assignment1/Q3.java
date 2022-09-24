import java.util.*;
class Q3
{
public static void main(String args[])
{
Scanner sc =new Scanner(System.in);
int n=sc.nextInt();
int result=Fact(n);
System.out.println(result);





}
 static int Fact(int n){      
          if (n == 1)      
            return 1;      
          else      
            return(n *Fact(n-1));      
    } 

}
