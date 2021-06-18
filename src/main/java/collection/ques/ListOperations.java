package collection.ques;

import pojo.ques.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListOperations {

    public static void printListElement(List<String> arrayList){
        System.out.println("\nPrinting arrayList elements: ");
        for(String str: arrayList){
            System.out.print( str + " ");
        }
    }

    public static void convertArrayToList(String[] array){
//     1st Method:: Arrays.aslist
        List<String> arrayList1 = new ArrayList<>(Arrays.asList(array));
        printListElement(arrayList1);

//     2 method::  by using collections.add
        List<String> arrayList2 = new ArrayList<>();
        Collections.addAll(arrayList2, array);
        printListElement(arrayList2);

//    3rd Method:: Manually
        List<String> arrayList3 = new ArrayList<>();
        for(int i =0; i< array.length;i++){
            arrayList3.add(array[i]);
        }
        printListElement(arrayList3);
    }

    public static void convertListToArray(List<String> arrayList){
        String [] arr1 = new String[arrayList.size()];
        arrayList.toArray(arr1);

        //Second method is iterate the arrayList and update the array

    }

    public static void addRemoveFromList(List<String> arrayList) {
        printListElement(arrayList);
        arrayList.remove(2);
        arrayList.add("Name2");
        //arrayList.clear();
    }

    public static void createStringListAndAddElement() {
        List<String> stringList = new LinkedList<>();
        stringList.add("Anku");
        stringList.add("DJ");
        stringList.add("Mishu");
        System.out.println("Printing names in list");
        printListElement(stringList);

        int inx = stringList.indexOf("DJ");
        System.out.println("\n index of DJ is  "+ inx);

    }

    public static void checkElementExistsInList(List<String> arrayList) {
        String nameToSearch = "Anku";
        boolean isExist =  arrayList.contains(nameToSearch);
        System.out.println("\n is "+ nameToSearch +" exist:" + isExist);


    }

    public static void createIntegerListAndAddElement() {
        List<Integer> myList = new ArrayList<>();
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(2, 15);
        myList.set(1,34);
        myList.remove(2);

        for(Integer num: myList){
            System.out.print( num + " ");
        }

        System.out.println("index of 3 is : " + myList.indexOf(3));

    }

    public static void createEmployeeListAndPrintEligibleEmps() {
        Employee emp1 = new Employee("fname1","lnme1",100 );
        Employee emp2 = new Employee("fname2","lnme2",200 );
        Employee emp3 = new Employee("fname3","lnme3",300 );

//        System.out.println(emp1); internally it calls toString method on empClass
//        System.out.println("tostring::" + emp1.toString());

        //Print salary
//        System.out.println("Emp1:: Fname:" + emp1.getFname() + " lastname: " + emp1.getLname() + " salary: " + emp1.getSalary());
//        emp1.printEmpObjMember();
//        System.out.println(emp1);

        List<Employee>  employeeList = new LinkedList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);

        for(Employee emp: employeeList){
            int sal = emp.getSalary();

            if(sal>200){
                System.out.println("Eligible employee :: " + emp);
//                here emp is getting data from tostring method, we dont need to write it explicitely
            } else {
                System.out.println(" Not eligible and name of employee " + emp.getFname());
            }
        }
    }

    public static void main(String[] args) {
        String arrayNames [] = {"Mishu", "Anku", "DJ", "Piyush"};
        List<String> arrayList = new ArrayList<>(Arrays.asList(arrayNames));

        ListOperations.createStringListAndAddElement();

        ListOperations.createIntegerListAndAddElement();

        ListOperations.createEmployeeListAndPrintEligibleEmps();

        ListOperations.convertArrayToList(arrayNames);

        ListOperations.convertListToArray(arrayList);

        ListOperations.addRemoveFromList(arrayList);

        ListOperations.checkElementExistsInList(arrayList);

        ListOperations.sortList(arrayList);

    }

    private static void sortList(List<String> arrayList) {
        System.out.println("Example of collections.sort:");
        Collections.sort(arrayList);
        printListElement(arrayList);
    }
}
