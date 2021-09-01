abstract class A
{
abstract void show();
void display()
{
System.out.println("normal");
}
}
class B extends A
{
void show()
{
System.out.println("abstract method");
}
public static void main(String args[])
{
B o=new B();
o.show();
o.display();
}
}