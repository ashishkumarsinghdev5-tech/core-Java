class Person {
    String name;
    String city;
    Passport pass;

    Person(String name1 , String city1 , Passport pass1){
    name=name1;
    city=city1;
    pass=pass1;
    }

    public void getDetails(){
        System.out.println("Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Passport Number: " + pass.number);
        System.out.println("Passport Validity: " + pass.validity);

        System.out.println("-------------------------");
        System.out.println(pass);
    }
}

 class Passport {
    String number;
    String validity;
    Passport(String number1 , String validity1 ){

        number=number1;
        validity=validity1;
    }
}
public class Employee{
    public static void main(String[] args) {
        Passport pass1 = new Passport("1727162721" ,"7364364");
        Person p1 = new Person("ashu","agra",pass1);
        p1.getDetails();

        Passport pass2 = new Passport("1727162721" ,"7364364");
        Person p2 = new Person("abhish","agra",pass2);
        p2.getDetails();




    }
}
