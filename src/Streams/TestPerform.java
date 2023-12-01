package Streams;

public class TestPerform {
    public void greet(Greeter g) {
        g.perform();
    }

    public static void main(String[] args) {
        TestPerform t = new TestPerform();
        t.greet(new Greeter());
    }
}
