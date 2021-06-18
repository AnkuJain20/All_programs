package important.misc;

public class CountNumberOfObjects {
 public  static int count = 0;
   public int count1 =0;
//here static variable we are using, so its value will be updated only, memory will create only once.

    CountNumberOfObjects(){
        count++;
    }

    public static   int getNumberOfObjects() {
        return count;
    }

    int getCount(){
        System.out.println(this);
//        this holds the address of current object.
//    here we are printing the address of this which is same as of addredd of c1 because it is refrring to c1 only.
        return this.count;
//    after return no statement get executed. return is the last statement.

    }

    public static void main(String[] args) {
        CountNumberOfObjects obj1 = new CountNumberOfObjects();
        CountNumberOfObjects obj2 = new CountNumberOfObjects();

        //Using static method
        int numberOfObjects = CountNumberOfObjects.getNumberOfObjects();
        System.out.println("Number of Objects::" + numberOfObjects);

        //Using any object, since count is static variable and shared by all objects
        int countObject = obj2.getCount();
        System.out.println("Number of objects:: " + countObject);

        System.out.println("----------------");



    }

}

