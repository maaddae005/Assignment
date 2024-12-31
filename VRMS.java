//VRMS stands for Vehicle Rental Managemen System
import java.util.Scanner;
// Abstract base class Vehicle
public abstract class Vehicle {
  private String vehicleId;
  private String model;
  private double baseRentalRate;
  private boolean isAvailable;

  public Vehicle(String vehicleId, String model, double baseRentalRate) {
      this.vehicleId = vehicleId;
      this.model = model;
      this.baseRentalRate = baseRentalRate;
      this.isAvailable = true;
  }

  public abstract double calculateRentalCost(int days);

  public abstract boolean isAvailableForRental();

  // Getters and setters with input validation
  public String getVehicleId() {
      return vehicleId;
  }

  public void setVehicleId(String vehicleId) {
      // Add input validation logic here
      this.vehicleId = vehicleId;
  }
  public String getModel() {
    return model;
}

public void setModel(String model) {
    this.model = model;
}

public double getBaseRentalRate() {
    return baseRentalRate;
}

public void setBaseRentalRate(double baseRentalRate) {
    this.baseRentalRate = baseRentalRate;
}

public boolean isAvailable() {
    return isAvailable;
}

public void setAvailable(boolean isAvailable) {
    this.isAvailable = isAvailable;
}

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Get user input for vehicle details
    System.out.println("Enter vehicle ID:");
    String vehicleId = scanner.nextLine();
    System.out.println("Enter model:");
    String model = scanner.nextLine();
    System.out.println("Enter base rental rate:");
    double baseRentalRate = scanner.nextDouble();
    
    // Creating a Car object with the user input
    Car car = new Car(vehicleId, model, baseRentalRate);

    // Display car details
    System.out.println("Car details:");
    System.out.println("Vehicle ID: " + car.getVehicleId());
    System.out.println("Model: " + car.getModel());
    System.out.println("Base Rental Rate: " + car.getBaseRentalRate());

    // Close the scanner after use
    scanner.close();
}
}

  // Other getters and setters for model, baseRentalRate, and isAvailable


// Concrete class Car inheriting from Vehicle
public class Car extends Vehicle {
  // Additional fields and methods specific to Car
  public Car(String vehicleId, String model, double baseRentalRate) {
      super(vehicleId, model, baseRentalRate);
      // Initialize Car-specific fields
  }

  @Override
  public double calculateRentalCost(int days) {
      // Implement rental cost calculation for a Car
      return 0.0; // Placeholder, implement actual logic
  }

  @Override
  public boolean isAvailableForRental() {
      // Implement availability check for a Car
      return false; // Placeholder, implement actual logic
  }
}

// Similar implementations for Motorcycle and Truck classes inheriting from Vehicle

// Interface for Rentable with rent and returnVehicle methods
public interface Rentable {
  void rent(Customer customer, int days);
  void returnVehicle();
}

// Supporting classes like Customer, RentalAgency, RentalTransaction
public class Customer {
  // Customer-related functionalities
}

public class RentalAgency {
  // Rental agency management functionalities
}

public class RentalTransaction {
  // Rental transaction processing functionalities
}