interface Inf1
{
void method1();
}
interface Inf2 extends Inf1
{
void method2();
}
public class Demo implements Inf2
{
public void method1()
{
System.out.println("method 1");
}
public void method2()
{
System.out.println("method 2");
}
public static void main(String args[])
{
Inf2 obj=new Demo();
obj.method1();
obj.method2();
}
}
