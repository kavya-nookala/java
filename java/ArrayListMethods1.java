import java.util.ArrayList;
public class ArrayListMethods1 {
public static void main(String[] args) {
       //Integer ArrayList
ArrayList<Integer> aList = new ArrayList<Integer>();
aList.add(5);
aList.add(11);
aList.add(17);
System.out.println("Integer Number Added in ArrayList= " + aList);
//String ArrayList
ArrayList<String> sList = new ArrayList<String>();
sList.add("Learning");
sList.add("JAVA");
System.out.println("String Added in ArrayList= "+ sList);

//. void add(int index, Object element)

//Integer ArrayList
        ArrayList<Integer> aList1 = new ArrayList<Integer>(7);

        aList1.add(1);
        aList1.add(5);
        aList1.add(9);

        // adding element 25 at 3rd position which is index 2
        aList1.add(2,25);

        System.out.println("Integer List After 25 added at index 2 = " + aList1);

        //String ArrayList

        ArrayList<String> sList1 = new ArrayList<String>();

        sList1.add("JAVA");
        sList1.add("in");
        sList1.add("second year");

        //Adding Learning String at index 0 i.e. 1st position
        sList1.add(0, "Learning");

        System.out.println("String After Learning Added at index 0 = " + sList1);

//. boolean addAll(Collection c):
  
    //First ArrayList Created
        ArrayList<Integer> aList2 = new ArrayList<Integer>(5);

        // use add() method to add elements in the list

        aList2.add(3);
        aList2.add(5);
        aList2.add(7);

        // let us print all the elements available in aList2
        System.out.println("Printing all elements of  aList2= "+ aList2);

        //Second Arraylist Created
        ArrayList<Integer> aList9 = new ArrayList<Integer>(5);

        aList9.add(9);
        aList9.add(8);
        aList9.add(11);
        aList9.add(12);

        // let us print all the elements available in aList9
        System.out.println("Printing all elements of aList9= "+ aList9);


        // adding alist9 collections to alist2 using addAll method

        aList2.addAll(aList9);
        System.out.println("Printing all the elements of aList1 after using addAll method= "+aList9);
   
    //boolean addAll(int index, Collection c):

           //ArrayList Created
        ArrayList<Integer> aList3 = new ArrayList<Integer>(5);

        // use add() method to add elements in the list
        aList3.add(6);
        aList3.add(4);
        aList3.add(9);

        // let us print all the elements available in aList3
        System.out.println("Printing all elements of  aList3= "+ aList3);

        ArrayList<Integer> aList8 = new ArrayList<Integer>(5);

        aList8.add(11);
        aList8.add(15);
        aList8.add(16);
        aList8.add(19);

        System.out.println("Printing all elements of aList8= "+ aList8);

        // using addAll method to add collections at specific index
        aList3.addAll(2,aList8);
        System.out.println("Printing all the elements of aList3 after using addAll method= "+ aList8);
    

     //. void clear():

             ArrayList<Integer> aList4 = new ArrayList<Integer>();

        // use add() method to add elements in the list
        aList4.add(1);
        aList4.add(2);
        aList4.add(3);

        // let us print all the elements available in aList

        System.out.println("Printing aList items before using clear method= "+aList4);
        System.out.println("Printing size of aList4= " + aList4.size());

        //using clear method

        aList4.clear();
        System.out.println("Printing aList element after using clear method= "+aList4);
        System.out.println("size of aList1 after clear() method= " + aList4.size());


   //Object clone():

   ArrayList<String> aList5 = new ArrayList<String>();

        // use add() method to add elements in the list

        aList5.add("A");
        aList5.add("B");
        aList5.add("C");
        aList5.add("D");

        //Using clone() method to copy aList5 into a new aListCopy Arraylist

        ArrayList<String> aListCopy = (ArrayList<String>) aList5.clone();

        System.out.println("aListCopy elements copied from aList5= "+aListCopy);

}
}
