import java.util.*;
class ExceptionHandle
{
	public static void main(String args[])
	{
		try
		{
			String sname[]={"rohit","ram","rahul","sam","shiva"};
			int smarks[]={52,67,85,42,25};
			for(int i=0;i<=sname.length;i++)
			{
				System.out.println(sname[i]+" Mark is "+smarks[i]);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		
		}			
	}
}