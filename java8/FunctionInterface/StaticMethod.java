package FunctionInterface;

public class StaticMethod {
    interface vehicle {
        void start(); // abstract method

        // default method (java 8)
        default void fuelType()
        {
            System.out.println("petrol vehicle");
        }

        static void serviceInfo()
        {
            System.out.println("Service every 6 months");
        }
    }

     static class Car implements vehicle {
        public void start() {
            System.out.println("car started");
        }

    }


    }

