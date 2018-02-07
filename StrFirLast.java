import java.util.*;
class StrFirLast {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=s.nextLine();
		char[] ch=name.toCharArray();
		char u=Character.toUpperCase(ch[0]);
		System.out.println(u+""+ch[ch.length-1]);
	}
}