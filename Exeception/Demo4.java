package Exeception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo4
{
    public static void main(String[] args) throws FileNotFoundException
    {
      Demo4 t2 = new Demo4();
      t2.m1();
    }
    void m1 () throws FileNotFoundException
    {
       m2();
    }
    void m2 () throws FileNotFoundException
    {
        FileInputStream fis = new FileInputStream("");
    }
}
