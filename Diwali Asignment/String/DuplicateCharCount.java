import java.util.*;
public class DuplicateCharCount 
{
	static final int NO_OF_CHARS = 256;

	static void fillCharCounts(String str,int[] count)
	{
		for (int i=0;i<str.length();i++)
			count[str.charAt(i)]++;
	}
	static void printDups(String str)
	{
		int count[] = new int[NO_OF_CHARS];
		fillCharCounts(str, count);
		for (int i = 0; i < NO_OF_CHARS; i++)
			if (count[i] > 1)
				System.out.println((char)(i)+" -> count = " + count[i]);
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String :-");
        String str =sc.nextLine();
		printDups(str);
	}
}

/* 
D:\CDAC\OOPs\Assignment\Diwali Gift\String>java DuplicateCharCount
Enter String :-heeelllloo
e -> count = 3
l -> count = 4
o -> count = 2

 */