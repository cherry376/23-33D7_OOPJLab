// Define the Car class
class Car {
    // Instance variables
    String color="Red";
    String model="BMW";
    int year=2023;

    // Method to display car details
    void displayDetails() {
        System.out.println("Car Model: " +model);
        System.out.println("Car Color: " + this.color);
        System.out.println("Car Year: " + year);
    }


    public static void main(String[] args) {
        // Create an object of the Car class
        Car myCar = new Car();

        // Invoke methods on the Car object
        myCar.displayDetails();
    }
}