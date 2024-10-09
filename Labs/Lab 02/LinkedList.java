public class LinkedList {
    Node head;
    Node tail;
    void AddElement(int data){
        Node node=new Node(data);
        if(head==null){
            head=tail=node;}
            else{
                tail.next=node;
                tail=node;
        }
    }
    void print(){
        if(head==null){
            System.out.println("linklist is empty");

        }else {
            Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
    }
    void Search(int data){
        Node temp=head;
        while(temp!=null){
            if(temp.data==data){
                System.out.print("Element is Found :"+ temp.data);
                break;
            }
            temp=temp.next;
            if(temp.data!=data){
                System.out.println("Element is not found");
            }
        }
    }
    public static void main(String args[]){
        LinkedList link=new LinkedList();
        link.print();
        link.AddElement(5);
        link.AddElement(10);
        link.AddElement(15);
        link.print();
        System.out.println();
       link.Search(10);
    }
}