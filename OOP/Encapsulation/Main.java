package OOP.Encapsulation;

public class Main {
    public static void main(String[] args) {
        Person obj = new Person("Steve");
        obj.getName();

        obj.setName("Alex");
        obj.getName();
    }
}
