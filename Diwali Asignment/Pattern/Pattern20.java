public class Pattern20
{
    public static void main(String[] args)
	{
        for(int i=1;i<=7;i++) 
        {
			for(int j=1;j<i;j++) 
            {
                System.out.print(" ");
            }
			for(int j=i;j<=7;j++) 
            { 
                System.out.print(j); 
            } 
            System.out.println(); 
        } 
		for(int i=7-1;i>=1;i--) 
        {
			for(int j=1;j<i;j++) 
            {
                System.out.print(" ");
            }
            for(int j=i;j<=7;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}



/* D:\CDAC\OOPs\Assignment\Diwali Gift>java Pattern20.java
1234567
 234567
  34567
   4567
    567
     67
      7
     67
    567
   4567
  34567
 234567
1234567 */