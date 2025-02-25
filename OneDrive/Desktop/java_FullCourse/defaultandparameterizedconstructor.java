class Car {
    String brand;
    int year;

    // Default Constructor (No Parameters)
    Car() {
        brand = "Toyota";
        year = 2024;
    }

    // Parameterized Constructor
    Car(String b, int y) {
        brand = b;
        year = y;
    }

    // Method to Display Car Details
    void display() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }

    public static void main(String[] args) {
        // Creating an Object using Default Constructor
        Car car1 = new Car();
        car1.display(); // Output: Brand: Toyota, Year: 2024

        // Creating an Object using Parameterized Constructor
        Car car2 = new Car("Honda", 2022);
        car2.display(); // Output: Brand: Honda, Year: 2022
    }
}
