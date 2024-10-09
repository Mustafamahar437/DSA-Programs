public class Fourth {
    Node head;
    void Add(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    void print(){
        if(head==null){
            System.out.println("linkedlist is empety:");
        }else
        {
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
    }
    public void DouplicateRemove(){
        if(head==null){
            System.out.println("Linked List is empty:");
        }else{
            Node temp=head;

         while (temp != null) {
        Node runner = temp;
        while (runner.next != null) {
                if (runner.next.data == temp.data) {

                     runner.next = runner.next.next;
                        } else {
                                 runner = runner.next;
                }         }
             temp = temp.next;
                                        }
         Node temp1=head;
        while (temp1!=null){
            System.out.print(temp1.data+" ");
            temp1=temp1.next;
 }    }   }
    public static void main(String args[]){
        Fourth F1=new Fourth();
        F1.Add(12);
        F1.Add(13);
        F1.Add(13);
        F1.Add(15);
        System.out.println("Befor removing douplication ");
        F1.print();
        System.out.println();
        System.out.println("After removing douplication ");
        F1.DouplicateRemove();
    }
}
