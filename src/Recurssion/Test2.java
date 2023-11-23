package Recurssion;

public class Test2
{
     int i ;
     String ed = "10";

     public Test2(int i){
         this.i = i;
     }
     void test2(){
    System.out.println(i*10);
}

}
class Test3 extends Test2
{
    Test3()
    {
        super(10);
    }
    void test4()
    {
        super.test2();
        System.out.println(i*70);
    }


    public static void main(String[] args) {
        Test3 t = new Test3();
        t.test4();
    }
}
