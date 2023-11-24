package Streams;

@FunctionalInterface
public interface FuntionalTest
{
    public int giveMeValues(int a, int b);
}
class MSAD {
    public MSAD(FuntionalTest f) {
    }
    public MSAD( ) {
    }

    public static void main(String[] args) {
        MSAD m = new MSAD((a,b) -> a+b);

    }


}