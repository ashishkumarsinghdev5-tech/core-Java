package Linklist;

import HashMap.Student;

public class Demo2
{
    String name ;
    int id ;
    int Rank ;
    public Demo2(int id, String name ,int Rank  )
    {
        this.name = name;
        this.id = id ;
        this.Rank = Rank ;

    }

    @Override
    public String toString()
    {
        return "Demo2[ id =" +id + ",name =" +  name + " , Rank = " + Rank+ "]";
    }



    }

