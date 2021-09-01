//19n31a05e4 inner class(regular)
class outer
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
outer o=new outer();
o.outermethod();
outer.inner i=new outer().new inner();
i.innermethod();
}
}