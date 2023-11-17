package StackDS;

public class DynamicStack extends StackDataStructure
{
    public DynamicStack() throws Exception {
        this(DEFAULT_CAPACITY);
    }

    public DynamicStack(int defaultCapacity) throws Exception {
        super(defaultCapacity);
    }
    public void push(int item) throws Exception {
        if(getSize()==data.length)
        {
          int[] temp = new int[2 * data.length];
          for(int i=0; i<data.length;i++)
          {
              temp[i]= data[i];
          }
          data=temp;
        }
        super.push(item);
    }
}
