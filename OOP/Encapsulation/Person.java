package OOP.Encapsulation;

public class Person {
    private String name;

    Person(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
        System.out.println("The name is changed!");
    }

    public void getName(){
        System.out.println(this.name);
    }
}
