//19n31a05g2 arun exception
public class multicatch
{
public static void main(String args[])
{
try
{
int a[]=new int[5];
System.out.println(a[10]);
}
catch(ArithmeticException e)
{
System.out.println("arithmetic exception occurs");
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("ArrayIndexOutOfBounds Exception occurs");
}
catch(Exception e)
{
System.out.println("parent exception occurs");
}
System.out.println("rest of code");
}
}