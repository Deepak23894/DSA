package StackDS;

public class StackTest
{
    public static void main(String[] args) throws Exception {
//        StackDataStructure st =new StackDataStructure();
//        st.push(10);
//        st.push(20);
//        st.push(30);
//        st.push(40);
//        st.push(50);
//        st.push(60);
//        st.push(70);
//        st.push(80);
//        st.push(90);
//        st.push(100);
//        try {
//            st.push(110);
//
//        }
//        catch(Exception e)
//        {
//            e.getMessage();
//            st.pop();
//            System.out.println(st.peek());
//        }
        DynamicStack s1 =new DynamicStack(5);
        System.out.println(s1.getCapacity());
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.push(50);
        s1.push(50);
        s1.display();

    }
}
