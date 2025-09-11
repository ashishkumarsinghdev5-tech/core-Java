package FunctionInterface;

import java.util.Optional;

public class OptionClassDemo
{
    public String getUsernameById(Integer id)
    {
        if (id == 100) {
            return "Rahul";
        }
        else if (id == 101 ) {
           return " Lamb";
        } else if (id == 103)
        {
            return "sohan";
        }
        else {
            return null;
        }
    }
    public Optional<String>getUsername(Integer id)
    {
        String name = null;
        if (id == 100 )
        {
            name = " raju";
        }
        else if (id == 101)
        {
            name = " ram";
        } else if (id== 102)
        {
            name = " kajal";
        }
        return Optional.ofNullable(name);
    }

}
