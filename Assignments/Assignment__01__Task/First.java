import java.util.Scanner;
public class First {
    Node head;
    static  int num1=0;
    static int num2=0;
void Add(int data){
    Node newNode=new Node(data);
    newNode.next=head;
    head=newNode;
}
void Print(){
    if(head==null){
        System.out.println("Node is empty ");
    }else{
        Node temp=head;
        while (temp!=null){
            num1++;
            System.out.print(temp.data+"  ");
            temp=temp.next;
        }
        System.out.println();
    }}

    void FromLast(int data){
        if(head==null){
            System.out.println("List is empty ");
        }else{
            Node temp=head;
            while (temp!=null){
                num2++;
                if(num2==num1-(data-1))
                System.out.print("From Last side your Index value is :"+temp.data);
                temp=temp.next;
            }
            System.out.println();
        }
}
public static void main(String args[]){
    Scanner obj=new Scanner(System.in);
    int num;
    First F1=new First();
    F1.Add(2);
    F1.Add(5);
    F1.Add(6);
    F1.Add(9);
    F1.Add(8);
    System.out.println("Linked list is :");
    F1.Print();
    System.out.println("Please Enter your Index which you want to find:");
    num=obj.nextInt();
    F1.FromLast(num);
}
}
