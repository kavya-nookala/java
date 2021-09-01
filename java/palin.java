class palin
{
public static void main(String args[])
{
String s=args[0];
String s1="";
int l,j;
l=s.length();
for(j=l-1;j>=0;j--)
{
s1=s1+s.charAt(j);
}
if(s.equals(s1))
System.out.println("string "+s+" is palindrome");
else
System.out.println("string "+s+" is not palindrome");
}
}