package Streams;

public class Greeter implements Greeting
{

    @Override
    public void perform() {
        System.out.println("Greet hello world");
    }
}
