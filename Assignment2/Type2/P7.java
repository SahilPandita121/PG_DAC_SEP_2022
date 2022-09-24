class P7{
	public static void main(String args[]){
for(int k=1;k<=5;k++)
{
	
	
	
	
	
	for(int i=5;i>k;i--)
	{
		System.out.print(" ");
	}
	
	for(int j=1;j<=k;j++)
	{
		System.out.print("*");
	
	}

	for(int l=1;l<k;l++)
	{
		System.out.print("*");
	}
	
	System.out.println();
	
}
for(int k=1;k<=5;k++)
{
	for(int i=0;i<k;i++)
	{
		System.out.print(" ");
	}
	for(int l=4;l>k;l--)
	{
		System.out.print("*");
	}
	for(int j=4;j>=k;j--)
	{
		System.out.print("*");
	
	}
	for(int i=1;i<k;i++)
	{
		System.out.print(" ");
	}
	System.out.println();
}	
}	
}