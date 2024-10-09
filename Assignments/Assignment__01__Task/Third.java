public class Third {
    Node head;
    static int num1=0;
    static int num2=0;
    int array[]=new int[5];
    void Add(int data){
        Node newNOde=new Node(data);
        newNOde.next=head;
        head=newNOde;
    }
    void Print() {
        if (head == null) {
            System.out.println("Linked list is empty");
        } else {
            Node temp = head;
            while (temp != null) {
                num1++;
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }}
    void PrintReversed () {
        if (head == null) {
            System.out.println("Linked list is empty");
        } else {
            Node temp = head;

            while (temp != null) {
                array[num2++]= temp.data;
                temp = temp.next;
            }
            int num=num2;
            Node temp1=head;
            for(int i=num-1;i>=0;i--){
                temp1.data=array[i];
                temp1=temp1.next;
            }
            Node temp2=head;
            while (temp2!=null){
                System.out.print(temp2.data+" ");
                temp2=temp2.next;
            }
        }
    }
    public static void main (String args[]){
        Third T1 = new Third();
        T1.Add(2);
        T1.Add(3);
        T1.Add(6);
        T1.Add(10);
        System.out.println("Befor Reversing values :");
        T1.Print();
        System.out.println();
        System.out.println("After Reversing Values :");
        T1.PrintReversed();
    }
}
