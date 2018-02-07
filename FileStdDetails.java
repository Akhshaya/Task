import java.io.*;
import java.util.*;
class FileStdDetails
{
	public static void main(String[] aa)
	{
		try
		{
			FileWriter fos=new FileWriter("E:\\Program\\Studentdetails.txt");
			Scanner s=new Scanner(System.in);
			System.out.println("Enter Array size");
			int n=s.nextInt();
			s.nextLine();
			int i;
			int stdId[]=new int[n];
			String stdName[]=new String[n];
			int stdAge[]=new int[n];
			for(i=0;i<n;i++)
			{
				System.out.println("Enter Student ID "+(i+1));
				stdId[i]=s.nextInt();
				s.nextLine();
				System.out.println("Enter Student Name "+(i+1));
				stdName[i]=s.nextLine();
				System.out.println("Enter Student Age "+(i+1));
				stdAge[i]=s.nextInt();
				s.nextLine();
				//byte[] b=(byte)stdId[i]; //.getBytes();
				//byte[] c=stdName[i].getBytes();
				//byte[] d=(byte)stdAge[i]; //.getBytes();
				fos.write(stdId[i]);
				fos.write(stdName[i]);
				fos.write(stdAge[i]);
				//fos.newLine();
			}
			fos.close();
			System.out.println("Written successfully");
		}
		catch(Exception e) {
			System.out.println("Exception");
		}
	}
}