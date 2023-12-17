package CoreJava;

/**
 * Car
 */
interface Car {
    void name(String name);
    
}

public class LambdaExp {
    public static void main(String[] args) {
        Car mycar = (name) -> {
            System.out.println(name);
        };

        mycar.name("Iam getting implementd");
    }
}
