package OOP.Abstraction;

public abstract class Shape {

    public abstract void area(); //abstract method

    public void print(){   // concrete method
        System.out.println("Hi from Shape class");
    }
}
