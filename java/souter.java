//19n31a05g2 arun inner class(static)
class souter
{
static class inner
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
inner i=new inner();
i.innermethod();
}
}