package CoreJava;

class Box<T> {
    private T content;

    public Box(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public void displayBoxInfo() {
        System.out.println("Box content: " + content);
    }
}

public class GenericsExample {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>(42);
        integerBox.displayBoxInfo();

        Box<String> stringBox = new Box<>("Hello, Generics!");
        stringBox.displayBoxInfo();

        Box<Double> doubleBox = new Box<>(3.14);
        doubleBox.displayBoxInfo();
    }
}
