package StackDS;

public class StackDataStructure
{
    protected int[] data;
    protected int top;
    public static final int DEFAULT_CAPACITY= 10;
    public StackDataStructure()
    {
        data = new int[DEFAULT_CAPACITY];
        top = -1;
    }
    public StackDataStructure(int capacity) throws Exception {
        if(capacity<1)
        {
            throw new Exception("Enter valid Value");
        }
        data = new int[capacity];
        top = -1;
    }
    public int getCapacity()
    {
        return data.length;
    }
    public int getSize()
    {
        return top+1;
    }
    public boolean isEmpty()
    {
        return getSize() == 1;
    }
    public void push(int item) throws Exception {
        if(getSize()==data.length)
        {
            throw new Exception("Stack is FULL");
        }
        top++;
        data[top]=item;
    }
    public int pop() throws Exception{
        if(getSize()==0)
        {
            throw new Exception("Stack is Empty");
        }
        int ans = data[top];
        data[top]= 0;
        top--;
        return ans;
    }
    public int peek()
    {
        return data[top];
    }
    public void display()
    {
        for(int h=getSize()-1;h>=0;h--)
        {
            System.out.println(data[h]);
        }
        System.out.println();
    }
}
