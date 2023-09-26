
import java.util.Scanner;

class histogram {
	static void pattern(int n) {
		int max = max(n);
		for (int i = max; i >= 1; i--) {
			for (int j = count(n)-1; j >= 0; j--)
				if (digitAtIndex(n, j) >= i)
					System.out.print("*");
				else
					System.out.print(" ");
				System.out.println();
		}
	}
	
	static int digitAtIndex(int n,int j)
	{
		int temp = n,count = 0,digit = 0;
		while(temp != 0)
		{
			if(count==j)
			{
				digit = temp % 10;
			}
			temp /= 10;
			count++;
		}
		return digit;
	}
	
	static int count(int n)
	{
		int temp = n,count = 0;
		while(temp != 0)
		{
			count++;
			temp /= 10;
		}
		return count;
	}

	static int max(int n)
	{
		int max = 0, temp = n;
		while(temp != 0)
		{
			if(max<temp%10)
				max = temp%10;
			temp /= 10;
		}
		return max;
	}
	public static void main(String[] args) {
		int n = 46973;
		pattern(n);
	}
}
