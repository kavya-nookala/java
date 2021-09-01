//19N31A05E4 regular inner class
class outer1
{
class inner
{
void innermethod()
{
System.out.println("inner class method");
}
}
void outermethod()
{
System.out.println("outer class method");
}
public static void main(String args[])
{
outer1 o=new outer1();
o.outer1.outermethod();
outer1.inner i=new outer1().new inner();
i.innermethod();
}
