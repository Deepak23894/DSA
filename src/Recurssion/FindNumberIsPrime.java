
package  Recurssion;

public class FindNumberIsPrime {
    public static void main(String[] args){
        boolean flag = false;
        System.out.println("Enter input number");
        int num = 7;
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                flag = true;
                break;
            }

        }
        if(!flag){
            System.out.println(num + " is a prime number");
        } else{
            System.out.println(num + " is not a prime number");
        }
    }
    public void main(String args)
    {

    }
}