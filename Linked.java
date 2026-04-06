class Node
{
    int  data;
    Node next;
    Node(int  data){
        this.data=data;
        this.next=null;
    }
}
class LinkedList
{
    Node head;
    Node tail;
    public void insertAtFirst(int data){
        Node nn=new Node(data);
        nn.next=head;
        head=nn;
    }
    public void insertLast(int data)
    {
        Node nn=new Node(data);
        Node temp=head;
        if(head==null){
            head=nn;
            return;
        }
        while(temp.next != null){
            temp=temp.next;
        }
        temp.next=nn;
        nn.next=null;
    }
    public void insAtpos(int pos,int data){
        if(pos==0){
            insertAtFirst(data);
            return;
        }
        Node nn = new Node(data);
        Node temp=head;
        for(int i=0;i<pos-1;i++)
        {
            if(temp.next == null) return;
            temp=temp.next;
        }
        nn.next=temp.next;
        temp.next=nn;
    }
    public void delAtStart()
    {
        if(head==null)
            return;
        head=head.next;
    }
    public void delAtEnd()
    {
        Node temp=head;
        if(head == null) return;
        if(head.next ==null){
            head=null;
        } 
        while(temp.next.next != null){
            temp=temp.next;
        }
        temp.next=null;
    }
    public void DelAtPos(int pos){
        if(head == null ) return;
        if(pos==0) head=head.next;
        Node temp=head;
        for(int i=0;i<pos-1;i++){
            if(temp.next == null) return;
            temp=temp.next;
        }
            if(temp.next != null){
                temp.next=temp.next.next;
            }
    }
    public void display()
    {
        Node temp=head;
        while(temp.next != null){
            System.out.println(temp.data + "->");
            temp=temp.next;
        }
        System.out.println(temp.data);
        System.out.println("null");
    }
}
public class Linked 
{
    public static void main(String[] args){
        LinkedList list=new LinkedList();
        list.insertAtFirst(29);
        list.insertLast(34);
        list.display();
        list.delAtEnd();
        System.out.println("After deleting");
        list.display();
    }
}
