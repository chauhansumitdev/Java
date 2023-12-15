package OOP.Polymorphism;

public class Square extends Shape {
    public void print(){
        System.out.println("This is in Square class");
    }

    public void print(String str){
        System.out.println("Overloaded method "+ str);
    }
}
