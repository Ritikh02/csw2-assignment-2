/*. Write a program to create a Car class with member variables model, color,
and speed. Add the respective method and constructor to it. Create a
driver class in that class and create two car objects. Compare the car
objects according to their speed and print the details of the car that has
a greater speed.
Note: Overload compareTo method of Comparable interface. */


class Car implements Comparable<Car> {
    private String model;
    private String color;
    private double speed;

    public Car(String model, String color, double speed) {
        this.model = model;
        this.color = color;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public double getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "Model: " + model + ", Color: " + color + ", Speed: " + speed + " km/h";
    }

    @Override
    public int compareTo(Car otherCar) {
        if (this.speed > otherCar.speed) {
            return 1;
        } else if (this.speed < otherCar.speed) {
            return -1;
        } else {
            return 0;
        }
    }
}

public class A2Q3 { //CarDriver class
    public static void main(String[] args) {
        Car car1 = new Car("Toyota Camry", "Silver", 180);
        Car car2 = new Car("Honda Civic", "Black", 200);

        int comparison = car1.compareTo(car2);
        if (comparison > 0) {
            System.out.println(car1.getModel() + " is faster than " + car2.getModel());
            System.out.println("Details of the faster car: " + car1);
        } else if (comparison < 0) {
            System.out.println(car2.getModel() + " is faster than " + car1.getModel());
            System.out.println("Details of the faster car: " + car2);
        } else {
            System.out.println("Both cars have the same speed.");
        }
    }
}
