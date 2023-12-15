package OOP.ObjectClasses;

public class CarMaker {
    public static void main(String[] args) {
        Car obj = new Car("newCar", 2023);

        System.out.println(obj.getName());
        System.out.println(obj.getYear());
    }    
}
