class Thread1 extends Thread
{
public void run()
{
for(int i=0;i<=5;i++)
{
System.out.println("Thread1:"+ i);
}
}
}
class Thread2 extends Thread
{
public void run()
{
for(int j=0;j<=5;j++)
{
System.out.println("Thread2:"+ j);
}
}
}
class Thread3 extends Thread
{
public void run()
{
for(int k=0;k<=5;k++)
{
System.out.println("Thread3:"+ k);
}
}
}
class MultiThreadDemo
{
public static void main(String args[])
{
Thread1 t1=new Thread1();
Thread2 t2=new Thread2();
Thread3 t3=new Thread3();
t1.start();
t2.start();
t3.start();
for(int i=0;i<=5;i++)
{
System.out.println("main thread:"+ i);
}
}
}