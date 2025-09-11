public class keyword
{
    int no =10 ;
    String name ;
    void m1 (int no, String name)
    {
        //this.no = no ;
       // this.name = name ;
       //  System.out.println(" i am m1 method :" + this);
        // this is current method use on
        System.out.println(this.no);
    }
    public static void main(String[] args)
    {
       keyword ob = new keyword();
       // System.out.println(" i am main method :" + ob );
        ob.m1(20);
        System.out.println(ob.no);
    }
}
