import java.io.*;
import java.util.*;
public class Phonebook
{
 public static void main(String args[])
 {
try
{
FileInputStream fis=new FileInputStream("D:/e data/kavya ds/file.txt");
Scanner sc=new Scanner(fis).useDelimiter("\t");
Hashtable<String,String> ht=new Hashtable<String,String> ();
String[] strarray;
String a,str;
while(sc.hasNext())
{
 a=sc.nextLine();
 strarray=a.split("\t");
 ht.put(strarray[0],strarray[1]);
 System.out.println("hash table values are"+strarray[0]+":"+strarray[1]);
}
Scanner s=new Scanner(System.in);
System.out.println("enter the name as given in the phone book");
str=s.next();
if(ht.containsKey(str))
{
System.out.println("phone no is"+ht.get(str));
}
else
{
System.out.println("name is not matched");
}
}
catch(Exception e)
{
e.printStackTrace();
}
 
}
}