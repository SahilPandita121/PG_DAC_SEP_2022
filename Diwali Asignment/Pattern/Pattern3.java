class Pattern3
{
	public static void main(String args[])
	{
		int count=0;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				count=count+1;
				System.out.print(count+" ");
			}
			System.out.println();
		}
	}
	
}


/* D:\CDAC\OOPs\Assignment\Diwali Gift>java Pattern3
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15 */