package StackDS;

public class QueueDS {

    private int[] arr;
    private int size;
    private int front;
    public static final int DEFAULT_CAPACITY = 10;

    public QueueDS() throws Exception {
        this(DEFAULT_CAPACITY);
    }

    public QueueDS(int capacity) throws Exception {
        if (capacity < 1) {
            throw new Exception("Invalid value");
        }
        this.size = 0;
        this.front = 0;
        this.arr = new int[capacity];
    }

    public int getSize() {
        return this.size;
    }

    public void enqueue(int item) throws Exception {
        if (getSize() == this.arr.length) {
            throw new Exception("Queue is FULL");
        }
        int rear = (this.front + this.size) % this.arr.length;
        this.arr[rear]=item;
        this.size++;
    }
    public int dequeue() throws Exception {
        if(getSize()==0)
        {
           throw new Exception("queue is empty");
        }
        int ans = this.arr[this.front];
        this.front = (this.front+1)%this.arr.length;
        this.size--;
        return ans;
    }
    public int peek() throws Exception {
        if(this.size == 0)
        {
            throw new Exception("Empty");
        }
        return this.arr[front];
    }
    public void display()
    {
        for(int i=0;i<this.size;i++)
        {
            int idx= (this.front+i)%this.arr.length;
            System.out.print(this.arr[idx]+" ");
        }
        System.out.println();
    }


}
