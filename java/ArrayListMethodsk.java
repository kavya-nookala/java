import java.util.ArrayList;
public class ArrayListMethodsk
{
public static void main(String args[])
{
ArrayList<Integer>alist=new ArrayList<Integer>();
//boolean add
alist.add(5);
alist.add(11);
alist.add(17);
System.out.println("integer number added in arraylist="+alist);
//void add(index,obj)
alist.add(2,25);
System.out.println("integer list after 25 is added at index 2="+alist);
//addall
ArrayList<Integer>alist2=new ArrayList<Integer>();
alist2.add(4);
alist2.add(8);
alist2.add(10);
alist2.add(12);
System.out.println("printing elements of alist="+alist);
System.out.println("printing elements of alist2="+alist2);
alist.addAll(alist2);
System.out.println("printing all elements after using addall method="+alist);
//addall(index,collection)
alist.addAll(3,alist2);
System.out.println("printing all elements of alist using addall method="+alist);
//clear
System.out.println("printing alist2 items before using clear method="+alist2);
System.out.println("printing size of alist2="+alist2.size());
alist2.clear();
System.out.println("printing alist2 items after using clear method="+alist2);
System.out.println("printing size of alist2="+alist2.size());
//clone

}
}
