package important.misc;

public class StaticExample {
    int rollNo;
    String name;
    static String collegeName = "Holkar";
    static String cityName;

    static {
        cityName = "Indore";
        System.out.println("In stating block");
    }

   static void change(){
       collegeName= "GS";
   }
   StaticExample( String n, int r){
      this.rollNo=r;
      this.name=n;
   }

   void display(){
       System.out.println(" Student Name "+ name +"  rollno  "+ rollNo + " College name is "+ collegeName);
   }
}
