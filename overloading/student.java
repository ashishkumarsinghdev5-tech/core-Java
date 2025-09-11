public class student
{
    int RollNo;
    int String;
    student(int rollNo1,String name )
    {
       RollNo = rollNo1;
       name = name ;

    }
    void show ()
    {
        System.out.println("RollNo: "+" &Name : ");
    }

    public static void main(String[] args)
    {
       student s1 = new student(101,"Ashish");
       student s2 = new student(102 ,"Amit");
       student s3 = new student(103 , "Rakesh");
       s1.show();
       s2.show();
       s3.show();
    }
}
