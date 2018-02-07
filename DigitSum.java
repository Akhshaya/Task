import java.util.*;
class DigitSum {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=s.nextInt();
		int a,sum=0;
		while(num>0) {
			while(num!=0) {
				a=num%10;
				sum=sum+a;
				num/=10;
			}
			if(sum>=10) {
				num=sum;
				sum=0;
			}
		}
		System.out.println("Sum of the digits:"+sum);
	}
}