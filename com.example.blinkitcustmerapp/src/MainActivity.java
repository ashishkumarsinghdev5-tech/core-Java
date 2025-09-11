import com.example.blinkitcustomerapp.location.LocationHelper;
import com.example.blinkitcustomerapp.utils.PermissionUtil;
public class MainActivity
{
    public static void main(String[] args)
    {
        System.out.println("Blinkit Customer App Started!");
    }
    //Permissions check
    if (PermissionUtil.checkLocationPermission())
    {
        //location fetch
        String userLocation= LocationHelper.getUserLocationPermission();
        System.out.println("user location :" + userLocation);
    }
    else

    {
        System.out.println("Location permission not granted!");
    }

}

