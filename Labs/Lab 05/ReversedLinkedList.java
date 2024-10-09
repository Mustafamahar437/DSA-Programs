public class ReversedLinkedList {
    int data;
    Node head;
    public void Add(int data){
        Node NewNode=new Node(data);
        if(head==null){
            head=NewNode;
        }
        else {
        NewNode.next=head;
        head=NewNode;
    }}
    public void Print(){
        if(head==null){
            System.out.println("this is empty");
        }else {
            Node temp1=head;
            System.out.print("Befor Revered values: ");
            while (temp1!=null){
                System.out.print(temp1.data+" ");
                temp1=temp1.next;
            }
            System.out.println();
            Node curent=head,cnext,pre=null;
            while (curent!=null){
                cnext=curent.next;
                curent.next=pre;
                pre=curent;
                 curent=cnext;
               }
            head=pre;
            Node temp=head;
            System.out.print("After Revered values: ");
            while (temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
    }
public static  void  main(String arg[]){
        ReversedLinkedList RL=new ReversedLinkedList();
        RL.Add(12);
        RL.Add(15);
        RL.Add(20);
        RL.Add(25);
        RL.Add(30);
        RL.Print();
    }
}
