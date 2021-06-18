package important.misc;

public class CopyCount {

    public  int count = 0;

    public CopyCount() {
count++;
    }
    public int getCount() {
        System.out.println("count is " + count);
        return  count;
    }

    public static void main(String[] args) {
        CopyCount cc = new CopyCount();
        CopyCount c2 = new CopyCount();
        CopyCount c3 = new CopyCount();


        int totalCount = c3.getCount();
        System.out.println(totalCount);
    }

}

