package PropertFileDemo;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class FileDemo
{
    public static void main(String[] args) throws Exception
    {
        FileInputStream fis = new FileInputStream("database.properties");

        Properties p = new Properties();
        p.load(fis); // load all the properties from properties file
        String uname = p.getProperty("uname");
        String pwd = p.getProperty("pwd");
        String driver = p.getProperty("driver"); // key not be present
        System.out.println("username :" + uname);
        System.out.println("password :" + pwd);
        System.out.println("Driver :" + driver); // null

        fis.close();


    }
}
