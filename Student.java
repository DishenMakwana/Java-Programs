import java.util.*;
public class Student
{
	public static void main(String[] args)
	{
		
		Scanner inp = new Scanner(System.in);
		int[][][] a = new int[5][3][2];

		System.out.println("Enter Marks");

		for(int i=0;i<5;i++)
		{
			System.out.println("Enter Marks of Student"+(i+1));
			for(int j=0;j<3;j++)
			{
				for(int k=0;k<2;k++)
					a[i][j][k] = inp.nextInt();
			}
		}
		
		int sum=0;
		int[] total = new int[5];
		for(int i=0;i<5;i++)
		{
			sum=0;
			for(int j=0;j<3;j++)
			{
				for(int k=0;k<2;k++)
				{
					sum += a[i][j][k];
				}
			}
			System.out.println("Score of Student "+(i+1)+" is: "+sum);
			total[i] = sum;
		}

		int[] rank = new int[10];
		/*
		for(int i=0;i<5;i++)
		{
			rank[i*2+1] = i+1;
			int max = total[i];
			for(int j=i;j<5;j++)
			{
				if(max<total[j])
				{
					rank[i*2] = j;
						int temp = max;
					max = total[i];
					total[i] = temp;
				}
			}
		}
		*/

		Arrays.sort(total);

		for(int i=0;i<5;i++)
		{
			System.out.println("\nDetails of Student"+(rank[i+1]));
			System.out.println("Rank of Student: "+(i+1));						
			System.out.println("Total score of Student is: "+total[i]);
		}
}
}