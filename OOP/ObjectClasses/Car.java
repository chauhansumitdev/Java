package OOP.ObjectClasses;


public class Car {

    private String name;
    private int year;

    //using constructor for setting the values of the instance variable
    public Car(String name, int year){
        this.name = name;
        this.year = year;
    }

    // using getter function for retriving the name of the car
    public String getName(){
        return name;
    }

    //using getter function for retriving the year of the car
    public int getYear(){
        return year;
    }
}