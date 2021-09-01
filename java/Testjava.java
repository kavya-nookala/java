import java.util.*;
class Testjava
{
public static void main(String args[])
{
ArrayList<String>list=new ArrayList<String>();
list.add("ravi");
list.add("vijay");
list.add("ajay");
Iterator itr=list.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}
}
}