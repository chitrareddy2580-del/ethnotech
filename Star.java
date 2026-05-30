
/*
import java.util.*;
 class Star 
 {
    public static void main(String[] args) 
	{
        int n=5;

        for (int i=1;i<=n;i++) 
		{
            for (int j=1; j<=i;j++) 
			{
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


import java.util.*;
class Star{
	public static void main(String[] args)
	{
		int n=300;
		switch(n)
		{
			case 300:
			System.out.print("pay 100");
			break;
			case 200:
			System.out.print("no bill");
			break;
			case 1000:
			System.out.print("pay 200");
			break;
			default:
			System.out.print("no bill");
			
		}
	}
}*/
import java.util.Scanner;
 class Star{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1;i<=n;i++) 
		{
            for (int j=1;j<=n-i;j++) 
			{
                System.out.print(" ");
            }
            for (int k=1;k<=(2*i-1);k++) 
			{
                System.out.print("*");
            }
            System.out.println();
        }
    }
}