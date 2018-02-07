public class GenericEx
{
	public static void main(String[] aa)
	{
		MyGeneric<Integer> mobji=new MyGeneric<Integer>();
		MyGeneric<String> mobjs=new MyGeneric<String>();
		mobji.add(20);
		mobjs.add("MY DUDE");
		System.out.println(mobji.getVal());
		System.out.println(mobjs.getVal());
	}
}
class MyGeneric<T>
{
	private T num;
	public void add(T num)
	{
		this.num=num;
	}
	public T getVal()
	{
		return num;
	}
}