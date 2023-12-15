package OOP.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shape obj = new Square();
        obj.print();

        Square obj2 = new Square();
        obj2.print("Rectangle");
    }
}
