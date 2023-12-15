package OOP.Inheritance;

public class Main {
    public static void main(String[] args) {
        
        Animal normalAnimal = new Animal("Simple Animal");
        normalAnimal.sound();

        Dog dog = new Dog("Dog","Retriever");
        dog.sound();
    }
}
