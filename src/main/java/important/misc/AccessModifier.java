package important.misc;

  public class AccessModifier {

        public int publicVariable;
        int defaultVariable = 10;
        private int privateVariable = 15;
        protected int protectedVariable = 20;


    public void publicMethod(){
        System.out.println("public method");
    }
    void defaultMethod(){
        System.out.println(" default method");
    }
    private   void privateMethod(){
        System.out.println(" private Method");
    }
    protected void protectedMethod(){
        System.out.println("protected method");
    }
}
