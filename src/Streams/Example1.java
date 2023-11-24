package Streams;
/*
* Funtional interface:
* an interface which contains only one abstract method is called as functional interface,it may contain implemented methods
*
*
*
*
*
*
*
* */

public class Example1
{
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("normal run implementation");
            }
        });
        t1.run();
        Thread t2 = new Thread(() -> System.out.println("lamda implementaion")) ;
        t2.run();
    }
}
