public class DuplicateOutFunc
{
public static void main(String [] args)
{

String str="kalaikko";
int counter=0;
int upper=0;
char [] ctr=str.toCharArray();
System.out.println("The repeated letters are");

for(int i=0;i<str.length();i++)
{
for(int j=i+1;j<str.length();j++)
{
if(ctr[i] == ctr[j])
{
//Character.getNumericValue(ctr[j]);
int k=(int)ctr[j];
int m=k-32;
char l=(char)m;

System.out.println(l);
counter ++;
break;
}
}
}
System.out.println(counter);
}
}
