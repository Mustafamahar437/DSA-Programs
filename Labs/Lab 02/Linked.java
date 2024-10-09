/*
public class Linked {
    Node head;
    Node tail;
    public void Add(int data){
        Node newNode=new Node(data);
//        if(head==null)
//            head==newNode;
        newNode.next=head;
        head=newNode;
    }
    public void Last(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
                    }
        else {
       tail.next=newNode;
       tail=newNode;

        }}
    public void print()
    {
        if(head==null){
            System.out.println("Linked list is empety :");
        }
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String args[]){
        Linked l=new Linked();
        l.Add(5);
        l.Add(10);
        l.Add(20);
        l.print();
        l.Last(12);
        l.print();

    }
}*/
