//. boolean contains(Object element):
import java.util.ArrayList;


public class ArrayListMethods2 {

    public static void main(String args[]) {

        ArrayList<Integer> aList = new ArrayList<Integer>();

        // use add() method to add elements in the list

        aList.add(7);
        aList.add(2);
        aList.add(9);

        //Checking contains method

        boolean flag1 =  aList.contains(2);
        if (flag1 == true) {
            System.out.println("aList contains element 2");
        }else{
            System.out.println("aList doesn't contains element 2");
        }

        boolean flag2 = aList.contains(5);

        if (flag2 == true) {
            System.out.println("aList contains element 5");
        } else{
            System.out.println("aList doesn't contains element 5");
        }


//void ensureCapacity(int minCapacity):

          ArrayList<Integer> aList1 = new ArrayList<Integer>(3);

        // use add() method to add elements in the list

        aList1.add(5);
        aList1.add(2);
        aList1.add(9);

        //this method will increase the capacity to 20

        aList1.ensureCapacity(20);

        System.out.println("Array List Number = " + aList1);


//Object get(int index):


     ArrayList<Integer> aList2 = new ArrayList<Integer>(5);

        // use add() method to add elements in the list

        aList2.add(7);
        aList2.add(11);
        aList2.add(13);

        System.out.println("Array List Number = " + aList2);



        //  element at 2nd postion
        int value = aList2.get(2);
        System.out.println("Element Retrieved at index 2 i.e. 3rd position = " + value);

//. int indexOf(Object o):

            ArrayList<String> aList3 = new ArrayList<String>(5);

        // use add() method to add elements in the list

        aList3.add("Learning");
        aList3.add("JAVA");
        aList3.add("ABHIANDROID");


        System.out.println("Array List String = " + aList3);


        //  using IndexOf Method
        int value1 = aList3.indexOf("JAVA");
        System.out.println("Index Retrived of JAVA = " + value1);
        
        System.out.println("AT is not present so it will print index as -1");
        
        int value2 = aList3.indexOf("AT");
        System.out.println("Index Retrived of AT = " + value2);

//int lastIndexOf(Object o):

      ArrayList<String> aList4 = new ArrayList<String>(5);

        // use add() method to add elements in the list

        aList4.add("A");
        aList4.add("B");
        aList4.add("C");
        aList4.add("D");
        aList4.add("E");
        aList4.add("F");
        aList4.add("C");
        aList4.add("D");
        
        System.out.println("ArrayList: "+aList4);

        //Getting index of Last C in ArrayList

        int index1 = aList4.lastIndexOf("C");

        System.out.println("index of Last C in ArrayList: " + index1);
        
        int index2 = aList4.lastIndexOf("D");
        System.out.println("index of Last D in ArrayList: " + index2);

//Object remove(int index):


    ArrayList<String> aList5 = new ArrayList<String>(5);

        // use add() method to add elements in the list

        aList5.add("LEARNING");
        aList5.add("JAVA");
        aList5.add("ABHIANDROID");
        System.out.println("String ArrayList = " + aList5);

        //using Remove method

        aList5.remove(2);
        System.out.println("ArrayList After Removing Element at index 2= "+ aList5);


    }

}
