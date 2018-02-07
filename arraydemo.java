import java.util.*;
class arraydemo
{
	public static void main(String[] aa)
	{
		Scanner s=new Scanner(System.in);
		int[] marks=new int[5];
		for(int i=0;i<5;i++)
		{
			marks[i]=s.nextInt();
		}
		for(int j=0;j<5;j++)
		{
			System.out.println(marks[j]);
		}
	}
}