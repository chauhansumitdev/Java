package OOP.Inheritance;

public class Animal {
    protected String name;

    Animal(String name){
        this.name = name;
    }

    public void sound(){
        System.out.println("This animal make sounds " + name);
    }
}
