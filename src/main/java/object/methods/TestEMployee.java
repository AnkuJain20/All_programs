package object.methods;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TestEMployee {
    public static void main(String[] args) {
        Object o1 = new Object();
//        System.out.println("hashcode of obect: " + o1.hashCode());
//        System.out.println("obect: " + o1);
//
        Employee e1 = new Employee(1,"name1");
        System.out.println("hashcode of e1 = " + e1.hashCode());

        Employee e2 = new Employee(1,"name1");
        System.out.println("hashcode of e2 = " + e2.hashCode());

        Employee e3 = new Employee(1,"name3");

        System.out.println("is e1 equals to e2 = " + e1.equals(e2));
        System.out.println("is e1 refernce e2 = " + (e1 ==e2));

        System.out.println("ToString of e1 = " + e1); //e1.toString()

        Set<Employee> employees = new HashSet<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);

        System.out.println("values in set");
        for(Employee e: employees){
            System.out.println(e);
        }




//        Map<Employee, String> myMap = new HashMap<>();
//        myMap.put(e1,"Dept1");
//        myMap.put(e2,"Dept2");
//
//
//        printMap(myMap);



    }

    private static void printMap(Map<Employee, String> myMap) {
        Set<Employee> keySet = myMap.keySet();

        for(Employee key: keySet){
            System.out.println(key + "----" + myMap.get(key));
        }

    }
}
