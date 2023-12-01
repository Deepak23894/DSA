package LinkedListDatastructure;

public class LinkedListImplementation
{
    private int size;
    private Node head;
    private Node tail;
    public LinkedListImplementation()
    {
        head = tail = null;
        this.size = 0;
    }
    public void addFirst(int data)
    {
        Node n = new Node(data);
        n.next = head;
        head = n;
        if(size == 0){
            tail=head;
        }
        size++;
    }
    public void display()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println();
    }
    public int getFirst() throws CustomException {
        if(size == 0)
            throw new CustomException("LinkedList is Empty!");
        return head.data;
    }
    public int getLast() throws CustomException {
        if(size == 0)
            throw new CustomException("LinkedList is Empty!");
        return tail.data;
    }
    public int getAt(int idx) throws CustomException {
        if(idx>size|| idx<0){
            throw new CustomException("Custom Index out of Bound");
        }
        else if(idx == 0)
        {
            return getFirst();
        }
        else if(idx==size-1)
        {
            return getLast();
        }else{
            Node temp = head;
            for(int i=1;i<=idx-1;i++)
            {
                temp=temp.next;
            }
            return temp.data;
        }
    }
    public void addLast(int data)
    {
        Node n = new Node(data);
        if(size == 0)
        {
            head=tail=n;
        }
        tail.next=n;
        tail=tail.next;
        size++;
    }
    public void addAt(int data, int idx) throws Exception
    {
        Node n= new Node(data);
        if(idx>size|| idx<0){
            throw new CustomException("Custom Index out of Bound");
        }
        else if(idx == 0)
        {
            addFirst(data);
        }
        else if(idx==size)
        {
            addLast(data);
        }
        else{
            Node temp = head;
            for(int i =1;i<=idx-1;i++)
            {
                temp=temp.next;
            }
            n.next= temp.next;
            temp.next=n;
            size++;
        }


    }
    public int removeFirst() throws CustomException {
        if(size == 0)
        {
            throw new CustomException("Empty LinkedList!");
        }
        int output = head.data;

        if(size == 1){
            head = tail= null;
            size=0;
        }
        else{
            head= head.next;
            size--;
        }
        return output;
    }
    public int removeLast() throws CustomException {
        if(size == 0)
        {
            throw new CustomException("Empty LinkedList!");
        }
        int output = tail.data;
        if(size == 1){
            head = tail= null;
            size=0;
        }
        else {
            Node temp = head;
            while(temp.next!= tail)
            {
                temp= temp.next;
            }
            temp.next=null;
            tail=temp;
            size--;
        }
        return output;
    }
    public int removeAt(int idx) throws CustomException {
        if(idx == 0 ||idx <-1)
        {
            throw new CustomException("Empty list");
        }
        else if(idx==1)
        {
            return  removeFirst();
        }
        else if(idx == size-1)
        {
            return removeLast();
        }
        else{
            Node temp = head;
            for(int i= 1;i<=idx-1;i++)
            {
                temp= temp.next;
            }
            Node output=temp.next;
            temp.next= output.next;
            size--;
            return output.data;

        }
    }
    public void clearAll()
    {
        head=null;
    }
}
class CustomException extends Exception{
    public CustomException(String msg)
    {
        super(msg);
    }
}
