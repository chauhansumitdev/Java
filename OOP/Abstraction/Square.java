package OOP.Abstraction;

public class Square extends Shape {

    private int length;

    Square(int length){
        this.length = length;
    }

    public void area(){
        System.out.println("The area is "+(length*length));
    }

    public void print(){
        System.out.println("Hi from Square class");
    }
}
