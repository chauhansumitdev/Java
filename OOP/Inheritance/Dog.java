package OOP.Inheritance;

public class Dog extends Animal{
    private String breed;

    Dog(String name, String breed){
        super(name);
        this.breed = breed;
    }

    // overriding the the funtion of the Animal class

    public void sound(){
        System.out.println("bark!"+ breed);
    }
}
