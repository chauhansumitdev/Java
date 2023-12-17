package CoreJava;

// combining simple types and objects to build more complex ones

class Engine {
    public void start() {
        System.out.println("Engine started");
    }
}

class Car {
    private Engine engine; 

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void startCar() {
        engine.start();
        System.out.println("Car started");
    }
}

public class Composition {
    public static void main(String[] args) {
        Engine carEngine = new Engine();
        Car myCar = new Car(carEngine);

        myCar.startCar();
    }
}
