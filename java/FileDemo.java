import java.io.*;
public class FileDemo
{
public static void main(String args[])
{
String fname=args[0];
File f=new File(fname);
System.out.println("path"+f.getPath());
System.out.println("parent"+f.getAbsolutePath());
System.out.println("parent"+f.getParent());
System.out.println("exists"+f.exists());
if(f.exists())
{
System.out.println("is writable"+f.canWrite());
System.out.println("is Readable"+f.canRead());
System.out.println("is directry"+f.isDirectory());
System.out.println("size of the file"+f.length());
}
}
}