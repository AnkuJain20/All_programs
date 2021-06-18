package pojo.ques;


public class Employee {
    private String fname;
    private String lname;
    private int salary;

    public Employee(String fname, String lname, int salary) {
        this.fname = fname;
        this.lname = lname;
        this.salary = salary;
    }

    Employee(){

    }

    //    every class extends object class bydefaul. so tostring() method is defined in object class and we can use it.
//when we were printing employee object, it was showing address but when we use tostring() it will return whatever we will write in that method.
//    @Override
//    public String toString() {
//        return "fname: " + fname + " lastName:" + lname;
//    }

//    public void printEmpObjMember(){
//        System.out.println("Emp1:: Fname:" + this.getFname() + " lastname: " + this.getLname() + " salary: " + this.getSalary());
//    }

    @Override
    public String toString() {
        return "First name:" + this.getFname() + " last name: " + this.getLname() + " salary: " + this.getSalary();
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public int getSalary() {
        return salary;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        Employee emp = new Employee();

        //Encapsulation
        emp.setFname("fname2");
    }
}

