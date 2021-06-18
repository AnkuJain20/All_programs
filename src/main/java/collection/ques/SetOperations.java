package collection.ques;

import pojo.ques.Employee;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetOperations {



    private static void createLinkedHashSetOfEmployeeObject() {
        Employee emp1 = new Employee("fname1","lnme1",100 );
        Employee emp2 = new Employee("fname2","lnme2",200 );
        Employee emp3 = new Employee("fname3","lnme3",300 );

        LinkedHashSet<Employee> employeeLinkedHashSet = new LinkedHashSet<>();
        employeeLinkedHashSet.add(emp1);
        employeeLinkedHashSet.add(emp2);
        employeeLinkedHashSet.add(emp3);

        for(Employee emp: employeeLinkedHashSet){
            System.out.println(emp);
        }

    }

    private static void convertHashSetToArray() {
        HashSet<String> hset = new HashSet<>();
        hset.add("Delhi");
        hset.add("Indore");
        hset.add(" Kota");
        hset.add(" jaipur");

        String [] arr = new String[hset.size()];
        hset.toArray(arr);

        for(int i=0; i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    private static void createHashSetAndPrint() {
        HashSet<String> hset = new HashSet<>();
        hset.add("Delhi");
        hset.add("Indore");
        hset.add(" Kota");
        hset.add(" jaipur");

        hset.add(" ");
        System.out.println(hset);
        hset.remove(" Kota");
        boolean isCityExist = hset.contains(" jaipur");
        System.out.println("IsExists::" +  isCityExist);
        System.out.println(hset);


//To Print using for loop
//        for(String city: hset){
//            System.out.print(city + " ");
//        }

    }

    private static void createTreeSetOfInteger() {
        //Automatically orders the items inside the set.
        TreeSet<Integer> tset = new TreeSet<>();
        tset.add(22);
        tset.add(4);
        tset.add(18);
        tset.add(12);
        System.out.println(tset);
        tset.pollFirst();


        tset.pollLast();
        System.out.println(tset);
    }

    public static void main(String[] args) {

        SetOperations.createHashSetAndPrint();

        SetOperations.convertHashSetToArray();

        SetOperations.createLinkedHashSetOfEmployeeObject();

        SetOperations.createTreeSetOfInteger();
    }

}
