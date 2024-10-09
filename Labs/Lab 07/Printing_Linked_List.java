public class Printing_Linked_List {
int data;
static Node head;
public void Add(int data){
    Node newNode=new Node(data);
    if(head==null){
        head=newNode;
    }else {
        newNode.next=head;
        head=newNode;
    }
}
public void PrintLoop(){
    if(head==null){
        System.out.println("Linked list is empty");
    }else {
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}

    public void PrintRecursion(Node head){
        if(head==null){
            return;
        }else {
            Node temp=head;

                System.out.print(temp.data+" ");
                PrintRecursion(temp.next);
            }
        }


    public static void main(String args[]){
        Printing_Linked_List PLL=new Printing_Linked_List();
        for(int i=1;i<=10;i++){
        PLL.Add(i+1);
    }
        System.out.println("Printing LinkedLists by Loop");
        long start=System.nanoTime();
        PLL.PrintLoop();
        long End=System.nanoTime();
        long Total=End-start;
        System.out.println();
        System.out.println("Time Take :"+Total);
        System.out.println();
        System.out.println("Printing LinkedLists by Recursion");
        long start1=System.nanoTime();
        PLL.PrintRecursion(head);
        long End1=System.nanoTime();
        long Total1=End1-start1;
        System.out.println();
        System.out.println("Time Take :"+Total1);
        System.out.println();
        System.out.println();

}
}
