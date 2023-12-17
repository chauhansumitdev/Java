package CoreJava;

// containing instance of many classes

class Engine {
    // Engine class definition
}

class Car {
    private Engine engine; // Aggregation - Car has an Engine

    public Car(Engine engine) {
        this.engine = engine;
    }

    // Other methods, getters, setters, etc.
}
