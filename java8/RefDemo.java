import java.util.function.Supplier;

public class RefDemo // constructor ref
{
    public static void main(String[] args) {
        // Doctor d = new Doctor();
        Supplier<Doctor> s = Doctor::new;
        Doctor doctor = s.get();
        System.out.println(doctor.hashCode());
    }
}
    class Doctor
    {
        public Doctor()
        {
            System.out.println("Doctor Constructor.............");
        }
        public Doctor(int i)
        {
            System.out.println("Doctor Constructor.............");
        }
    }




